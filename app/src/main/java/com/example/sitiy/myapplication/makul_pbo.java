package com.example.sitiy.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

public class makul_pbo extends Fragment {

    Fragment fragment = null;
    FragmentManager fragmentManager;
    public makul_pbo(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.makul_pbo, container, false);

        Button b1 = view.findViewById(R.id.peserta);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment = new daftarpeserta();
                callFragment(fragment);
            }
        });

        getActivity().setTitle("Pemrograman Berorientasi Objek");

        return view;
    }

    private void callFragment(Fragment fragment) {
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }

}
