import io.restassured.http.ContentType;
import model.Post;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class AddPostTest extends BaseTest {

    @Test
    public void addPost() {

        Post post = new Post("New", "Post");

        Post createPost = given()
                                .spec(reqSpec)
                                .body(post).
                           when()
                                .post()
                           .then()
                                .statusCode(201)
                                .contentType(ContentType.JSON)
                                .extract().body().as(Post.class);

        assertEquals(post,createPost);

    }
}
