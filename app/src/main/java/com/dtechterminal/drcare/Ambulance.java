package com.dtechterminal.drcare;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Ambulance extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance);
    }

    void callAmbulance(View view) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "102", null)));
    }
}