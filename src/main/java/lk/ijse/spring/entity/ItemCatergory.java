package lk.ijse.spring.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ItemCatergory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer itemCatergoryId;
    private String catergoryName;
    
}
