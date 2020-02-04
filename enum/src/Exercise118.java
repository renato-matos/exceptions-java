import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;
import entities.ProductOrder;
import entities.enums.ProductOrderStatus;

public class Exercise118 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		// Client Data
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		
		Client client = new Client(name, email, sdf.parse(birthDate));
		
		//Order Data
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		ProductOrder po = new ProductOrder(new Date(), ProductOrderStatus.valueOf(status));
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		sc.nextLine();
		
		//Order Items
		
		for (int i = 1; i <= items; i++) {
			System.out.println("Enter #" + i + " item data");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			OrderItem oi = new OrderItem(productQuantity, productPrice, product);
			po.addItem(oi);
		}
		
		//Order Summary
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order Moment: " + sdf1.format(po.getMoment()));	
		System.out.println("Order status: " + po.getStatus().toString());	
		System.out.println("Client: " + client.toString());	
		System.out.println("Order items:");
		
		Double totalPrice = 0.0;
		
		for (OrderItem oi : po.getItems()) {
			System.out.println(oi.toString());
			totalPrice += oi.subTotal();
		}
		
		
		System.out.println("Total price: $" + String.format("%.2f", totalPrice));	
		sc.close();
		
	}

}
