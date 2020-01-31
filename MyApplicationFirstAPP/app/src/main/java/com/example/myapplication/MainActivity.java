package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View view){
        List palabras = new ArrayList<String>();

        palabras.add("Jibiri");
        palabras.add("Payaso");
        palabras.add("K pachao");
        palabras.add("Wuamos");

        TextView textView = ((TextView) findViewById(R.id.text01));

        textView.setTextSize((float)Math.random()*200);
        textView.setText(palabras.get( (int)(Math.random()*palabras.size())).toString() );
    }
}
