package pet.store.entity;

import jakarta.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@Entity
@Data

public class Employee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //generated value type
    private Long employeeId;

    private String employeeName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pet_store_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private PetStore petStore;

}
