package com.example.c_register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Welcome_page extends AppCompatActivity {
    TextView Welcomeuser;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Welcomeuser = (TextView) findViewById(R.id.WelcomeUser);
        logout = (Button) findViewById(R.id.logout);
        Intent j = getIntent();
        String user = j.getStringExtra("Lusername");
        Welcomeuser.setText("Welcome " + user);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(Welcome_page.this,MainActivity.class);
                startActivity(log);
                finish();
            }
        });
    }
}