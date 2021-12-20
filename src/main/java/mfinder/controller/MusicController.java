package mfinder.controller;

import mfinder.entity.Music;
import mfinder.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiParam;
import java.util.List;

@RestController
public class MusicController {

    @Autowired
    MusicService musicService;

    @GetMapping(value = "/findMusic", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Music>> getAllMusic(
            @ApiParam(value = "Id for Song", required = true) @PathVariable("title") String title) {
        List<Music> music = this.musicService.findMusicByTitle(title);
        return new ResponseEntity<List<Music>>(music, HttpStatus.OK);
    }
}
