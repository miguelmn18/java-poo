import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Java");
        curso.setDescricao("Bootcampp framework");
        curso.setData(8);

        Mentoria mentoria = new Mentoria();

        curso.setData(0);
        curso.setTitulo("Programação");
        curso.setDescricao("Programação em java");

        System.out.println(curso.toString());
        System.out.println(mentoria.toString());


    }
}