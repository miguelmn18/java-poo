import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;
import dominio.Bootcamp;
import dominio.Dev;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criando os conteúdos (cursos e mentoria)
        Curso curso = new Curso();
        curso.setTitulo("Java");
        curso.setDescricao("Bootcampp framework");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Python");
        curso2.setDescricao(" framework jupyter");
        curso2.setCargaHoraria(5);

        Curso curso3 = new Curso();
        curso3.setTitulo("PHP");
        curso3.setDescricao("Banco de Dados");
        curso3.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setTitulo("Programação");
        mentoria.setDescricao("Programação em java");

        //Instanciando bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Develope");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("Conteúdos do Bootcamp: " + bootcamp.getConteudos());


        //Instanciando dev
        Dev devMiguel = new Dev();
        devMiguel.setNome("Miguel");
        devMiguel.inscreverBootcamp(bootcamp);
        System.out.println( " Conteúdos inscritos: " + devMiguel.getConteudosInscritos()); //vê os conteúdos inscritos no bootcamp
        devMiguel.progredir(); //atualiza lista de progressão dos cursos
        System.out.println( " Conteúdos concluídos: " + devMiguel.getConteudosConcluidos()); //mostra a progressão
        System.out.println("-------------------------------------------------------");
        System.out.println( " Conteúdos inscritos: " + devMiguel.getConteudosInscritos()); //verifica se o conteúdo em que progrediu foi removido de conteudos inscritos


        System.out.println("-------------------------------------------------------");
        Dev devPeter = new Dev();
        devPeter.setNome("Peter");
        devPeter.inscreverBootcamp(bootcamp);
        System.out.println( " Conteúdos inscritos: " + devPeter.getConteudosInscritos());
        devPeter.progredir();
        System.out.println( " Conteúdos concluídos: " + devPeter.getConteudosConcluidos());
        System.out.println("-------------------------------------------------------");
        System.out.println( " Conteúdos inscritos: " + devPeter.getConteudosInscritos());







    }
}