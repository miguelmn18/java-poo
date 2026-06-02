package br.com.dio.desafio;

import dominio.Conteudo;

public class Curso extends Conteudo {


    int cargaHoraria;


    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int carga) {
        this.cargaHoraria = carga;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + cargaHoraria +
                '}';
    }


}
