package com.shownight.night.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="viewer")
@Getter @Setter @NoArgsConstructor
public class Viewer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nickName;

    @ManyToMany
    @JoinTable(
            name = "followed_streams",
            joinColumns = @JoinColumn(name="viewer_id"),
            inverseJoinColumns = @JoinColumn(name="stream_id")
    )
    private List<Stream> followedStreams = new ArrayList<>();

    public void setFollowedStreams(Stream stream) {
        followedStreams.add(stream);
    }
}
