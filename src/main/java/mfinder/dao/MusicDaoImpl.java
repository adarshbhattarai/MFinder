package mfinder.dao;

import mfinder.entity.Music;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TODO make this repository and implement a repository
@Component
public class MusicDaoImpl implements MusicDao{

    Map<String,List<Music>> titleMusic = new HashMap();
    @Override
    public List<Music> findByTitle(String title) {
        return titleMusic.get(title);
    }

    @Override
    public void addMusic(Music music) {
         titleMusic.putIfAbsent(music.getTitle(), new ArrayList<>());
         titleMusic.get(music.getTitle()).add(music);
    }


}
