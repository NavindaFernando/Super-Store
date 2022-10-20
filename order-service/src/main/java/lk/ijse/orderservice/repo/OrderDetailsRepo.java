package lk.ijse.orderservice.repo;

import lk.ijse.orderservice.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepo extends JpaRepository<OrderDetails, String> {
}
