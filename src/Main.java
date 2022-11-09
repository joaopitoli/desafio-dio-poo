import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso springboot");
        curso2.setDescricao("descricao curso springboot");
        curso2.setCargaHoraria(7);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Joao Inscritos " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Joao Inscritos " + devJoao.getConteudosInscritos());
        System.out.println("Joao Concluidos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Jose Inscritos " + devJose.getConteudosInscritos());
        devJose.progredir();
        System.out.println("Jose Inscritos " + devJose.getConteudosInscritos());
        System.out.println("Jose Concluidos " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJose.calcularTotalXp());






    }
}