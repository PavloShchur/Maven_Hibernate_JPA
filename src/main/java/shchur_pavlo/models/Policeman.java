package shchur_pavlo.models;

import lombok.*;
import shchur_pavlo.models.City;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Policeman")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Policeman extends Model {

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "city_policeman",
            joinColumns = {@JoinColumn(name = "city_id")},
            inverseJoinColumns = {@JoinColumn(name = "policeman_id")})
    private Set<City> citySet = new HashSet<City>();


}
