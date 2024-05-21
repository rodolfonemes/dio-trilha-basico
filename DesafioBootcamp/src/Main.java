import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("curso HTML");
        curso3.setDescricao("descrição curso HTML");
        curso3.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de HTML");
        mentoria2.setDescricao("descrição mentoria HTML");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:");
        System.out.println(
                devCamila.getConteudosInscritos().toString().replace("[", "").replace("]", "").replace(",", ""));
        System.out.println("Conteúdos Concluídos Camila:");
        System.out.println(
                devCamila.getConteudosConcluidos().toString().replace("[", "").replace("]", "").replace(",", ""));
        System.out.println("XP:" + devCamila.calcularTotalXp());
        System.out.println();
        System.out.println("----------- progressão----------------");
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println();
        System.out.println("Conteúdos Inscritos Camila:");
        System.out.println(
                devCamila.getConteudosInscritos().toString().replace("[", "").replace("]", "").replace(",", ""));
        System.out.println("Conteúdos Concluídos Camila:");
        System.out.println(
                devCamila.getConteudosConcluidos().toString().replace("[", "").replace("]", "").replace(",", ""));
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }

}
