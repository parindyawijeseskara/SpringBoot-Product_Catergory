package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.ItemCatergory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item,Integer> {

    Item findByItemId(Integer itemId);
    List<Item> findAllByItemCatergoryItemCatergoryId(Integer itemCatergoryId);

}
