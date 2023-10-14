package com.osama.cricapp.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Ball {

    @Id @GeneratedValue private Integer id;
    @OneToOne private Player scoredBy;
    @ManyToOne private Over over;
    private Integer scoreFaced;
    private Boolean isNoBall;
    private Boolean isWicket;
    private Boolean isBy;
    private Boolean isLegBy;

}
