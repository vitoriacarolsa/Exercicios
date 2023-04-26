package principal;

import java.util.Scanner;

import entidade.Aluno;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Aluno aluno= new Aluno ();
		
		System.out.println("Qual é o seu nome?");
		aluno.nome=sc.nextLine();
		
		System.out.println("Quais foram as suas três notas?");
		aluno.nota1=sc.nextDouble();
		aluno.nota2=sc.nextDouble();
		aluno.nota3=sc.nextDouble();
		
		System.out.println("A sua nota final no ano foi: " + aluno.calculaNota());
		
		if (aluno.calculaNota()<=aluno.minimoNota()) {
			System.out.println("Reprovado.");
			System.out.println("Para você atingir sua média você precisa de " + aluno.atingirMedia()+ " pontos.") ;
		}else {
			System.out.println("Aprovado!");
		}

		
	}

}
