package com.example.sitiy.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class makul_sim extends Fragment {
    public makul_sim(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.makul_sim, container, false);

        getActivity().setTitle("Sistem Informasi Manajemen");

        return view;
    }
}
