package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.ProductDao;
import model.dao.impl.ProductDaoJDBC;
import model.entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ProductDao newProductDao = DaoFactory.createProductDao();

//		System.out.println("===== 1 - Insert a Product =====");
//
//		System.out.print("Name: ");
//		String name = sc.nextLine();
//
//		System.out.print("Price: ");
//		Double price = sc.nextDouble();
//
//		System.out.print("Quantity: ");
//		Integer quantity = sc.nextInt();
//
//		if (name == null || name.trim().isEmpty()) {
//			throw new IllegalArgumentException("The name cannot be empty.");
//		}
//
//		if (price < 0) {
//			throw new IllegalArgumentException("The price must be greater than zero.");
//		}
//
//		if (quantity < 0) {
//			throw new IllegalArgumentException("The quantity cannot be negative.");
//		}
//
//		Product newProduct = new Product(null, name, price, quantity);
//		newProductDao.insert(newProduct);
//		System.out.println("Inserted! New id = " + newProduct.getId());		

		System.out.println("===== 2 - findById =====");
		System.out.print("Enter the product ID: ");
		int id = sc.nextInt();
		Product product = newProductDao.findById(id);

		if (product != null) {
			System.out.println(product);
		} else {
			System.out.println("Product not fount.");
		}

		sc.close();
	}

}