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
public class Receipt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String receiptID;

    @ManyToOne
    private User user;

    @OneToMany(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_receipt_details_id", referencedColumnName = "receiptID")
    private List<ReceiptDetails> receiptDetails;

    private int totalPrice;
}
