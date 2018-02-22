package com.example.com_it.test.fagment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.com_it.test.R;
import com.example.com_it.test.utility.HospitalAdapter;


/**
 * Created by COM_IT on 2/22/2018.
 */

public class HospiatalFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create ListView
        ListView listView = getView().findViewById(R.id.ListViewHopotal);
        int[] ints = new int[]{R.drawable.station1, R.drawable.station2,
                R.drawable.station3, R.drawable.station4, R.drawable.station1,
                R.drawable.station2, R.drawable.station3, R.drawable.station4};
        String[] titleStrings = new String[]{"Hospial 1", "Hospial 2",
                "Hospial 1", "Hospial 1", "Hospial 1",
                "Hospial 3", "Hospial 4", "Hospial 5"};

        String[] phoneStrings = new String[]{"1111", "1112", "1113", "1114", "1115",
                "1116", "1117", "1118"};

        HospitalAdapter hospitalAdapter = new HospitalAdapter(getActivity(), ints, titleStrings, phoneStrings);
        listView.setAdapter(hospitalAdapter);


    } // Main Method




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hospital,container,false);
        return view;
    }
} // Main Class
