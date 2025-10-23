import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java QA e Automação", "Curso DIO", 74);
        Curso curso2 = new Curso("Javascript", "Curso Alura", 30);
        Curso curso3 = new Curso("HTML e CSS", "PUCRS", 40);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

        System.out.println("--------------------------------------------------------");

        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Mentoria DIO", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria Javascript", "Mentoria Alura", LocalDate.now());
        Mentoria mentoria3 = new Mentoria("Mentoria HTML e CSS", "Mentoria PUCRS", LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(mentoria3);

        System.out.println("------------------------------------------------------");

        Bootcamp bootcamp1 = new Bootcamp("Bootcamp DIO", "Bootcamp cursos DIO");
        Bootcamp bootcamp2 = new Bootcamp("Bootcamp Alura", "Bootcamp cursos Alura");

        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria2);
        bootcamp2.getConteudos().add(mentoria3);

        Dev dev1 = new Dev("Camila");
        Dev dev2 = new Dev("Francine");
        dev1.inscrever(bootcamp1);
        dev2.inscrever(bootcamp2);

        System.out.println("Conteudos inscritos " + dev1.getNome() + " " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos concluidos " + dev1.getNome() + " " + dev1.getConteudosConcluidos());
        System.out.println("-------------------------------------------------------");
        System.out.println("Conteudos inscritos " + dev2.getNome() + " " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluidos " + dev2.getNome() + " " + dev2.getConteudosConcluidos());
    }
}