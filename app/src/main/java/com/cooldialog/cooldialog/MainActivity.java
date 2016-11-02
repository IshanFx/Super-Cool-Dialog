package com.cooldialog.cooldialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cooldialog.supercooldialog.DialogMaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogMaster dialogMaster = new DialogMaster(this);
        dialogMaster.loadIdeaSubmitStatusDialog(true);
    }
}
