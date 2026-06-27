package tests;

import endpoints.APIEndpoints;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.APIUtils;

public class UserTests {
    String id;
    @Test
    public void createUserDetails(){
        Response response=
                APIUtils.postUser(APIEndpoints.USER_POST)
                        .then().log().all().extract().response();
        if(response.getStatusCode() == 201){
            System.out.println("User data created successfully.");
        }else {
            System.out.println("Failed to create user. Status code: " + response.getStatusCode());
        }

         id= response.jsonPath().getString("id");
        System.out.println("Created user ID is: " + id);
    }

    @Test(dependsOnMethods = "createUserDetails")
    public void getUserIDDetails(){
        Response response =
                APIUtils.getUser(APIEndpoints.USER_GET_ID, id)
                .then().log().all().extract().response();

        if(response.getStatusCode() == 200){
            System.out.println("User details retrieved successfully.");
        }else {
            System.out.println("Failed to retrieve user details. Status code: " + response.getStatusCode());
        }
    }
   // @Test(dependsOnMethods = "createUserDetails")
    public void deleteUserDetails(){
        Response response=
                APIUtils.deleteUser(APIEndpoints.USER_DELETE_ID,id)
                .then().log().all().extract().response();
        if(response.getStatusCode() == 200){
            System.out.println("User details deleted successfully.");
        }else {
            System.out.println("Failed to delete user details. Status code: " + response.getStatusCode());
        }
    }

    @Test(dependsOnMethods = "createUserDetails")
    public void updateUserDetails(){
        Response response=
                APIUtils.updateUser(APIEndpoints.USER_UPDATE,id)
                .then().log().all().extract().response();
    }

}
