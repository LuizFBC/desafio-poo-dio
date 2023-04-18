import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTeste = new Dev();
        devTeste.setNome("Teste");
        devTeste.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devTeste.getConteudosInscritos());
        devTeste.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluidos" + devTeste.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos" + devTeste.getConteudosInscritos());
        System.out.println("XP: " +devTeste.calcularTotalXp());
        System.out.println("--------");

        Dev devTeste2 = new Dev();
        devTeste2.setNome("Teste 2");
        devTeste2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Teste 2" + devTeste2.getConteudosInscritos());
        devTeste2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Teste 2" + devTeste2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Teste 2" + devTeste2.getConteudosConcluidos());
        System.out.println("XP: " +devTeste.calcularTotalXp());
    }
}