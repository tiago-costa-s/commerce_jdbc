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

//		System.out.println("===== 2 - findById =====");
//		System.out.print("Enter the product ID: ");
//		int id = sc.nextInt();
//		Product product = newProductDao.findById(id);
//
//		if (product != null) {
//			System.out.println(product);
//		} else {
//			System.out.println("Product not fount.");
//		}

//		System.out.println("===== 3 - Update =====");
//		System.out.print("Enter the product ID to update:  ");
//		int id = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("New name: ");
//		String name = sc.nextLine();
//
//		System.out.print("New price: ");
//		Double price = sc.nextDouble();
//
//		System.out.print("New quantity: ");
//		int quantity = sc.nextInt();
//
//		Product product = new Product(id, name, price, quantity);
//
//		newProductDao.update(product);
//		System.out.println("Update completed!");

//		System.out.println("===== 4 - Delete =====");
//		System.out.print("Enter the product ID to delete: ");
//		int id = sc.nextInt();
//
//		newProductDao.deleteById(id);
//		System.out.print("Product delete successfully! ");

		System.out.println("===== 5 - findAll =====");
		System.out.println("\n===== List all products =====");
		List<Product> list = newProductDao.findAll();

		for (Product p : list) {
			System.out.println(p);
		}

		sc.close();
	}

}