package shchur_pavlo.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
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
public class Citizen extends Model {

    @NotNull(message = "field nameOfCitizen cannot be empty")
    private String nameOfCitizen;

    @Min(1)
    @Max(100)
    private int age;

    public Citizen(String nameOfCitizen) {
        this.nameOfCitizen = nameOfCitizen;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nationality_id", referencedColumnName = "id")
    private Nationality nationality;

    @ManyToMany
    @JoinTable(name = "CouncilCitizen", joinColumns = @JoinColumn(name = "CitizenID"),
            inverseJoinColumns = @JoinColumn(name = "CarID"))
    private Set<Car> cars = new HashSet<Car>();



    @Override
    public String toString() {
        return "Citizen{" +
                "nameOfCitizen='" + nameOfCitizen + '\'' +
                '}';
    }
}
