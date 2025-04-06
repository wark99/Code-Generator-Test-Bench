package controllers;

import organgedb.core.modelorm.*;
import java.util.List;
import static organgedb.core.test.Mockito.*;

public class FriendshipController implements CRUDController<FriendshipModel> {
    @ComponentScan(target = {controller})
    public static void index() {
        // Create a new friendship between user and post
        createFriendship();
    }

    @ComponentScan(target = {controller})
    public static void index2() {
        // Get all friendships
        List<FriendshipModel> friendsList = getFriends();
        
        // Assert that there are some friendships in the list
        assertNotNull(friendsList, "No friendships were created");
        assertEquals(2, friendsList.size(), "Wrong number of friendships");

        // Assert primary keys and foreign keys
        for (FriendshipModel model : friendsList) {
            assertNotNull(model.getUserModel());
            assertNotNull(model.getPostModel());
        }
    }

    @ComponentScan(target = {controller})
    public static void index3() {
        // Get all posts with their friendships
        List<PostModel> postsWithFriendsList = getPostsWithFriends();
        
        // Assert that there are some posts in the list
        assertNotNull(postsWithFriendsList, "No posts were created");
    }
}

