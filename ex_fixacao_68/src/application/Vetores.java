package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		
		int numberOfRooms = sc.nextInt();
		sc.nextLine();
		
		Estudante[] vector = new Estudante[10];
		
		for (int i=0; i<numberOfRooms; i++) {
			System.out.printf("Rent # %d %n", i+1);
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vector[room] = new Estudante(name, email);
		}
		
		
		System.out.printf("%n Busy rooms: %n");
		for (int i=0; i<10; i++) {
			if (vector[i] != null) {
				System.out.printf("%d: %s %n", i, vector[i].toString());
			}
		}
		
		sc.close();

	}

}
