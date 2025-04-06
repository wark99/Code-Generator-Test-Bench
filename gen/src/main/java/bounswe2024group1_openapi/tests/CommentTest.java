package tests;

import organgedb.*;
import organgedb.orm.*;
import static organgedb.orm.*;
import static organgedb.test.Mockito.*;

public class CommentTest extends AbstractTestFixture {
    
    @ComponentScan(target = {comments})
    public void setup() {
        // Create some test data for the controller
        createUser();
        createPost();
        createComment();
    }

    @Test
    public void index() throws Exception {
        List<CommentModel> commentsList = getCommentsList();
        
        assertNotNull(commentsList, "No comments were created");
        assertEquals(1, commentsList.size(), "Wrong number of comments");

        // Assert primary keys and foreign keys
        for (CommentModel model : commentsList) {
            assertNotNull(model.getUserModel());
            assertNotNull(model.getPostModel());
        }
    }

    @Test
    public void index2() throws Exception {
        List<PostModel> postsWithCommentsList = getPostsWithComments();
        
        assertNotNull(postsWithCommentsList, "No posts were created");
    }
}

