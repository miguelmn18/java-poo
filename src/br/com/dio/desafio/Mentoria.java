package br.com.dio.desafio;

public class Mentoria {

    private String titulo;
    private String descricao;
    private int cagaHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCagaHoraria() {
        return cagaHoraria;
    }

    public void setCagaHoraria(int cagaHoraria) {
        this.cagaHoraria = cagaHoraria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cagaHoraria=" + cagaHoraria +
                '}';
    }
}
