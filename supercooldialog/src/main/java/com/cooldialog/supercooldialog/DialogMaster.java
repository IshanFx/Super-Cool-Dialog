package com.cooldialog.supercooldialog;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by IshanFx on 11/2/2016.
 */

public class DialogMaster {
    Context context;
    public DialogMaster(Context context){
        this.context = context;
    }

    public void loadIdeaSubmitStatusDialog(boolean success) {

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

        if(success){
            imgYourIdeaDialog.setImageResource(R.drawable.ic_smile);
            layoutYourIdeaDialog.setBackgroundColor(context.getResources().getColor(R.color.colorPrimaryDark));
            textYourIdeaDialog.setText(R.string.your_idea_submitted_successfully);
            imgBtnYourIdeaDialog.setBackgroundColor(context.getResources().getColor(R.color.blue_1));
            imgBtnYourIdeaDialog.setImageResource(R.drawable.ic_done);
        }
        else{
            imgYourIdeaDialog.setImageResource(R.drawable.ic_sad);
            layoutYourIdeaDialog.setBackgroundColor(context.getResources().getColor(R.color.red_1));
            textYourIdeaDialog.setText(R.string.idea_not_submit);
            imgBtnYourIdeaDialog.setBackgroundColor(context.getResources().getColor(R.color.red_2));
            imgBtnYourIdeaDialog.setImageResource(R.drawable.ic_clear);
        }

        final AlertDialog alertDialog = alertDialogBuilder.create();

        imgBtnYourIdeaDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();

            }
        });
        // create alert dialog
        // show it
        alertDialog.show();


    }
}
