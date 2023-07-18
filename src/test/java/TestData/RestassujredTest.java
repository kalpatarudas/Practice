package TestData;

import io.restassured.RestAssured;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class RestassujredTest {

    @BeforeSuite
    void setup(){
        System.out.println("Setup");
    }

    @Test
    void getreq(){
        RestAssured.baseURI="https://reqres.in/api/users?page=2";
        //RestAssured.basePath="/api/users?page=2";
        given().queryParam("page","2");
        when().get().then().assertThat().statusCode(200);
        System.out.println(given().queryParam(get().statusLine()));
    }
    @AfterSuite
    void teardown(){



        System.out.println("teardown");
    }

}
