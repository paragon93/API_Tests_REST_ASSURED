import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetPostsTest extends BaseTest {

    @Test
    public void getPosts() {
        given()
                .spec(reqSpec).
        when()
                .get().
        then()
                .spec(resSpec);
    }
}
