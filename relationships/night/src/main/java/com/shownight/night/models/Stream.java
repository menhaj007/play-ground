package com.shownight.night.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="stream")
@Getter @Setter @NoArgsConstructor
public class Stream {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "followedStreams")
    private List<Viewer> followers = new ArrayList<>();

    public void addViewers(Viewer viewer) {
        followers.add(viewer);
    }
}
