package com.busanit.ex10_movie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder>{
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.movie_item,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie item = items.get(position);
        holder.textView1.setText(item.movieNm);
        holder.textView2.setText(item.audiCnt+" 명");
        holder.textView1.setSelected(true);//marquee속성 관련
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(Movie item){
        items.add(item);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView1, textView2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
