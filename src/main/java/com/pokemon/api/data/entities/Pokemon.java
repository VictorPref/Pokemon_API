package com.pokemon.api.data.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Pokemon")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pokemon_seq")
    @SequenceGenerator(name = "pokemon_seq", sequenceName = "pokemon_seq", allocationSize = 1, initialValue = 1)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "type_1", length = 32)
    private String type_1;

    @Column(name = "type_2", length = 32)
    private String type_2;

    @Column(name = "total")
    private int total;

    @Column(name = "hp")
    private int hp;

    @Column(name = "attack")
    private int attack;

    @Column(name = "defense")
    private int defense;

    @Column(name = "sp_atk")
    private int sp_atk;

    @Column(name = "sp_def")
    private int sp_def;

    @Column(name = "speed")
    private int speed;

    @Column(name = "generation")
    private int generation;

    @Column(name = "legendary")
    private boolean legendary;

}
