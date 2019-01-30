package com.example.aksha.subwayorderingsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView mDisplay,textView;
    String s1="",s2="",s3="",s4="",s5="",final_string="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        mDisplay=(TextView)findViewById(R.id.display);
        textView=(TextView)findViewById(R.id.textView);
        Intent i=getIntent();
        s1=i.getStringExtra("mychoice1");
        s2= i.getStringExtra("mychoice2");
        s3=i.getStringExtra("myvegetables");
        s4=i.getStringExtra("myaddons");
        s5=i.getStringExtra("mysauces");
        final_string="Bread:\n"+s1+"\n"+"\n"+"Cheese & Toast:\n"+s2+"\n"+"\n"+"Vegetables:\n"+s3+"\n"+"Sauces:\n"+s5+"\n"+s4;
        mDisplay.setText(final_string);

    }
}
