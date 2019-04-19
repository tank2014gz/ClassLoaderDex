package com.dr.classloaderloaddex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ClassLoader classLoader = getClassLoader();
        System.out.println(classLoader.getClass());
        System.out.println(classLoader.getParent().getClass());
        System.out.println(classLoader.getParent().getParent().getClass());
    }
}
