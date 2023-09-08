package cdp.mycomp.eshop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user_information")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userID;
    @Column(unique=true)
    private String name;
    @Column(unique=true)
    private String phoneNum;
    @Column(unique=true)
    private String email;
    @Column(unique=true)
    private String address;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

}
