import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso Java");
        curso1.setCargaHoraria(8);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Git");
        curso2.setDescricao("Descricao curso Git");
        curso2.setCargaHoraria(6);
        Curso curso3 = new Curso();
        curso3.setTitulo("Curso GitHub");
        curso3.setDescricao("Descricao curso GitHub");
        curso3.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devAndre = new Dev();
        devAndre.setNome("Andre");
        devAndre.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Andre:" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos Andre:" + devAndre.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Andre:" + devAndre.getConteudosConcluidos());
        System.out.println("XP: " + devAndre.calcularTotalXp());


        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());



    }
}
