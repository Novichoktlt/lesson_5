package ru.gb.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name = "PRODUCT")
@NamedQueries({
        @NamedQuery(name = "Product.findNameById",
                query = "SELECT p.title FROM Product p where p.id = :id"),
        @NamedQuery(name = "Product.findById",
                query = "SELECT p FROM Product p where p.id = :id")
})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "cost")
    private BigDecimal cost;
    @Column(name = "manufacture_date")
    private LocalDate date;
}
