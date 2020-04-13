import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Aula207 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		Integer studentsA = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < studentsA; i++) {
			courseA.add(sc.nextInt());
			sc.nextLine();
		}
		
		System.out.print("How many students for course B? ");
		Integer studentsB = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < studentsB; i++) {
			courseB.add(sc.nextInt());
			sc.nextLine();
		}
		
		System.out.print("How many students for course C? ");
		Integer studentsC = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < studentsC; i++) {
			courseC.add(sc.nextInt());
			sc.nextLine();
		}
		
		Set<Integer> students = new TreeSet<>(courseA);
		students.addAll(courseB);
		students.addAll(courseC);
		
		System.out.println("Total students: " + students.size());
		sc.close();
		
	}

}
