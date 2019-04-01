package br.edu.ifms.test;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Genero;
import br.edu.ifms.model.Artista;

public class FindByIdApplication {

    public static void main(String[] args) {

        DaoGenerico<Artista> daoArtista = new DaoGenerico<>();
        DaoGenerico<Genero> daoGenero = new DaoGenerico<>();

        Artista artista = daoArtista.findById(Artista.class, 2L);
        Genero genero = daoGenero.findById(Genero.class, 6L);

        System.out.println("### Entidade artista encontrada ###");
        System.out.println("ID: " + artista.getId());
        System.out.println("NOME: " + artista.getNome());

        System.out.println("");

        System.out.println("### Entidade genero encontrada ###");
        System.out.println("ID: " + genero.getId());
        System.out.println("MODELO: " + genero.getNome());

    }

}
