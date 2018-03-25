package com.abc.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendButtonClicked(View view) {

        // Simply push the next activity
        //Intent i = new Intent(this, ActivityClass2.class);
        //startActivity(i);

        //OR

        // Attach some data and push it to the next activity
        EditText txtBox = findViewById(R.id.edtTxt_mesgBox);
        String mesg=txtBox.getText().toString();
        Intent i = new Intent(this, ActivityClass2.class);
        i.putExtra("USER_INPUT", mesg);
        startActivity(i);
    }
}
