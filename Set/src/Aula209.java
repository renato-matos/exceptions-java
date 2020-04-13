import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Aula209 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> votes = new LinkedHashMap<>();
			
			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				Integer quantity = Integer.parseInt(fields[1]);
				
				if (!votes.containsKey(name)) {
					votes.put(name, quantity);
				} else {
					Integer votesSoFar = quantity + votes.get(name);
					votes.put(name, votesSoFar);
				}
				
				line = br.readLine();
				
			}
			
			for (String candidate : votes.keySet()) {
				System.out.println(candidate + ": " + votes.get(candidate));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
		
	}

}
