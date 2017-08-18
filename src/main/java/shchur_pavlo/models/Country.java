package shchur_pavlo.models;

import lombok.*;
import shchur_pavlo.models.Region;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country extends Model{


	@Column(name="nameOfCountry", length = 50)
	private String nameOfCountry;

	@OneToMany(mappedBy = "country")
	private List<Region> regions = new ArrayList<Region>();

	public Country(String nameOfCountry) {
		super();
		this.nameOfCountry = nameOfCountry;
	}

	public String getNameOfCountry() {
		return nameOfCountry;
	}

	public void setNameOfCountry(String nameOfCountry) {
		this.nameOfCountry = nameOfCountry;
	}

}
