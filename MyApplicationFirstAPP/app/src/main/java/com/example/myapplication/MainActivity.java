package com.example.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private static final int SHOW_SUBACTIVITY = 1;
    List palabras = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        palabras.add("Jibiri");
        palabras.add("Payaso");
        palabras.add("K pachao");
        palabras.add("Wuamos");
    }

    public void showMessage(View view){
        TextView textView = ((TextView) findViewById(R.id.text01));

        textView.setTextSize((float)Math.random()*200);
        textView.setText(palabras.get( (int)(Math.random()*palabras.size())).toString() );
    }

    public void addNewWord(View view){
        Intent intent = new Intent(this, Main2Activity.class);

        startActivityForResult(intent,SHOW_SUBACTIVITY);
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == Activity.RESULT_OK) {
            Bundle bundle = data.getExtras();
            String newPalabra = bundle.getString("texto");
            palabras.add(newPalabra);
        }
    }
}
