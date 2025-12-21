package com.batuakin.akinCRM.entity;

import com.batuakin.akinCRM.enums.DealStage;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "akinCRM", name = "deals")
public class DealEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name; // Fırsat Başlığı: "X Firması Lisans Yenileme"

    private String description;

    private BigDecimal amount; // Tahmini Tutar

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DealStage stage; // Fırsat hangi aşamada?

    // İlişki: Deal -> Customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customer;

    // İlişki: Deal -> User (Sorumlu Satışçı)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_user_id", nullable = false)
    private UserEntity assignedUser;

}
