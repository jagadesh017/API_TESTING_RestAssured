package tests;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Keerthi {

    static void main() {
        /*
        given - pathparm, query params, username,id, body
        when- req type- get,put,post,update,delete
        then- logs-report -- status code, headers, body,cookies
         */
given()
        .pathParam("id", "V_GVuL3DbrU")
        .when().delete("http://localhost:3000/users/{id}")
        .then().log().all();
    }
}
//http://localhost:3000/users/V_GVuL3DbrU
// --> delete-base url -> unique id - send req
