package com.example.songsapi.service;

import com.example.songsapi.model.Song;

import java.util.List;

public interface SongService {
    public List<Song> getSongs();
    public Song createSong(Song song);
    public Song updateSong(Song song);
    public Long deleteSong(Long song_id);
}
