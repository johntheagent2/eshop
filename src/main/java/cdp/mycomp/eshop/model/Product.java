package cdp.mycomp.eshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String productID;
    private String name;
    private int price;
    private int quantity;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_category_id")
    private Category category;
}
