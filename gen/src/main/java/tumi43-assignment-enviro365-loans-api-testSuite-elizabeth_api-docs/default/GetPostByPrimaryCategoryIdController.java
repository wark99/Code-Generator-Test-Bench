import org.springframework.stereotype.@Data;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.springframework.mb.entity.*;
import org.springframework.mb.http.json.JacksonPOJO;
import org.springframework.mb.http.resultof.query.JsonQuery;
import org.springframework.mb.http.resultof.response.JsonResponse;

import static org.springframework.mb.entity.LIST_AL_trimmed_query;

public class GetPostByPrimaryCategoryIdController {

    @JsonRequest("postId")
    public CategoryWithPost getPostByPrimaryCategoryId(@Request jsonReads = JsonReads.TRIMMED) {
        final int postId;
        try {
            POSTS.get(postId).select().with(
                primaryCategory,
                post
            )
                .execute()
                .as<CategoryWithPost> categoryWithPost
                .fetch();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return categoryWithPost;
    }

    public static final CategoryWithPost<POSTS.class, POSTS_1.class> CategoryWithPost = new CategoryWithPost<POSTS.class, POSTS_1.class>(POSTS.class, POSTS_1.class);

    @JsonResponse(reads = (List of POSTS_1.class) to JsonArray!!)
    public static final POJO CategoryWithPost_1 = new POJO<POSTS_1.class>{}; // Empty as per JSON-P
}

