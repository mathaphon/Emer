package com.example.com_it.test;

import android.content.res.Configuration;
import android.graphics.drawable.DrawableWrapper;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.com_it.test.fagment.HospiatalFragment;
import com.example.com_it.test.fagment.MainFragment;
import com.example.com_it.test.utility.HospitalAdapter;

public class MainActivity extends AppCompatActivity {

    //    Explicit
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Police Controller
        TextView policeTextView = findViewById(R.id.txtPolice);

//      Hospital Controller
        policeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new MainFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });
//      Hospital Controller
        TextView hospitalTextView = findViewById(R.id.txtHospital);
        hospitalTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contentMainFragment,new HospiatalFragment()).commit();
                drawerLayout.closeDrawers();
            }
        });


//      Instance Controller

//      Exit Controller



//        Create TooLbar

           Toolbar toolbar = findViewById(R.id.toolbarMain);
           setSupportActionBar(toolbar);
           getSupportActionBar().setHomeButtonEnabled(true);
           getSupportActionBar().setDisplayHomeAsUpEnabled(true);
           drawerLayout = findViewById(R.id.drawerLayoutMain);
           actionBarDrawerToggle = new ActionBarDrawerToggle(
                   MainActivity.this,
                   drawerLayout,
                   R.string.open,
                   R.string.close
           );

                   drawerLayout.setDrawerListener(actionBarDrawerToggle);




        //     Add Fragment
        if (savedInstanceState==null) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment()).commit();
        }


    } // Main Method

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
            return super.onOptionsItemSelected(item);


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        actionBarDrawerToggle.onConfigurationChanged(newConfig);

    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        actionBarDrawerToggle.syncState();
    }
}
 // Main Class
