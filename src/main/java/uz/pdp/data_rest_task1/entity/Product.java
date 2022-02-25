package uz.pdp.data_rest_task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private  Attachment attachment;

    @Column(unique = true,nullable = false)
    private String code;

    @ManyToOne
    private Measurement measurement;

    private boolean active;
}
