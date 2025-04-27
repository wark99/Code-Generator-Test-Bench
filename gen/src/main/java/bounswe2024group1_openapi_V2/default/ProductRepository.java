// ProductRepository.java

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

@Service
public class ProductRepositoryImpl implements ProductRepository {

}


