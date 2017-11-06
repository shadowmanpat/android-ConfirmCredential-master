package com.example.android.confirmcredential;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;

public class PickLock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_lock);


        Button pattern=(Button) findViewById(R.id.pattern);
        pattern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                patternLock();
            }
        });
        Button finger=(Button) findViewById(R.id.fingerPrint);
        finger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fingerLock();
            }
        });

    }

    public static String encrypt(String input) {
        // This is base64 encoding, which is not an encryption
        return Base64.encodeToString(input.getBytes(), Base64.DEFAULT);
    }

    public static String decrypt(String input) {
        return new String(Base64.decode(input, Base64.DEFAULT));

    }

    public void patternLock(){

    }

    public void fingerLock(){

    }
}
