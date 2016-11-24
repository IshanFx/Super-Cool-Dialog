package com.cooldialog.cooldialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cooldialog.supercooldialog.FlatImageDialog;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class MainActivity extends AppCompatActivity  {
    FlatImageDialog flatImageDialog;
    FlatImageDialog flatImageDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flatImageDialog = new FlatImageDialog(this);
        flatImageDialog2 = flatImageDialog;
        flatImageDialog.message("haai");
        flatImageDialog.backgroundColor(R.color.colorAccent);

        flatImageDialog.setCancelClickListner(new FlatImageDialog.OnCoolDialogClickListner() {
            @Override
            public void onClick(AlertDialog flatImageDialog) {
                flatImageDialog.dismiss();
            }
        });
        flatImageDialog.show();

        new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure?")
                .setContentText("Won't be able to recover this file!")
                .setConfirmText("Yes,delete it!")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.dismissWithAnimation();
                    }
                })
                .show();
    }
}
