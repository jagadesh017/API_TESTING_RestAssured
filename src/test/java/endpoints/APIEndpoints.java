package endpoints;

public class APIEndpoints {

    public static final String baseUrl = "http://localhost:3000/users";

    public static final String USER_ENDPOINT = "/users";
    public static final String USER_GET_ID = baseUrl+"/{id}";
    public static final String USER_DELETE_ID = baseUrl+"/{id}";
    public static final String USER_POST= baseUrl;
    public static final String USER_UPDATE = baseUrl+"/{id}";
}
