package com.cooldialog.cooldialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.cooldialog.supercooldialog.FlatImageDialog;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FlatImageDialog flatImageDialog = new  FlatImageDialog(this);
        flatImageDialog.message("haai");
        flatImageDialog.backGroundColor(R.color.colorAccent);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_SHORT).show();
            }
        };
        flatImageDialog.setCancelClickListner(new FlatImageDialog.OnCoolDialogClickListner() {
            @Override
            public void onClick(FlatImageDialog flatImageDialog) {
                flatImageDialog.dismissDialog();
            }
        });
        flatImageDialog.show();

       /* new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                .setTitleText("Are you sure?")
                .setContentText("Won't be able to recover this file!")
                .setConfirmText("Yes,delete it!")
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sDialog) {
                        sDialog.dismissWithAnimation();
                    }
                })
                .show();*/
    }
}
