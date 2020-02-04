package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f %n", aluno.notaFinal());
		
		if (aluno.aprovado()) {
			System.out.print("PASS");
		} else {
			System.out.printf("FAILED %n");
			System.out.printf("MISSING POINTS = %.2f %n", aluno.missingPoints());
		}
		
		sc.close();

	}

}
