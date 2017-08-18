package shchur_pavlo.models;

import lombok.*;
import org.hibernate.mapping.ManyToOne;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car extends Model {

    private int price;

    @ManyToMany
    @JoinTable(name = "CouncilCitizen", joinColumns = @JoinColumn(name = "CarID"),
            inverseJoinColumns = @JoinColumn(name = "CitizenID"))
    private Set<Citizen> citizens = new HashSet<Citizen>();
}
