import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("Bootcampp framework");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Programação");
        mentoria.setDescricao("Programação em java");

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());


    }
}