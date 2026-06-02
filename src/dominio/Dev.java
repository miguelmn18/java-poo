package dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //quando salvar, coloca na ordem que o usuário se inscreveu
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // quando o usuário for terminando, vai salvando conforme for terminando

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos()); // Com esta linha todos os conteudos incritos são salvos
        bootcamp.getDevsInscritos().add(this); //Adiciona o DEV
    }
    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); // optional é normalmente utilizado para retornos null
        if(conteudo.isPresent()) { //vê se existem em conteudos incritos
            this.conteudosConcluidos.add(conteudo.get()); //adiciona a concluídos
            this.conteudosInscritos.remove(conteudo.get()); //remove dos inscritos
        }
        else{
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }

    }
    public double calcularTotalXP(){
        return this.conteudosConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP()).
                sum();  //pega o xp da classe  conteudos concluidos, soma e retorna pro usuário

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
