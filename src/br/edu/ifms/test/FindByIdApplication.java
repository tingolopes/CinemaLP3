package br.edu.ifms.test;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Genero;
import br.edu.ifms.model.Artista;

public class FindByIdApplication {

    public static void main(String[] args) {

        DaoGenerico<Artista> daoPessoa = new DaoGenerico<>();
        DaoGenerico<Genero> daoCarro = new DaoGenerico<>();

        Artista pessoa = daoPessoa.findById(Artista.class, 1L);
        Genero carro = daoCarro.findById(Genero.class, 2L);

        System.out.println("### Entidade Pessoa encontrada ###");
        System.out.println("ID: " + pessoa.getId());
        System.out.println("NOME: " + pessoa.getNome());

        System.out.println("");

        System.out.println("### Entidade Carro encontrada ###");
        System.out.println("ID: " + carro.getId());
        System.out.println("MODELO: " + carro.getNome());

    }

}
