package springbatch.labs.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;


@Entity
@Table(name = "JOBS")
@Data
public class Job{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JOB_SEQ")
    private Long jobId;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "MIN_SALARY")
    private BigDecimal minSalary;

    @Column(name = "MAX_SALARY")
    private BigDecimal maxSalary;


}
