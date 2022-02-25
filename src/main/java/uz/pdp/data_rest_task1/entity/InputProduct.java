package uz.pdp.data_rest_task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InputProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //KIRIM QILINAYOTGAN MAHSULOT
    @ManyToOne
    private Product product;

    @Column(nullable = false)
    private Double  amount;

    private Double price;

    private Date expireDate;

    @ManyToOne
    private Input input;

}