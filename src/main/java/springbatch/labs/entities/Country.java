package springbatch.labs.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "COUNTRIES")
@Data
public class Country{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COUNTRY_SEQ")
    private Long countryId;

    @Column(name = "COUNTRY_NAME")
    private String countryName;

    @ManyToOne
    @JoinColumn(name = "REGION_ID")
    private Region regionId;

}
