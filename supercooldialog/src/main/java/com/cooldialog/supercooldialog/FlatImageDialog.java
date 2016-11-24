package com.cooldialog.supercooldialog;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.cooldialog.supercooldialog.callback.DialogClickListner;

/**
 * Created by IshanFx on 11/2/2016.
 */

public class FlatImageDialog extends Dialog implements View.OnClickListener {
    Context context;

    private int BACKGROUND_COLOUR = R.color.colorPrimaryDark;
    public  int IMAGE = R.drawable.ic_smile;
    private String MESSAGE = "success";
    private int BUTTON_BACKGROUND_COLOUR = R.color.blue_1;
    private int BUTTON_IMAGE = R.drawable.ic_done;
    AlertDialog alertDialog;
    private OnCoolDialogClickListner mCancelClickListner;



    public  interface OnCoolDialogClickListner{
        void onClick(AlertDialog flatImageDialog);
    }


    public FlatImageDialog(Context context){
        super(context);
        this.context = context;
    }

    public FlatImageDialog backgroundColor(int backgroundColor){
        this.BACKGROUND_COLOUR = backgroundColor;
        return this;
    }

    public FlatImageDialog image(int image){
        this.IMAGE = image;
        return this;
    }

    public FlatImageDialog message(String message){
        this.MESSAGE = message;
        return this;
    }

    public FlatImageDialog buttonImage(int imageResource){
        this.BUTTON_IMAGE = imageResource;
        return this;
    }

    public FlatImageDialog buttonColour(int buttonColor){
        BUTTON_BACKGROUND_COLOUR = buttonColor;
        return this;
    }

    public FlatImageDialog setCancelClickListner(OnCoolDialogClickListner cancelClickListner){
        mCancelClickListner = cancelClickListner;
        return this;
    }

    public void show(){
        LayoutInflater li = LayoutInflater.from(context);
        View dialogView = li.inflate(R.layout.flat_dialog_design_1, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set custom_dialog.xml to alertdialog builder
        alertDialogBuilder.setView(dialogView);
        LinearLayout layoutYourIdeaDialog = (LinearLayout) dialogView.findViewById(R.id.layoutYourIdeaDialog);
        final ImageView imgYourIdeaDialog = (ImageView) dialogView.findViewById(R.id.imgYourIdeaDialog);
        final TextView textYourIdeaDialog = (TextView) dialogView.findViewById(R.id.textYourIdeaDialog);
        final ImageButton imgBtnYourIdeaDialog = (ImageButton) dialogView.findViewById(R.id.imgBtnYourIdeaDialog);

        imgYourIdeaDialog.setImageResource(this.IMAGE);
        layoutYourIdeaDialog.setBackgroundColor(context.getResources().getColor(this.BACKGROUND_COLOUR));
        textYourIdeaDialog.setText(this.MESSAGE);
        imgBtnYourIdeaDialog.setBackgroundColor(context.getResources().getColor(this.BUTTON_BACKGROUND_COLOUR));
        imgBtnYourIdeaDialog.setImageResource(this.BUTTON_IMAGE);
        imgBtnYourIdeaDialog.setOnClickListener(this);

        alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }

    public void dismissDialog(){

    }


    @Override
    public void onClick(View view) {
        if (mCancelClickListner != null) {
            mCancelClickListner.onClick(alertDialog);
        }
    }

}
