package br.edu.ifms.tablemodel;

import br.edu.ifms.model.Filme;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FilmeTableModel extends AbstractTableModel {

    final List<String> cabecalho;
    private List<Filme> listaFilmes;

    public void setListaFilme(List<Filme> listaFilmes) {
        this.listaFilmes = listaFilmes;
    }

    public FilmeTableModel() {
        cabecalho = new ArrayList<>();
        listaFilmes = new ArrayList<>();

        cabecalho.add("Nome");
        cabecalho.add("Classificação");
        cabecalho.add("Duração");
        cabecalho.add("Genero(s)");
        cabecalho.add("Elenco");
    }

    @Override
    public String getColumnName(int column) {
        return cabecalho.get(column);
    }

    @Override
    public int getRowCount() {
        return listaFilmes.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalho.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                //retornar o id
                return listaFilmes.get(rowIndex).getNome();
            case 1:
                //retornar o nome
                return listaFilmes.get(rowIndex).getClassificacao();
            case 2:
                //retornar o nome
                return listaFilmes.get(rowIndex).getDuracao();
            case 3:
                //retornar o nome
                return listaFilmes.get(rowIndex).getGeneros();
            case 4:
                //retornar o nome
                return listaFilmes.get(rowIndex).getArtistas();
            default:
                return null;
        }
    }
}
