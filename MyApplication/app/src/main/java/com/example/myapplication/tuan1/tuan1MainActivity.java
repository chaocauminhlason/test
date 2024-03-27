package com.example.myapplication.tuan1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.myapplication.R;

public class tuan1MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tuan1_main);
        //anh xa cac control
        txt1=findViewById(R.id.demotxt1);
        txt1=findViewById(R.id.demotxt2);
        btn1=findViewById(R.id.demobtn1);
        tv1=findViewById(R.id.demoTvn1);
        //
        btn1.setOnClicklistener(v->{
            TinhTong();
        });
        private void TinhTong(){
                string str1=txt1.getText().toString();
                float so1=Float.parseFloat(str1);// chuyen tu du lieu sang so
            string str2=txt2.getText().toString();
            float so2=Float.parseFloat(str2);
            float Tong= so1+ so2;
            tv1=setText(String.valueOf(tong));

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}