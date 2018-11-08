package com.example.sitiy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class matkul extends AppCompatActivity {
    private boolean table_flg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matkul);
    }

    public void collapseTable(View view) {
        TableLayout table = findViewById(R.id.table);
        Button switchBtn = findViewById(R.id.switchBtn);

        // setColumnCollapsed
        table.setColumnCollapsed(1, table_flg);
        table.setColumnCollapsed(2, table_flg);

        if (table_flg == false) {
            //close
            table_flg = false;
            switchBtn.setText("Lihat Semua Peserta");

        } else {
            //open
            table_flg = true;
            switchBtn.setText("Hide Details");


        }
    }
}
