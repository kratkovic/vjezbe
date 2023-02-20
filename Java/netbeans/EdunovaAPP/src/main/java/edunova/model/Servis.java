/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Servis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sifra;
    @Column(
            name = "naziv", 
            nullable = false, 
            length = 50
    )
    private String naziv;
    @Column(
            name = "mjesto", 
            nullable = false, 
            length = 50
    )
    private String mjesto;
    @Column(
            name = "radnovrijeme", 
            nullable = false, 
            length = 50
    )
    private String radnovrijeme;
    private Integer smjestaj;

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public String getRadnovrijeme() {
        return radnovrijeme;
    }

    public void setRadnovrijeme(String radnovrijeme) {
        this.radnovrijeme = radnovrijeme;
    }

    public Integer getSmjestaj() {
        return smjestaj;
    }

    public void setSmjestaj(Integer smjestaj) {
        this.smjestaj = smjestaj;
    }

}
