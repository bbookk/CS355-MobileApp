package com.example.asus.assignment1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText) findViewById(R.id.editname);
        final EditText lname = (EditText) findViewById(R.id.editlastname);
        final EditText mail = (EditText) findViewById(R.id.editemail);
        final EditText age = (EditText) findViewById(R.id.editage);
        final EditText phone = (EditText) findViewById(R.id.editno);
        final Button submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                String value = name.getText().toString();
                String value2 = lname.getText().toString();
                String value3 = mail.getText().toString();
                String regexCheckMail = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                if(!value3.matches(regexCheckMail) || value3.length() == 0) {
                    mail.setError("Email format is not valid");
                }
                String value4 = age.getText().toString();
                i.putExtra("extra4", value4);

                String value5 = phone.getText().toString();
                if (phone.getText().length() != 10) {
                    phone.setError("Invalid format");
                }
                if (!(Character.isUpperCase(value.charAt(0)) && Character.isUpperCase(value2.charAt(0)))) {
                    name.setError("First letter should be capital letter");
                    lname.setError("First letter should be capital letter");
                }
                String regex = "^\\d{10}$";
                if (value5.matches(regex) && Character.isUpperCase(value.charAt(0))
                        && Character.isUpperCase(value2.charAt(0)) && value3.matches(regexCheckMail) || value3.length() == 0) {
                    i.putExtra("extra", value);
                    i.putExtra("extra2", value2);
                    i.putExtra("extra3", value3);
                    i.putExtra("extra5", value5);
                    startActivity(i);
                }
            }
        });
    }
}
