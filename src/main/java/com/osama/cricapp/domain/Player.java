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
public class Player {

    @Id @GeneratedValue private Integer id;
    @ManyToOne private Team team;
    private String name;
    private String status;
    private String battingStyle;
    private String bowlingStyle;

}
