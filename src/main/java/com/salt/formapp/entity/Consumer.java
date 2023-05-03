package com.salt.formapp.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "konsumen")
public class Consumer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "nama")
    private String name;

    @Column(name = "alamat")
    private String address;

    @Column(name = "kota")
    @Length(max = 50)
    private String city;

    @Column(name = "provinsi")
    @Length(max = 20)
    private String province;

    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_registrasi")
    private Date registrationDate = new Date();

    @Length(max = 10)
    private String status;

    @Override
    public String toString() {
        return "Consumer [name=" + name + ", address=" + address + ", city=" + city + ", province=" + province
                + ", registrationDate=" + registrationDate + ", status=" + status + "]";
    }
}
