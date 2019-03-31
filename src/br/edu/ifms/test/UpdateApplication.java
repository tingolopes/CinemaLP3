package br.edu.ifms.test;

import br.edu.ifms.dao.DaoGenerico;
import br.edu.ifms.model.Artista;

public class UpdateApplication {

    public static void main(String[] args) {

        DaoGenerico<Artista> daoPessoa = new DaoGenerico<>();

        Artista pessoa = daoPessoa.findById(Artista.class, 1L);
        pessoa.setNome("Raphael Oliveira Neves");
        daoPessoa.saveOrUpdate(pessoa);
        System.out.println("Entidade atualizada com sucesso.");

    }

}
