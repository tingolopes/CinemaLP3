package br.edu.ifms.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genero")
public class Genero implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "genero_id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "generos")
    private List<Filme> filmes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String modelo) {
        this.nome = modelo;
    }

    public Genero(String nome) {
        this.nome = nome;
    }

    public Genero() {
    }

}
