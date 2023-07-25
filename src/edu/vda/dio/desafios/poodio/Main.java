

import edu.vda.dio.desafios.poodio.dominio.Bootcamp;
import edu.vda.dio.desafios.poodio.dominio.Curso;
import edu.vda.dio.desafios.poodio.dominio.Dev;
import edu.vda.dio.desafios.poodio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de js");
        curso2.setDescricao("Descrição do curso de js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria de java");
        mentoria1.setDescricao("Descrição da mentoria de java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devVeronica = new Dev();
        devVeronica.setNome("Verônica");
        devVeronica.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Verônica \n" + devVeronica.getConteudosInscritos());
        devVeronica.progredir();
        devVeronica.progredir();

        System.out.println("-");
        System.out.println("Conteúdo Concluídos Verônica \n" + devVeronica.getConteudosConcluidos());
        System.out.println("Conteúdo Inscritos Verônica \n" + devVeronica.getConteudosInscritos());
        System.out.println("XP: " + devVeronica.calcularTotalXp());

        System.out.println("\n---------------------------------------------\n");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdo Inscritos Lucas \n" + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();

        System.out.println("-");
        System.out.println("Conteúdo Concluídos Lucas \n" + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdo Inscritos Lucas \n" + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());




    }
}
