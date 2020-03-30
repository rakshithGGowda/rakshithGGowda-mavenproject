package steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import org.json.simple.JSONObject;
import dataProvider.ConfigFileReader;
import io.restassured.http.ContentType;


public class BDDStyleMethod extends ConfigFileReader {
   static JSONObject m=new JSONObject();
    public static void SimpleGetMethod(String postNumber)
    {
//    	System.out.println(postNumber);
        given().contentType(ContentType.JSON).when().get(String.format(getEndPointUri1()+"/%s",postNumber)).then().body("author",is("Rakshith G"));
    }
    public static void PerformCollections()
    {
//    	System.out.println(getBaseUri()+getEndPointUri());
        given().contentType(ContentType.JSON).when().get(getBaseUri()+getEndPointUri1()).
                then().body("author",containsInAnyOrder("typicode","Rakshith G","Vignesh","Indu")).statusCode(200);
    }
    public static void WithPathParam()
    {
        given().contentType(ContentType.JSON).with().pathParams("post",2).
                when().get(getBaseUri()+getEndPointUri1()+"/{post}").then().body("title",containsString("300Rs")).statusCode(200);
    }
    public static void WithQueryParam()
    {
        given().contentType(ContentType.JSON).queryParams("id",1).
                when().get(getBaseUri()+getEndPointUri1()).then().body("author",hasItem("typicode")).statusCode(200);
    }
    public static void PostMethod(String id,String title,String aname)
    {

        m.put("id",id);
        m.put("title",title);
        m.put("author",aname);
        String a=m.toJSONString();
        given().contentType(ContentType.JSON).body(a).
                when().post("/posts").then().statusCode(500);
    }
    public static void DeleteMethod(String id)
    {
    	System.out.println(id);
        given().contentType(ContentType.JSON).when().request().delete(String.format(getEndPointUri1()+"/%s",id)).then().statusCode(200);
    }

}
