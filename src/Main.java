import br.com.dio.desafio.dominio.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

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


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       //System.out.println(curso1);
       //System.out.println((curso2));
       //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalxp());

        System.out.println("-------");

        Dev devjoao = new Dev();
        devjoao.setNome("Joao");
        devjoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos João:" + devjoao.getConteudosInscritos());
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos João:" + devjoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos João:" + devjoao.getConteudosConcluidos());
        System.out.println("XP" + devjoao.calcularTotalxp());

    }
}
