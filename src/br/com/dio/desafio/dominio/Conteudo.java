package br.com.dio.desafio.dominio;

public class Conteudo {
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String toString(){
        return "Titulo: " + this.titulo + " Descrição: " + descricao;
    }
}
