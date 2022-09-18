package lk.ijse.spring.service.impl;


import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.ItemCatergory;
import lk.ijse.spring.repo.ItemCatergoryRepo;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemCatergoryRepo itemCatergoryRepo;

    @Autowired
    ItemRepo itemRepo;

    @Override
    public boolean saveItem(ItemDTO itemDTO) {
        try {
            Item item = new Item();
            item.setItemId(itemDTO.getItemId());
            item.setItemName(itemDTO.getItemName());
            item.setPrice(itemDTO.getPrice());
            item.setQty(itemDTO.getQty());

            ItemCatergory byItemCatergoryId = itemCatergoryRepo.findByItemCatergoryId(itemDTO.getItemCatergoryId());
            item.setItemCatergory(byItemCatergoryId);
            itemRepo.save(item);
            return true;

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) {
        try {
            Item byItemId = itemRepo.findByItemId(itemDTO.getItemId());
            byItemId.setItemName(itemDTO.getItemName());
            byItemId.setPrice(itemDTO.getPrice());
            byItemId.setQty(itemDTO.getQty());

            ItemCatergory byItemCatergoryId = itemCatergoryRepo.findByItemCatergoryId(itemDTO.getItemCatergoryId());
            byItemId.setItemCatergory(byItemCatergoryId);
            itemRepo.save(byItemId);
            return false;

        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<ItemDTO> getAllItems() {
        List<Item> all = itemRepo.findAll();
        List<ItemDTO> itemDTOS = new ArrayList<>();

        for (Item item:all) {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemId(item.getItemId());
            itemDTO.setItemName(item.getItemName());
            itemDTO.setPrice(item.getPrice());
            itemDTO.setQty(item.getQty());
            itemDTO.setItemCatergoryId(item.getItemCatergory().getItemCatergoryId());
            itemDTOS.add(itemDTO);
        }
        return itemDTOS;
    }

    @Override
    public boolean deleteItem(Integer itemId) {
        Item byItemId = itemRepo.findByItemId(itemId);
        itemRepo.delete(byItemId);

        return true;
    }

    @Override
    public List<ItemDTO> getAllItemsByCatergoryId(Integer itemCatergoryId) {
        List<Item> all = itemRepo.findAllByItemCatergoryItemCatergoryId(itemCatergoryId);
        List<ItemDTO> itemDTOS = new ArrayList<>();

        for (Item item:all) {
            ItemDTO itemDTO = new ItemDTO();
            itemDTO.setItemId(item.getItemId());
            itemDTO.setItemCatergoryId(item.getItemCatergory().getItemCatergoryId());
            itemDTO.setItemName(item.getItemName());
            itemDTO.setPrice(item.getPrice());
            itemDTO.setQty(item.getQty());
            itemDTOS.add(itemDTO);
        }
        return itemDTOS;
    }
}
