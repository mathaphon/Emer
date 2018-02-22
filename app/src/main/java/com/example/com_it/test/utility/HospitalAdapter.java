package com.example.com_it.test.utility;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.com_it.test.R;

import java.net.ContentHandler;

/**
 * Created by COM_IT on 2/22/2018.
 */

public class HospitalAdapter extends BaseAdapter{

//    Expllcit
    private Context context;
    private int[] intes;
    private String[] titleStrings, phonesStrings;

    public HospitalAdapter(Context context, int[] intes, String[] titleStrings, String[] phonesStrlngs) {
        this.context = context;
        this.intes = intes;
        this.titleStrings = titleStrings;
        this.phonesStrings = phonesStrlngs;
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
        View view1 = layoutInflater.inflate(R.layout.listview_layout, viewGroup,false);

        ImageView imageView = view1.findViewById(R.id.imageListView);
        TextView titleTextView = view1.findViewById(R.id.textViewTitle);
        TextView phoneTextView = view1.findViewById(R.id.textViewPhone);

        imageView.setImageResource(intes[i]);
        titleTextView.setText(titleStrings[i]);
        phoneTextView.setText(phonesStrings[i]);




        return view1;
    }
}  // Main Class

