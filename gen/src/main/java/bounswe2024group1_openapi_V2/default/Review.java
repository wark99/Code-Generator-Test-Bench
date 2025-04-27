// Review.java

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="review_content")
    private String reviewContent;

    // Getters and Setters

}

