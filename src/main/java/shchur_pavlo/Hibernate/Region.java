package shchur_pavlo.Hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "region")
public class Region implements Serializable {

	private static final long serialVersionUID = -5060019904829164242L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	@Column(name = "nameOfRegion", length = 50)
	private String nameOfRegion;

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;


	public Region() {
		super();
	}

	public Region(long id) {
		super();
		this.id = id;
	}

	public Region(String nameOfRegion) {
		super();
		this.nameOfRegion = nameOfRegion;
	}

	public Region(long id, String nameOfRegion, City city) {
		super();
		this.id = id;
		this.nameOfRegion = nameOfRegion;
		this.city = city;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfRegion() {
		return nameOfRegion;
	}

	public void setNameOfRegion(String nameOfRegion) {
		this.nameOfRegion = nameOfRegion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nameOfRegion=" + nameOfRegion + "]";
	}

}
