// ReviewService.java

import java.util.List;
import java.util.Optional;

public interface ReviewService {
    List<Review> getAllReviews();
    Optional<Review> getReviewById(Long id);
    Review createReview(Review review);
    Review updateReview(Long id, Review review);
    void deleteReview(Long id);
}

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Optional<Review> getReviewById(Long id) {
        return reviewRepository.findById(id);
    }

    @Override
    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review updateReview(Long id, Review review) {
        Review existingReview = reviewRepository.findById(id).orElseThrow();
        existingReview.setReviewContent(review.getReviewContent());
        return reviewRepository.save(existingReview);
    }

    @Override
    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}

