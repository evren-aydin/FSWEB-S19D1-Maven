package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "fruit",schema = "meyve")
public class Fruit {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    @Min(value = 0,message = "id 0'dan küçük olamaz!!")
    @NotNull(message = "id alanı kesinlikle boş olamaz")
    private Long id;
    @NotNull
    @Column(name="name")
    private String name;
    @Column(name="price")
    private double price;
    @Column(name="fruit_type")
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
