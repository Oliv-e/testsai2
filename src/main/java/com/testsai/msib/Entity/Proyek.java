package com.testsai.msib.Entity;

import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "proyek")
public class Proyek {
    
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;
    
    @Column(name = "nama_proyek")
    private String namaProyek;
    
    @Column(name = "client")
    private String client;
    
    @Column(name = "tgl_mulai")
    private LocalDateTime tglMulai;
    
    @Column(name = "tgl_selesai")
    private LocalDateTime tglSelesai;
    
    @Column(name = "pimpinan_proyek")
    private String pimpinanProyek;
    
    @Column(name = "keterangan")
    private String keterangan;
    
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaProyek() {
        return namaProyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.namaProyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(LocalDateTime tglMulai) {
        this.tglMulai = tglMulai;
    }

    public LocalDateTime getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(LocalDateTime tglSelesai) {
        this.tglSelesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinanProyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinanProyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}