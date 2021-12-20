package com.example.socialmediaintegration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  static  final int TIME_INTERVAL=2000; //setting the time interval of 2s between two back clicks
    private long backpressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fb(View view) {
        Intent intent=new Intent(this,WebView1.class);
        startActivity(intent);
    }

    public void insta(View view) {
        Intent intent=new Intent(this,WebView2.class);
        startActivity(intent);
    }

    public void linkedin(View view) {
        Intent intent=new Intent(this,WebView3.class);
        startActivity(intent);
    }

    public void twitter(View view) {
        Intent intent=new Intent(this,WebView4.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed(){
        if (backpressed+TIME_INTERVAL>System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();
        }
        backpressed=System.currentTimeMillis();
    }

}