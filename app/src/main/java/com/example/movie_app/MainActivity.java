package com.example.movie_app;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView ;
    private WordAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    public  ArrayList<ItemData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CreateArrayList();
        mRecyclerView = findViewById(R.id.RecycleView);
        layoutManager = new LinearLayoutManager(this);
        mAdapter =new WordAdapter(list);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.SetonItemClickListener(new WordAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position) {
                String list1txt =list.get(position).getTxt1();
                Intent intent =new Intent(MainActivity.this,DetalisActivity.class);
                intent.putExtra("name",list1txt);
                startActivity(intent);

            }
        });

    }



    private void CreateArrayList() {

            list = new ArrayList<>();
            list.add(new ItemData(R.drawable.ic_movie,"txt1","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt2","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt3","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt4","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt5","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt6","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt7","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt8","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt9","txt2"));
            list.add(new ItemData(R.drawable.ic_movie,"txt10","txt2"));



        }}




