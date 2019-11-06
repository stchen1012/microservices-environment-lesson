package model;
import javax.persistence.*;

@Entity
@Table(name = "songs")
public class Song {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Iterable<Long> songId;

    @Column(name = "song_title")
    private String songTitle;

    @Column(name = "song_length")
    private Long songLength;

    public Iterable<Long> getSongId() {
        return songId;
    }

    public void setSongId(Iterable<Long> songId) {
        this.songId = songId;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public Long getSongLength() {
        return songLength;
    }

    public void setSongLength(Long songLength) {
        this.songLength = songLength;
    }
}
