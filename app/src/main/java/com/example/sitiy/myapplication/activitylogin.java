package com.example.sitiy.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class activitylogin extends AppCompatActivity {

    EditText editText1, editText2;
    String text1, text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogin);

    }

    public void loginmasuk (View view) {
        editText1 = (EditText)findViewById(R.id.editUser);
        editText2 = (EditText)findViewById(R.id.editpass);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();
        if ((text1.contains("Admin")) && ((text2.contains(("1234"))))) {
            Toast.makeText(this,"login sukses",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(activitylogin.this,welcome.class);
            startActivity(intent);
        }
        else if ((text1.matches("") || text2.matches(""))) {
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "login gagal / username dan password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
