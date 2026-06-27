package base;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import utils.ReadPropertyFile;

import java.io.IOException;

public class BaseTest {

    @BeforeClass
    public void setUp() throws IOException {
        RestAssured.baseURI = ReadPropertyFile.getRoutesFromPropertyFile("baseUrl");

    }
}
