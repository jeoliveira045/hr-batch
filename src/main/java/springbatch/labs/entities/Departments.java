package springbatch.labs.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "DEPARTMENTS")
@Data
public class Departments{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENTS_SEQ")
    private Long departmentId;

    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    @ManyToOne
    @JoinColumn(name = "MANAGER_ID")
    private Employee managerId;

    @ManyToOne
    @JoinColumn(name = "LOCATION_ID")
    private Location locationId;
}
