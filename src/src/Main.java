
package src;

import java.time.LocalDate;
import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Conteudo;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");     
        curso1.setDescricao("Descricao");
        curso1.setCargaHoraria(2);
                
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");     
        curso2.setDescricao("Descricao");
        curso2.setCargaHoraria(22);        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Curso JS M");     
        mentoria.setDescricao("Descricao M");
        mentoria.setData(LocalDate.now());
                       
//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição Bootcamp Java Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);
       
       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("---------");
        System.out.println("Conteudos Inscritos Camila"+ devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila"+ devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());
       
        System.out.println("-------------------");
        
       Dev devJoao = new Dev();
       devJoao.setNome("Joao");    
       devJoao.inscreverBootcamp(bootcamp);   
       System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
       devJoao.progredir();
        System.out.println("---------");
       System.out.println("Conteudos Inscritos Joao"+ devJoao.getConteudosInscritos());
       System.out.println("Conteudos Concluidos Joao"+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());
    }
    
}
