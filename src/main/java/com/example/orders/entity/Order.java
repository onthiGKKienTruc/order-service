package com.example.orders.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Orders")
public class Order {
    @Id
    @GeneratedValue
    private Long Id;
    private String orderName;
    private double price;
}
