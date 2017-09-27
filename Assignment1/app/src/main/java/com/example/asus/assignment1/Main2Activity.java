package com.example.asus.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtname = (TextView) findViewById(R.id.txtname);
        String extra = getIntent().getStringExtra("extra");
        txtname.setText(extra);

        TextView txtlname = (TextView) findViewById(R.id.txtlastname);
        String extra2 = getIntent().getStringExtra("extra2");
        txtlname.setText(extra2);

        TextView txtemail = (TextView) findViewById(R.id.txtemail);
        String extra3 = getIntent().getStringExtra("extra3");
        txtemail.setText(extra3);

        TextView txtage = (TextView) findViewById(R.id.txtage);
        String extra4 = getIntent().getStringExtra("extra4");
        txtage.setText(extra4);

        TextView txtphone = (TextView) findViewById(R.id.txtno);
        String extra5 = getIntent().getStringExtra("extra5");
        txtphone.setText(extra5);

        if (Integer.valueOf(txtage.getText().toString()) < 16 && Integer.valueOf(txtage.getText().toString()) >= 0) {
            ImageView imgView = (ImageView) findViewById(R.id.imgView);
            imgView.setImageResource(R.drawable.child2);
            imgView.getLayoutParams().height = (int) getResources().getDimension(R.dimen.img_h);
            imgView.getLayoutParams().width = (int) getResources().getDimension(R.dimen.img_w);
        }

        if (Integer.valueOf(txtage.getText().toString()) >= 16 && Integer.valueOf(txtage.getText().toString()) < 26) {
            ImageView imgView = (ImageView) findViewById(R.id.imgView);
            imgView.setImageResource(R.drawable.teen);
            imgView.getLayoutParams().height = (int) getResources().getDimension(R.dimen.img_h);
            imgView.getLayoutParams().width = (int) getResources().getDimension(R.dimen.img_w);
        }

        if (Integer.valueOf(txtage.getText().toString()) >= 26 && Integer.valueOf(txtage.getText().toString()) < 61) {
            ImageView imgView = (ImageView) findViewById(R.id.imgView);
            imgView.setImageResource(R.drawable.work);
            imgView.getLayoutParams().height = (int) getResources().getDimension(R.dimen.img_h);
            imgView.getLayoutParams().width = (int) getResources().getDimension(R.dimen.img_w);
        }

        if (Integer.valueOf(txtage.getText().toString()) >= 61 && Integer.valueOf(txtage.getText().toString()) < 151) {
            ImageView imgView = (ImageView) findViewById(R.id.imgView);
            imgView.setImageResource(R.drawable.old);
            imgView.getLayoutParams().height = (int) getResources().getDimension(R.dimen.img_h);
            imgView.getLayoutParams().width = (int) getResources().getDimension(R.dimen.img_w);
        }

    }
}
