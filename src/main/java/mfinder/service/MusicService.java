package mfinder.service;

import mfinder.entity.Music;

import java.util.List;

public interface MusicService {

    List<Music> findMusicByTitle(String title);

}
