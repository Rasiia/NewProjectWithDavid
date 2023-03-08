package API;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;
public class GetDiseases {

    @Test
    public void testGetDiseases() {

 Response response =RestAssured.given()
            .header("Accept","application/json")
         .header("Cookie","_ga=GA1.2.126873983.1676224973; connect.sid=s%3ACIa3uqjxywZ0oe73WOSWM4dDijdDn0_M.HOY%2BWG2D5FKGvS7LnpZWXJy4Y4vAJqXBk49C1BVr1dA; ab.storage.deviceId.a9882122-ac6c-486a-bc3b-fab39ef624c5=%7B%22g%22%3A%22d23ab68a-b80a-72bc-06bc-f0d9964ca851%22%2C%22c%22%3A1679411016785%2C%22l%22%3A1679411016786%7D; _gid=GA1.2.601476126.1679938259; _gat=1")

        .when().get("http://www.techtorialacademy.link/app/getdiseases/")
        .then().statusCode(200).and().extract().response();
        System.out.println(response.getBody().asString());


    }

}

