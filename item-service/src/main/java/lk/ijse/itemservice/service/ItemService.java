package lk.ijse.itemservice.service;

import lk.ijse.itemservice.dto.ItemDTO;

import java.util.List;

public interface ItemService {
     void addItem(ItemDTO dto);
     List<ItemDTO> getAllItems();
     ItemDTO getItem(String id);
     void deleteItem(String id);
     void updateItem(ItemDTO dto);
}
