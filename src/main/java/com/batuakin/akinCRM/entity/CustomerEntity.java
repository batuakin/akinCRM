package com.batuakin.akinCRM.entity;

import com.batuakin.akinCRM.enums.CustomerStatus;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(schema = "akinCRM",name = "customers")
public class CustomerEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String companyName;

    @Column(length = 20)
    private String phone;

    @Column(length = 50)
    private String taxId;

    private String country;
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerStatus customerStatus;

    //Relations
    //FK Burada tutulur
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_user_id", nullable = false)
    private UserEntity assignedUser;

}
