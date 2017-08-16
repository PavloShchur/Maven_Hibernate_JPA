package shchur_pavlo.Hibernate;

public class Company {

	private long id;
	private String nameOfCompany;
	
	private User user;
	
	public Company() {
		super();
	}

	public Company(long id) {
		super();
		this.id = id;
	}

	public Company(long id, String nameOfCompany) {
		super();
		this.id = id;
		this.nameOfCompany = nameOfCompany;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfCompany() {
		return nameOfCompany;
	}

	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", nameOfCompany=" + nameOfCompany + "]";
	}

}
