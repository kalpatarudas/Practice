package TestData;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredTest {
    @Test
    public void test_1(){
        RestAssured.get("https://reqres.in/api/users?page=2");
        Response res= RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(res.getStatusCode());
        System.out.println(res.getTime());
        System.out.println(res.getBody());
        int statcode= res.getStatusCode();
        Assert.assertEquals(statcode,200);

    }

}
