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
public class Over {

    @Id @GeneratedValue private Integer id;
    @OneToMany(mappedBy = "over") private List<Ball> balls;
    @OneToOne private Player bowler;

}
