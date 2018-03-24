package com.example.ryan.activitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        Bundle b = getIntent().getExtras();
        TextView name = (TextView) findViewById(R.id.nameValue);
        TextView address = (TextView) findViewById(R.id.addressValue);
        TextView email = (TextView) findViewById(R.id.emailValue);
        TextView phone = (TextView) findViewById(R.id.phoneValue);
        TextView gender = (TextView) findViewById(R.id.genderValue);

        name.setText(b.getCharSequence("name"));
        address.setText(b.getCharSequence("address"));
        email.setText(b.getCharSequence("email"));
        phone.setText(b.getCharSequence("phone"));
        gender.setText(b.getCharSequence("gender"));
    }
}