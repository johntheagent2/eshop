package cdp.mycomp.eshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReceiptDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String receiptDetailsID;

    @ManyToOne
    private Product product;

    private int quantity;
    private int price;
}
