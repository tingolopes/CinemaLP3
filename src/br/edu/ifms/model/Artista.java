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
@Table(name = "artista")
public class Artista implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "artista_id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "artistas")
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista(String nome) {
        this.nome = nome;
    }

    public Artista() {
    }
    

}
