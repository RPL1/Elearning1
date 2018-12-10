package com.example.sitiy.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class makul_pbo extends Fragment {
    public makul_pbo(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.makul_pbo, container, false);

        getActivity().setTitle("Pemrograman Berorientasi Objek");

        return view;
    }

}
