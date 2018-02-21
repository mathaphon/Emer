package com.example.com_it.test.fagment;

import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.com_it.test.R;

import org.w3c.dom.Text;

/**
 * Created by COM_IT on 2/20/2018.
 */

public class MainFragment extends Fragment{

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

                Log.d(tag, "you Cllck lmage Statlon1");


            }
        });

        TextView stationlTextView = getView().findViewById(R.id.textViewStation1);
        stationilmageViaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Cllck Trxt ") + getString(R.string.station1));

            }
        });
        //        For Station 2

        //        For Station 3

        //        For Station 4

    } //Main Method

    public void callStation(String numberCall) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police,container, false);
        return view;
    }


} // Main Class```
