// OrderRepository.java

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

@Service
public class OrderRepositoryImpl implements OrderRepository {

}


