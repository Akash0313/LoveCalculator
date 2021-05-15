package com.example.lovecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class Home extends AppCompatActivity {
    TextView boy,girl,result;
    Button calculate;
    LinearLayout rl;
    Boolean ch=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home);
        boy=findViewById(R.id.boy);
        girl=findViewById(R.id.girl);
        calculate=findViewById(R.id.calculate);
        result=findViewById(R.id.result);
        rl=findViewById(R.id.mainlayout);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1,p2;
                p1=boy.getText().toString();
                p2=girl.getText().toString();
ch=false;
                Random random=new Random();
                Integer resultt=random.nextInt(99);
                rl.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText(resultt.toString()+"%");
            }
        });
    }

    @Override
    public void onBackPressed() {
    if(ch){
        super.onBackPressed();

    }else{
        rl.setVisibility(View.VISIBLE);
        result.setVisibility(View.GONE);

    }
    }
}
