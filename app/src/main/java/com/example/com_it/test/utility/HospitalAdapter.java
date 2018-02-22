package com.example.com_it.test.utility;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.net.ContentHandler;

/**
 * Created by COM_IT on 2/22/2018.
 */

public class HospitalAdapter extends BaseAdapter{

//    Expllcit
    private Context context;
    private int[] intes;
    private String[] titleStrings, phonesStrlngs,

    public HospitalAdapter(Context context, int[] intes, String[] titleStrings, String[] phonesStrlngs) {
        this.context = context;
        this.intes = intes;
        this.titleStrings = titleStrings;
        this.phonesStrlngs = phonesStrlngs;
    }

    @Override
    public int getCount() {
        return  intes.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);



        return null;
    }
}  // Main Class

