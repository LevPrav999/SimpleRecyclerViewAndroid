package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ViewRow extends RecyclerView.ViewHolder {

    TextView tv;
    ImageView imageView;

    public ViewRow(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.textView);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
