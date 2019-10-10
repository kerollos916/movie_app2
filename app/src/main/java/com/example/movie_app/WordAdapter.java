package com.example.movie_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {
    public ArrayList <ItemData> mArrayList;

    private  onItemClickListener mlistener;
    public interface onItemClickListener{

        void onItemClick (int position);
    }

    public void  SetonItemClickListener (onItemClickListener listener )
    {
        mlistener = listener ;
    }

    public static class WordViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView;
        public TextView mTextView2;


        public WordViewHolder(View itemView, final onItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.photo);
            mTextView = itemView.findViewById(R.id.txt1);
            mTextView2 = itemView.findViewById(R.id.txt2);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {




            if(listener != null){
              int position = getAdapterPosition();
                 if (position != RecyclerView.NO_POSITION){
                 listener.onItemClick(position);
    }
}

                }
            });


        }
    }

    public  WordAdapter(ArrayList<ItemData>list){
        mArrayList = list;
    }
    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itme, parent, false);
        WordViewHolder wordViewHolder = new WordViewHolder(v,mlistener);
        return wordViewHolder ;

    }


    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        ItemData currentitem = mArrayList .get(position);
        holder.mImageView.setImageResource(currentitem.getPhoto());
        holder.mTextView.setText(currentitem.getTxt1());
        holder.mTextView2.setText(currentitem.getTxt2());

        }



    @Override
    public int getItemCount() {

        return mArrayList.size();
    }


}
