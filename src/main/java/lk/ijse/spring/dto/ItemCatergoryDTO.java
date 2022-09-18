package lk.ijse.spring.dto;


import lk.ijse.spring.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ItemCatergoryDTO {
    private int itemCatergoryId;
    private String catergoryName;
    private List<Item> items;
}
