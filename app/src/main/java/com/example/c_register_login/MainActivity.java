package com.example.c_register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Rusername,Remail,Rpassword,RCpassword;
    Button Register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Rusername = (EditText) findViewById(R.id.Rusername);
        Remail = (EditText) findViewById(R.id.Lusername);
        Rpassword = (EditText) findViewById(R.id.Lpassword);
        RCpassword = (EditText) findViewById(R.id.RCpassword);
        Register = (Button) findViewById(R.id.Login);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Ruser = Rusername.getText().toString();
                String Rpass = Rpassword.getText().toString();
                if (Rpassword.getText().toString().equals(RCpassword.getText().toString())) {
                    Intent i = new Intent(MainActivity.this, Login_page.class);
                    i.putExtra("Rusername", Ruser);
                    i.putExtra("Rpassword", Rpass);
                    startActivity(i);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this, "Password does not match", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}