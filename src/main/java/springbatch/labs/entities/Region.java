package springbatch.labs.entities;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "REGIONS")
@Data
public class Region{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REGION_SEQ")
    private Long regionId;

    @Column(name = "REGION_NAME")
    private String regionName;

}
