package utils;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.UsersData;

import static io.restassured.RestAssured.*;

public class APIUtils {

    static UsersData data = new UsersData();
    static UsersData data1 = new UsersData();
    public static UsersData getData() {
        data.setId(10);
        data.setCustomer("keerthi");
        data.setQuantity(5);
        data.setPrice("100");
        data.setInStock(false);
        return data;
    }

    public static UsersData updateData() {
        data1.setCustomer("Jagadeesh");
        data1.setQuantity(10);
        data1.setPrice("200");
        data1.setInStock(true);
        return data1;
    }
    public static Response postUser(String endpoint) {
        Response response = given()
                .accept(ContentType.JSON)
                .body(getData())
                .when().post(endpoint);
        return response;
    }

    public static Response getUser(String endpoint,String userId) {
        Response response = given()
                .accept(ContentType.JSON)
                .pathParam("id", userId)
                .when().get(endpoint);
        return response;
    }



    public static Response updateUser(String endpoint,String userId) {
        Response response = given()
                .accept(ContentType.JSON)
                .pathParam("id", userId)
                .body(updateData())
                .when().put(endpoint);
        return response;
    }

    public static Response deleteUser(String endpoint,String userId) {
        Response response =
                given()
                        .accept(ContentType.JSON)
                        .pathParam("id", userId)
                        .when().delete(endpoint);

    return response;
    }
}