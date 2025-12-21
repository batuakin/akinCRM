package com.batuakin.akinCRM.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass // veritabanında tablosu yok, miras veren bir sınıf olduğunu belirtir
@EntityListeners(AuditingEntityListener.class) // spring'in audit olaylarını dinlemesini sağlar
public abstract class BaseEntity {

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDate updatedAt;

    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private  String updatedBy;

    private Boolean isDeleted = false;
}
