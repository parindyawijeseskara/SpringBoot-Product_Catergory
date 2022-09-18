package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import lk.ijse.spring.entity.ItemCatergory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemCatergoryRepo extends JpaRepository<ItemCatergory,Integer> {
    ItemCatergory findByItemCatergoryId(Integer itemCatergoryId);


}
