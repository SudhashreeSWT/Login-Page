package com.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView txtLoginPage;
    EditText Username;
    EditText txtpassword;
    TextView txtforgotpassword;
    CheckBox chkbox;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLoginPage = findViewById(R.id.txtLoginpage);
        Username = findViewById(R.id.Username);
        txtpassword = findViewById(R.id.txtpassword);
        txtforgotpassword = findViewById(R.id.txtforgotpassword);
        chkbox = findViewById(R.id.chkbox);
        btnlogin = findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener()
        {
            public void openDialog()
            {
                ExampleDialog exampleDialog=new ExampleDialog();
                exampleDialog.show(getSupportFragmentManager(),"Example Dialog");
            }
            @Override
            public void onClick(View view)
            {
               if(Username.getText().toString().isEmpty())
                {
                    Toast.makeText(Login.this, "Please Enter Email-ID", Toast.LENGTH_SHORT).show();
                }
                else if (txtpassword.getText().toString().isEmpty())
                {
                    Toast.makeText(Login.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                }
                else if (!chkbox.isChecked())
                {
                    Toast.makeText(Login.this, "Please Select Forgot Password", Toast.LENGTH_SHORT).show();
                }
                else if (Username.getText().toString().equals("12345") && txtpassword.getText().toString().equals("12345"))
                {
                    Toast.makeText(Login.this, "Please Enter Correct Email-ID and Password", Toast.LENGTH_SHORT).show();
                }
//                else
//                {
//                    Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
//                }
                else
                {
                    Intent intent=new Intent(Login.this, nextPageafterlogin.class);
                    startActivity(intent);

                }

               openDialog();
            }
        });

//        public void openDialog()
//        {
//            ExampleDialog exampleDialog=new ExampleDialog();
//            exampleDialog.show(getSupportFragmentManager(),"Example Dialog");
//        }

    }
}

