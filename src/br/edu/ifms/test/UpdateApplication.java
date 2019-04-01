package br.edu.ifms.test;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Artista;

public class UpdateApplication {

    public static void main(String[] args) {

        DaoGenerico<Artista> daoArtista = new DaoGenerico<>();
        Artista artista = daoArtista.findById(Artista.class, 2L);
        artista.setNome("Raphael Oliveira Neves");
        daoArtista.saveOrUpdate(artista);
        System.out.println("Entidade atualizada com sucesso.");

    }

}
