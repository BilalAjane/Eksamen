package com.example.demo.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Kommune")
public class Kommune {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String navn;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Sogne> sogne;
    private long kommunekode;


    public Kommune(long id, long kommunekode, String navn) {
        this.id = id;
        this.kommunekode = kommunekode;
        this.navn = navn;
    }

    public Kommune(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getKommunekode() {
        return kommunekode;
    }

    public void setKommunekode(long kommunekode) {
        this.kommunekode = kommunekode;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
