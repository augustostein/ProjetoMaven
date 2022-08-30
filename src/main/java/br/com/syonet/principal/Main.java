package br.com.syonet.principal;

import br.com.syonet.dao.LivroDAO;
import br.com.syonet.entidade.Livro;

public class Main {
    public static void main(String[] args){
        Livro livro1 = new Livro();

        livro1.setTitulo("A volta dos que não foram");
        livro1.setEditora("Dois carecas brigando por um pente");
        livro1.setNomeAutor("Jorgisney Silva");

        LivroDAO dao = new LivroDAO();
        dao.salva(livro1);



    }
}
