package com.example.homework4;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView simpleText;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        simpleText = itemView.findViewById(R.id.tv_1);
    }


    public void onBind(ItemModel data) {
        simpleText.setText(data.name);

    }


}
