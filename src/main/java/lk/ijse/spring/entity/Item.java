package lk.ijse.spring.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemId;
    private String itemName;
    private double price;
    private int qty;
    @ManyToOne
    @JoinColumn(name = "itemCatergoryId",referencedColumnName = "itemCatergoryId",insertable = false,updatable = false)
    private ItemCatergory itemCatergory;
}
