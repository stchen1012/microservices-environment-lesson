package repository;

import model.Song;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>  {
}
