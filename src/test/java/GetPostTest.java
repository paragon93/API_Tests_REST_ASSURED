import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPostTest extends BaseTest {

    @Test
    public void getPost() {
        given()
                .pathParam("postId", 3)
                .spec(reqSpec).
        when()
                .get("{postId}").
        then()
                .spec(resSpec)
                .assertThat().body("title", equalTo("Post3"))
                .assertThat().body("author", equalTo("User3"));
    }
}
