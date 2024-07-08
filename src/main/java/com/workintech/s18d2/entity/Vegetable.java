package com.workintech.s18d2.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="vegetable",schema = "meyve")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @Min(value=0,message = "id 0 'dan küçük olamaz")
    @NotNull(message = "id alanı boş olamaz")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="is_grown_on_tree")
    private boolean isGrownOnTree;
}
