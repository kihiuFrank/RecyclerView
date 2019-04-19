package com.example.droidlearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Book> bookList = new ArrayList<>();
    private RecyclerView recyclerView;
    private BookAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new BookAdapter(bookList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        initBookData();
    }

    private void initBookData(){
        Book book = new Book("Hello Droid", "Frank Kihiu");
        bookList.add(book);

        book = new Book("Agri_Technology", "Kipruto Kelvin");
        bookList.add(book);

        book = new Book("Machine Learning", "Mark Silla");
        bookList.add(book);

        book = new Book("Code Wright", "Steve Chacha");
        bookList.add(book);

        book = new Book("Cyber Security", "Victor Odera");
        bookList.add(book);

        book = new Book("The Android Beast", "Eric Kirima");
        bookList.add(book);

        mAdapter.notifyDataSetChanged();
    }
}
