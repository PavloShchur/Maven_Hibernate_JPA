package shchur_pavlo.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Nationality extends Model {

    private String typeOfNationality;

    @OneToMany(mappedBy = "nationality")
    private Set<Citizen> citizenSet = new HashSet<Citizen>();



}
