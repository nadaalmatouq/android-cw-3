package com.example.topmovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Movie> movieList = new ArrayList<>(); //Array of lists

        Movie m1 = new Movie("Taken", 2008 ,"Action", false, R.drawable.taken,1);
        Movie m2 = new Movie("Salt",  2010 , "Action", false, R.drawable.salt,2);
        Movie m3 = new Movie("Toy Story 4",  2019 , "Kids",  true,R.drawable.toystory4,3);
        Movie m4 = new Movie("The Lion King ",  2008 ,  "Kids",  false ,R.drawable.thelionking,4);


        System.out.println("Teseeeet");
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);

        System.out.println(m3.getRank());

       //connect recyclerView

        RecyclerView rv = findViewById(R.id.rv);
       //Alligning recyclerview with linear layout  To setup cell size of recycler view
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        MovieAdapter ma = new MovieAdapter(movieList,MainActivity.this );

        rv.setAdapter(ma);

















    }
}