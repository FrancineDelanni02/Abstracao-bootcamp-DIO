import br.com.dio.desafio.dominio.Curso;
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
    }
}