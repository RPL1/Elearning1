package com.example.sitiy.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class daftarpeserta extends Fragment {
    public daftarpeserta(){}
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (View) inflater.inflate(R.layout.pesertakelas, container, false);


        getActivity().setTitle("Kecerdasan Buatan");

        return view;
    }


}
