import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DeletePostTest extends BaseTest {

    @Test
    public void deletePost() {
        given()
                .pathParam("postId", 5)
                .spec(reqSpec).
        when()
                .get("{postId}").
        then()
                .spec(resSpec);

    }
}
