import model.Post;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.testng.Assert.assertEquals;

public class UpdatePostTest extends BaseTest {

    @Test
    public void updatePost() {

        Post post = new Post("New author", "New title");

        Post createPost = given()
                                .spec(reqSpec)
                                .pathParam("postId",8)
                                .body(post).
                           when()
                                .put("{postId}")
                           .then()
                                .spec(resSpec)
                                .extract().body().as(Post.class);


    }
}
