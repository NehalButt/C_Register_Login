package com.example.c_register_login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_page extends AppCompatActivity {
    EditText Lusername,Lpassword;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        Lusername = (EditText) findViewById(R.id.Lusername);
        Lpassword = (EditText) findViewById(R.id.Lpassword);
        Login = (Button) findViewById(R.id.Login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent getdata = getIntent();
                String Lousername = getdata.getStringExtra("Rusername");
                String Lopassword = getdata.getStringExtra("Rpassword");
                if (Lusername.getText().toString().equals(Lousername) && Lusername.getText().toString().equals(Lopassword)){
                Intent intent= new Intent(Login_page.this,Welcome_page.class);
                intent.putExtra("Lusername",Lousername);
                startActivity(intent);
                finish();
            }
            else{
                        Toast.makeText(Login_page.this, "Invalid Email And Password", Toast.LENGTH_LONG).show();
                    }
                    }
        });

    }
}