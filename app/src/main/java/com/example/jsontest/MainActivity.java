package com.example.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     String userName,pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login=findViewById(R.id.login);
        EditText userEdit=findViewById(R.id.editTextTextPersonName);
        EditText pwdEdit=findViewById(R.id.editTextTextPassword);
        userName=userEdit.getText().toString();
        pwd=pwdEdit.getText().toString();
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //1.判断是否为空
        if (!TextUtils.isEmpty(userName)) {
            Toast.makeText(this,"请输入用户名",Toast.LENGTH_LONG).show();
            return;
        }
        if (TextUtils.isEmpty(pwd)){
            Toast.makeText(this,"请输入密码",Toast.LENGTH_LONG).show();
            return;
        }


    }
}