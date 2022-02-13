package com.example.webappv1.entities;

public class Genre {
    private int genreId;
    private MusicGenre genreName;

    public Genre(int genreId, MusicGenre genre_name) {
        this.genreId = genreId;
        this.genreName = genre_name;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public MusicGenre getGenreName() {
        return genreName;
    }

    public void setGenreName(MusicGenre genreName) {
        this.genreName = genreName;
    }
}
