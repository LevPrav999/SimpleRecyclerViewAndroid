package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<ViewRow> {

    public ArrayList<Image> arrayList;
    public DataAdapter(ArrayList<Image> arr){
        this.arrayList = arr;
    }

    @NonNull
    @Override
    public ViewRow onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitems, parent, false);
        return new ViewRow(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewRow holder, int position) {
        holder.tv.setText(this.arrayList.get(position).getName());

        holder.itemView.setOnClickListener(
                view ->
                    Toast.makeText(view.getContext(), arrayList.get(holder.getAdapterPosition()).getFact(), Toast.LENGTH_LONG).show()
        );


        Picasso.get().load(this.arrayList.get(position).getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return this.arrayList.size();
    }
}

