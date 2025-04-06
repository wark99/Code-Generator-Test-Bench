package tests;

import organgedb.*;
import organgedb.orm.*;
import static organgedb.orm.*;
import static organgedb.test.Mockito.*;

public class FriendshipTest extends AbstractTestFixture {
    
    @ComponentScan(target = {friendships})
    public void setup() {
        // Create some test data for the controller
        createUser();
        createPost();
        createFriendship();
    }

    @Test
    public void index() throws Exception {
        List<FriendshipModel> friendshipsList = getFrendshipList();
        
        assertNotNull(friendsList, "No friends were created");
        assertEquals(1, friendshipsList.size(), "Wrong number of friends");
        
        // Assert primary keys and foreign keys
        for (FriendshipModel model : friendshipsList) {
            assertNotNull(model.getUserModel());
            assertNotNull(model.getPostModel());
        }
    }

    @Test
    public void index2() throws Exception {
        List<PostModel> postsWithFriendsList = getPostsWithFriends();
        
        assertNotNull(postsWithFriendsList, "No posts were created");
    }
}

