package shchur_pavlo.models;

import lombok.*;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "region")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Region extends Model {

    @Column(name = "nameOfRegion", length = 50)
    private String nameOfRegion;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Region(String nameOfRegion) {
        super();
        this.nameOfRegion = nameOfRegion;
    }

    public String getNameOfRegion() {
        return nameOfRegion;
    }

    public void setNameOfRegion(String nameOfRegion) {
        this.nameOfRegion = nameOfRegion;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


}
