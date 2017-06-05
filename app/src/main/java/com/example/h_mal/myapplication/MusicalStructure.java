package com.example.h_mal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MusicalStructure extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musical_structure);


        // Find the View that shows the songs category
        TextView songs = (TextView) findViewById(R.id.songs);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the songs View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MusicalStructure.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);

// Set a click artists on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MusicalStructure.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the albums category
        TextView albums = (TextView) findViewById(R.id.albums);

// Set a click albums on that View
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the albums View is clicked on.
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MusicalStructure.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the genres category
        TextView genres = (TextView) findViewById(R.id.genres);

// Set a click genres on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genres View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MusicalStructure.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });

        // Find the View that shows the year category
        TextView year = (TextView) findViewById(R.id.year);

// Set a click year on that View
        year.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists View is clicked on.
            @Override
            public void onClick(View view) {
                Intent yearIntent = new Intent(MusicalStructure.this, YearActivity.class);
                startActivity(yearIntent);
            }
        });

    }
}
