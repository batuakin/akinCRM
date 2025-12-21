package com.batuakin.akinCRM.entity;


import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "akinCRM", name = "contacts")
public class ContactEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    public int id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(length = 100)
    private String email;

    @Column(length = 20)
    private String phone;

    @Column(length = 50)
    private String position;

    //Relation Contact -> Customer [ManyToOne]

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity entity;

}