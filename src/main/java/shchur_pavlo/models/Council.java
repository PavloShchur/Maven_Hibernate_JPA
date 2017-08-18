package shchur_pavlo.models;

import lombok.*;
import shchur_pavlo.models.City;

import javax.persistence.*;

@Entity
@Table(name = "council")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Council extends Model {

	@Column(name = "nameOfCouncil", length = 50)
	private String nameOfCouncil;

	@OneToOne(mappedBy = "council", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = false)
	private City city;


}
