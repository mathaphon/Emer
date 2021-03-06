package com.example.com_it.test.fagment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.ConsumerIrManager;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.MalformedJsonException;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.com_it.test.MainActivity;
import com.example.com_it.test.R;

import org.w3c.dom.Text;

/**
 * Created by COM_IT on 2/20/2018.
 */

public class MainFragment extends Fragment {

    //    Expliclt
    private String tag = "myTagV1";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //        For Station 1
        ImageView stationilmageViaw = getView().findViewById(R.id.imageViewStation1);
        stationilmageViaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "you Click lmage Station1");
                callStation("1111");


            }
        });

        TextView stationlTextView = getView().findViewById(R.id.textViewStation1);
        stationilmageViaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callStation("1111");
            }
        });
        //        For Station 2
        ImageView Station2ImageView = getActivity().findViewById(R.id.imageViewStation2);
        Station2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callStation("2222");
            }
        });
        TextView station2TextView = getView().findViewById(R.id.textViewStation2);
        station2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("2222");
            }
        });

        //        For Station 3
        ImageView Station3ImageView = getActivity().findViewById(R.id.imageViewStation3);
        Station3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callStation("3333");
            }
        });
        TextView station3TextView = getView().findViewById(R.id.textViewStation3);
        station3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("3333");
            }
        });

        //        For Station 4
        ImageView Station4ImageView = getActivity().findViewById(R.id.imageViewStation4);
        Station4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callStation("4444");
            }
        });
        TextView station4TextView = getView().findViewById(R.id.textViewStation4);
        station4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("4444");
            }
        });

    } //Main Method

    public void callStation(String numberCall) {

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:=" + numberCall));

        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        getActivity().startActivity(intent);


    } //callStattion

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police,container, false);
        return view;
    }


} // Main Class
