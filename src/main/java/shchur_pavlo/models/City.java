package shchur_pavlo.models;

import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class City extends Model {

	@Column(name = "nameOfCity", length = 50)
	private String nameOfCity;

	@OneToMany(mappedBy = "city")
	private List<Region> regions = new ArrayList<Region>();

	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="council_id")
	private Council council;

	@ManyToMany(mappedBy = "citySet")
	private Set<Policeman> policemanSet = new HashSet<Policeman>();

}
