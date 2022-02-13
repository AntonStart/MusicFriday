package com.example.webappv1.entities;

public class Band {
    private int bandId;
    private String bandName;
    private int genreId;

    public Band(int bandId, String bandName, int genreId) {
        this.bandId = bandId;
        this.bandName = bandName;
        this.genreId = genreId;
    }

    public int getBandId() {
        return bandId;
    }

    public void setBandId(int bandId) {
        this.bandId = bandId;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }
}
