package lk.ijse.orderservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private String oid;
    private String date;
    private String customerID;
    private List<OrderDetailsDTO> orderDetails = new ArrayList<>();
}
