package lk.ijse.spring.service;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;

import java.util.ArrayList;
import java.util.List;


public interface ItemService{
     boolean saveItem(ItemDTO itemDTO);
     boolean updateItem(ItemDTO itemDTO);
     List<ItemDTO> getAllItems();
     boolean deleteItem(Integer itemId);
     List<ItemDTO> getAllItemsByCatergoryId(Integer itemCatergoryId);

}
