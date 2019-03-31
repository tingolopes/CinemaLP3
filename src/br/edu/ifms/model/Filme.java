package br.edu.ifms.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class Filme implements EntidadeBase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "filme_id")
    private Long id;
    @Column(name = "nome")
    private String nome;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name = "filme_has_artista",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artistas;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name = "filme_has_genero",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id"))
    private List<Genero> generos;

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

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

}
