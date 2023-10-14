package com.osama.cricapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Innings {

    @Id @GeneratedValue private Integer id;
    @ManyToOne private Match match;
    @OneToOne private Team battingTeam;
    @OneToOne private Team bowlingTeam;
    private Integer score;

}
