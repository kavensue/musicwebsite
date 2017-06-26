package com.musicwebsite.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by KarrySue on 2017/6/22.
 */
@Entity
@Table(name = "song")
public class SongEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "song_id")
    private Long id;

    @Column(name = "song_name")
    private String name;

    @Column(name = "song_type")
    private String type;

    @Column(name = "song_singer")
    private String singer;

    @Column(name = "song_album")
    private String album;

    @Column(name = "song_url")
    private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
