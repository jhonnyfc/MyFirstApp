package com.example.myapplication;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
    }

    public void pushWord(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        if (message.compareTo("") != 0) { //0 if is equal
            Bundle bundle = new Bundle();
            bundle.putString("texto", message);

            Intent intent = new Intent();
            intent.putExtras(bundle);
            setResult(RESULT_OK, intent);
            finish();
        }else{
            Context context = getApplicationContext();
            CharSequence text = "NO has introducido una palabra";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }
    }
}
