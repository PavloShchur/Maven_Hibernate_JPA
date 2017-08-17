package shchur_pavlo.Hibernate;

import lombok.*;

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
public class Policeman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(name = "city_policeman",
            joinColumns = {@JoinColumn(name = "city_id")},
            inverseJoinColumns = {@JoinColumn(name = "policeman_id")})
    private Set<City> citySet = new HashSet<City>();


}
