package com.payment.entity.common;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "dibuat_oleh")
    protected String dibuatOleh;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "tanggal_buat")
    protected Date tanggalBuat;

    @Column(name = "diubah_oleh")
    protected String diubahOleh;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "tanggal_ubah")
    protected Date tanggalUbah;
}
