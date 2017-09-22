package shchur_pavlo.models;

import lombok.*;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
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

    @Email
    @Past
    @Future
    @NotEmpty
    @Pattern(regexp = "")
    @Size(min = 4, max = 16)
    @NotNull(message = "field nameOfCitizen cannot be empty")
    private String nameOfCitizen;

    @CreditCardNumber
    @Min(1)
    @Max(100)
    private int age;

    public Citizen(String nameOfCitizen) {
        this.nameOfCitizen = nameOfCitizen;
    }

    @Valid
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
