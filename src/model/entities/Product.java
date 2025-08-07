package model.entities;

import java.util.Objects;

public class Product {
	private Integer id;
	private String name;
	private Double price;
	private Integer quantity;

	public Product() {
	}

	public Product(Integer id, String name, Double price, Integer quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double totalValueInStock() {
		return price * quantity;
	}

	public void addQuantity(Integer amount) {
		this.quantity += amount;
	}

	public void removeQuantity(Integer amount) {
		if (amount > quantity) {
			throw new IllegalArgumentException("Insufficient quantity in stock.");
		}

		this.quantity -= amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(price, other.price)
				&& Objects.equals(quantity, other.quantity);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
