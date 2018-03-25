package com.abc.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class ActivityClass2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class2);

        // Capture the trigger intent which started this activity
        Intent i = getIntent();
        String mesg = i.getStringExtra("USER_INPUT");
        TextView txtDisplay = findViewById(R.id.txtv_page2);
        txtDisplay.setText(mesg);
    }

    public void launchThirdPage(View view) {
        Intent i = new Intent(this, ActivityClass3.class);
        startActivity(i);
    }


}
