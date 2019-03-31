package br.edu.ifms.application;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Genero;
import br.edu.ifms.model.Artista;

public class RemoveApplication {

    public static void main(String[] args) {

        DaoGenerico<Artista> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Genero> daoCarro = new DaoGenerico<>();

        daoPessoa.remove(Artista.class, 1L);
        daoCarro.remove(Genero.class, 2L);

        System.out.println("Entidades removidas com sucesso!");

    }
}
