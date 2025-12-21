package com.batuakin.akinCRM.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "akinCRM", name = "products")
public class ProductEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(length = 50, unique = true)
    private String sku; // Stok Kodu (Benzersiz olmalı)

    private String description;

    @Column(nullable = false)
    private BigDecimal unitPrice; // DİKKAT: Double değil BigDecimal

    @Column(nullable = false)
    private Integer stockQuantity;
}
