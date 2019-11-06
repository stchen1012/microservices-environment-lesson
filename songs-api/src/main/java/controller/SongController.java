package controller;

import model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.SongService;

import java.util.List;

@RestController("/song")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/list")
    public List<Song> getList(){
        return songService.getSongs();
    }

    @PostMapping("/create")
    public Song createSong (Song song) {
        return songService.createSong(song);
    }

    @PutMapping("/update")
    public Song updateSong(Song song) {
        return songService.updateSong(song);
    }

    @DeleteMapping("/delete")
    public Iterable<Long> deleteSong(Long song_id) {
        return songService.deleteSong(song_id);
    }
}
