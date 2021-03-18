import model.Post;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class PatchPostTest extends BaseTest {

    @Test
    public void updatePost() {

        Post post = new Post("Update");

        Post createPost = given()
                                .spec(reqSpec)
                                .pathParam("postId",3)
                                .body(post).
                           when()
                                .patch("{postId}")
                           .then()
                                .spec(resSpec)
                                .extract().body().as(Post.class);

        assertEquals(createPost.getTitle(), "Update");
    }
}
