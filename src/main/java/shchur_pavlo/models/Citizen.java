package shchur_pavlo.models;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Citizen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Citizen extends Model {

    private String nameOfCitizen;

    @ManyToOne
    private Nationality nationality;

    @ManyToMany
    @JoinTable(name = "CouncilCitizen", joinColumns = @JoinColumn(name = "CitizenID"),
            inverseJoinColumns = @JoinColumn(name = "CarID"))
    private Set<Car> cars = new HashSet<Car>();

}
