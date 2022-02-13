package com.example.webappv1.entities;

import java.sql.Date;

public class Album {
    private int albumId;
    private String albumName;
    private int bandId;
    private Date releaseDate;

    public Album(int albumId, String albumName, int bandId, Date releaseDate) {
        this.albumId = albumId;
        this.albumName = albumName;
        this.bandId = bandId;
        this.releaseDate = releaseDate;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getBandId() {
        return bandId;
    }

    public void setBandId(int bandId) {
        this.bandId = bandId;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
