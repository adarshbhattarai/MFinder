package mfinder.service;

import mfinder.dao.MusicDao;
import mfinder.entity.Music;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService{

    private MusicDao musicDao;

    @Override
    public List<Music> findMusicByTitle(String title) {

        return this.musicDao.findByTitle(title);
    }
}
