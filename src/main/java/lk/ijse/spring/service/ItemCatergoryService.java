package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemCatergoryDTO;
import lk.ijse.spring.dto.ItemDTO;

import java.util.List;

public interface ItemCatergoryService {
    boolean saveItemCatergory(ItemCatergoryDTO itemCatergoryDTO);
    boolean updateItemCatergory(ItemCatergoryDTO itemCatergoryDTO);
    List<ItemCatergoryDTO> getAllItemCatergory();
    boolean deleteItemCatergory(Integer itemCatergoryId);

}
