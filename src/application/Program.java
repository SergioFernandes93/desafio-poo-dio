package application;

import java.util.Scanner;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 Curso curso1 = new Curso();
		 curso1.setTitulo("curso de Java");
		 curso1.setDescricao("descri��o curso de java");
		 curso1.setCargaHoraria(8);
		 
		 Curso curso2 = new Curso();
		 curso2.setTitulo("curso de js");
		 curso2.setDescricao("descri��o curso de js");
		 curso2.setCargaHoraria(4);
		 
		 Mentoria mentoria1 = new Mentoria();
		 mentoria1.setTitulo("curso de js");
		 mentoria1.setDescricao("descri��o curso de js");
		 mentoria1.setData(4);
		 
//		 System.out.println(curso1);
//		 System.out.println(curso2);
//		 System.out.println(mentoria1); 
		 
		 Bootcamp bootcamp = new Bootcamp();
		 bootcamp.setNome("Bootcamp Spring Boot");
		 bootcamp.setDescricao("Aprenda Spring Boot do b�sico ao avan�ado");
		 bootcamp.getConteudos().add(curso1);
		 bootcamp.getConteudos().add(curso2);
		 bootcamp.getConteudos().add(mentoria1);
		 
		 Dev devSergio = new Dev();
		 devSergio.setNome("Sergio");
		 devSergio.inscreverBootcamp(bootcamp);
		 System.out.println("Conte�dos Inscritos Sergio:" + devSergio.getConteudosInscritos());
		 devSergio.progredir();
		 System.out.println("Conte�dos Conclu�dos Sergio:" + devSergio.getConteudosConcluidos());
		 System.out.println("XP:" + devSergio.calcularTotalXp());
		 
		 System.out.println("-------------------------------------------------------------------------------");
		 
		 Dev devCamila = new Dev();
		 devCamila.setNome("Camila");
		 devCamila.inscreverBootcamp(bootcamp);
		 System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
		 devCamila.progredir();
		 System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());

	}
}
