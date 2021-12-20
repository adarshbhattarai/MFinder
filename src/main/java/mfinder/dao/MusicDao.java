package mfinder.dao;

import mfinder.entity.Music;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicDao{
    List<Music> findByTitle(String title);
    public void addMusic(Music music);
}
