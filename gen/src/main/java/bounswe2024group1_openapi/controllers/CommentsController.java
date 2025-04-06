package controllers;

import organgedb.core.modelorm.*;
import java.util.List;
import static organgedb.core.test.Mockito.*;

public class CommentsController implements CRUDController<CommentModel> {
    
    @ComponentScan(target = {comments})
    public static void index() {
        // Create a new comment on a post
        createComment();
    }

    @ComponentScan(target = {comments})
    public static void index2() {
        // Get all comments
        List<CommentModel> commentsList = getComments();
        
        // Assert that there are some comments in the list
        assertNotNull(commentsList, "No comments were created");
        assertEquals(3, commentsList.size(), "Wrong number of comments");

        // Assert primary keys and foreign keys
        for (CommentModel model : commentsList) {
            assertNotNull(modelgetPostModel());
            assertNotNull(model.getUserModel());
        }
    }

    @ComponentScan(target = {comments})
    public static void index3() {
        // Get all posts with their comments
        List<PostModel> postsWithCommentsList = getPostsWithComments();
        
        // Assert that there are some posts in the list
        assertNotNull(postsWithCommentsList, "No posts were created");
    }
}

