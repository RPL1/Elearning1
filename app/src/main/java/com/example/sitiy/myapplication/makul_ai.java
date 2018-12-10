package com.example.sitiy.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class makul_ai extends Fragment {
    public makul_ai(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.matkul_ai, container, false);

        getActivity().setTitle("Rekayasa Perangkat Lunak");

        return view;
    }
}
