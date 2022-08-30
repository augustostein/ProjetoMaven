package br.com.syonet.entidade;

import javax.persistence.*;


@Entity
@Table(name = "syo_livro")


teste


public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLivro;

    @Column(nullable = false, name = "nm_titulo")
    private String titulo;

    @Column(nullable = true, name = "nm_titulooriginal")
    private String tituloOriginal;

    @Column(nullable = false, name = "nm_autor")
    private String nomeAutor;

    @Column(nullable = true, name = "nm_editora")
    private String editora;

    @Column(nullable = true, name = "no_paginas")
    private Integer numeroPaginas;

    @Column(nullable = true, name = "no_edicao")
    private Integer numeroEdicao;


    public Integer getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public Integer getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setNumeroEdicao(Integer numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }


}
