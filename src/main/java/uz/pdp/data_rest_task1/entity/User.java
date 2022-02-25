package uz.pdp.data_rest_task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String  firstName;

    @Column(nullable = false)
    private String  lastName;

    @Column(unique = true,nullable = false)
    private String  phoneNumber;

    @Column(nullable = false)
    private String  code;

    @Column(nullable = false)
    private String  password;

    private boolean active;

    @ManyToMany
    private Set<WareHouse> wareHouses;
}
