package br.com.dio.desafio;

import java.time.LocalDate;

public class Curso {

    private String titulo;
    private String descricao;
    int cargaHoraria;

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

    public int getData() {
        return cargaHoraria;
    }

    public void setData(int carga) {
        this.cargaHoraria = carga;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + cargaHoraria +
                '}';
    }
}
