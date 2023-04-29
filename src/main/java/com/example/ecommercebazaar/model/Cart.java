package com.example.ecommercebazaar.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "cart")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    Integer totalCost;

    Integer numberOfItems;

    @OneToOne
    @JoinColumn
    Customer customer;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    List<Item> items = new ArrayList<>();
}
