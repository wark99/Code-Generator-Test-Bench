// ReviewRepository.java

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}

@Service
public class ReviewRepositoryImpl implements ReviewRepository {

}


