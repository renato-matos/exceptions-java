import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.entities.Order;

public class Exercicio181 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Order> orders = new ArrayList<>();
		
		File input = new File("/Users/renato.matos/dev/Java/pedidos.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(input))) {
			
			String line = br.readLine();
			
			while (line!=null) {
				System.out.println(line);
				String[] register = line.split(",");
				orders.add(new Order(register[0], Double.valueOf(register[1]), Integer.parseInt(register[2])));
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		boolean success = new File(input.getParent() + "/out").mkdir();
		File output = new File("/Users/renato.matos/dev/Java/out/summary.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {
			for (Order o : orders) {
				String registro = o.getName() + "," + String.format("%.2f", o.totalPrice());
				bw.write(registro);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
