package shchur_pavlo.Hibernate;

import java.util.HashSet;
import java.util.Set;

public class Product {

	private long id;

	private String titleOfProduct;
	private String serialNumber;

	private Set<User> users = new HashSet<User>();

	public Product() {
		super();
	}

	public Product(long id) {
		super();
		this.id = id;
	}

	public Product(long id, String titleOfProduct, String serialNumber) {
		super();
		this.id = id;
		this.titleOfProduct = titleOfProduct;
		this.serialNumber = serialNumber;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitleOfProduct() {
		return titleOfProduct;
	}

	public void setTitleOfProduct(String titleOfProduct) {
		this.titleOfProduct = titleOfProduct;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", titleOfProduct=" + titleOfProduct + ", serialNumber=" + serialNumber + "]";
	}

}
