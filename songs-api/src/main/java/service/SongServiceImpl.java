package service;

import model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.SongRepository;

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
        Song savedSong = (Song) songRepository.findAllById(song.getSongId());
        savedSong.setSongTitle(song.getSongTitle());
        savedSong.setSongLength(song.getSongLength());
        return songRepository.save(savedSong);
    }

    @Override
    public Iterable<Long> deleteSong(Long song_id) {
        Song savedSong = songRepository.findById(song_id).orElse(null);
        songRepository.delete(savedSong);
        return savedSong.getSongId();
    }
}
