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
    @Column(name = "classificacao")
    private String classificacao;
    @Column(name = "sinopse")
    private String sinopse;
    @Column(name = "duracao")
    private Integer duracao;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_has_artista",
            joinColumns = @JoinColumn(name = "filme_id"),
            inverseJoinColumns = @JoinColumn(name = "artista_id"))
    private List<Artista> artistas;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_has_genero",
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getArtistas() {
        String artistas = "";
        for (int i = 0; i < this.artistas.size(); i++) {
            artistas += this.artistas.get(i).getNome();
            if(i < this.artistas.size()-1){
                artistas += ", ";
            }
        }
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }

    public String getGeneros() {
        String generos = "";
        for (int i = 0; i < this.generos.size(); i++) {
            generos += this.generos.get(i).getNome();
            if(i < this.generos.size()-1){
                generos += ", ";
            }
        }
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public Filme() {
    }

    public Filme(String nome, String classificacao, String sinopse, Integer duracao) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.duracao = duracao;
    }
    
    public Filme(String nome, String classificacao, String sinopse, Integer duracao, List<Artista> artistas, List<Genero> generos) {
        this.nome = nome;
        this.classificacao = classificacao;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.artistas = artistas;
        this.generos = generos;
    }
    
    

}
