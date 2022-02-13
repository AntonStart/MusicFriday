package com.example.webappv1.entities;

public class Song {
    private int songId;
    private String songName;
    private int bandId;
    private int albumId;

    public Song(int songId, String songName, int bandId, int albumId) {
        this.songId = songId;
        this.songName = songName;
        this.bandId = bandId;
        this.albumId = albumId;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public int getBandId() {
        return bandId;
    }

    public void setBandId(int bandId) {
        this.bandId = bandId;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }
}
