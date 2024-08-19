package springbatch.labs.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "EMPLOYEES")
@Data
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEES_SEQ")
    private Long employeeId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private LocalDate hireDate;

    @ManyToOne
    @JoinColumn(name = "JOB_ID")
    private Job jobId;

    @Column(name = "SALARY")
    private BigDecimal bigDecimal;

    @Column(name = "COMMISSION_PCT")
    private BigDecimal commissionPct;

    @ManyToOne
    @JoinColumn(name = "MANAGER_ID")
    private Employee managerId;

    @OneToMany(mappedBy = "managerId", cascade = CascadeType.ALL)
    private Set<Employee> empregados =  new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
    private Departments departmentId;




}
