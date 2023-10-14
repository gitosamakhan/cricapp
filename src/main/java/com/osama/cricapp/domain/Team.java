package com.osama.cricapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id @GeneratedValue private Integer id;
    private String name;
    private String country;
    @OneToOne private Player captain;
    @OneToMany(mappedBy = "team") private List<Player> players;

}
