package springbatch.labs.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "LOCATIONS")
@Data
public class Location{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOCATION_SEQ")
    private Long locationId;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE_PROVINCE")
    private String stateProvince;

    @ManyToOne
    @JoinColumn(name = "COUNTRY_ID")
    private Country countryId;
}
