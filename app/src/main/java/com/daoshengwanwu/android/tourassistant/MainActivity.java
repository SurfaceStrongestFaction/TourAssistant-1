package com.daoshengwanwu.android.tourassistant;

<<<<<<< HEAD
import android.app.Activity;
=======
import android.support.v7.app.ActionBar;
>>>>>>> origin/master
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======

        ActionBar actionBar = getSupportActionBar();//删除标题栏
        if (null != actionBar) {
            actionBar.hide();
        }
>>>>>>> origin/master
    }
}