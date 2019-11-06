package com.example.songsapi.service;

import com.example.songsapi.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.songsapi.repository.SongRepository;

import java.util.List;

@Service
public class SongServiceImpl implements SongService {

    @Autowired
    SongRepository songRepository;

    @Override
    public List<Song> getSongs() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    @Override
    public Song updateSong(Song song) {
        Song savedSong = songRepository.findById(song.getSongId()).orElse(null);
        savedSong.setSongTitle(song.getSongTitle());
        savedSong.setSongLength(song.getSongLength());
        return songRepository.save(savedSong);
    }

    @Override
    public Long deleteSong(Long song_id) {
        Song savedSong = songRepository.findById(song_id).orElse(null);
        songRepository.delete(savedSong);
        return savedSong.getSongId();
    }
}
