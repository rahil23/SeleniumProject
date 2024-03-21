import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.io.File;
import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Test2 {

    public static void main(String[] args) {

     /*   RestAssured.baseURI = "https://reqres.in/api/users";
       // C:\Users\Admin\IdeaProjects\SeleniumProject\src\test\schema.json

               String path  =  System.getProperty("user.dir")+"\\src\\test\\schema.json";


             JSONObject json = new JSONObject(path);
            System.out.println(json.getString("$id"));

       Response res = (Response) given().contentType("application/json").
                     queryParam("path",2).get().then().assertThat()
                     .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("C:\\Users\\Admin\\IdeaProjects\\SeleniumProject\\src\\test\\schema.json"))
                      .extract();

       System.out.println(res.prettyPrint());

        employee_id,first_name,last_name,manager_id
               1                            2
               2                            4
               3                            4
               4                            1
               5
               6
               7
                       Select first_name  from Employee e1 , Employee e2
                where employee_id e1 = manager_id e2 ; */


        String s1 = "ABCD";
        String s2 = "BCWD";
boolean flag=false;
if(s1.length()==s2.length()) {
    HashMap<Character, Integer> map = new HashMap();
    for (int i = 0; i < s1.length(); i++) {
        if (map.containsKey(s1.charAt(i))) {
            map.put(s1.charAt(i), map.get(s1.charAt(i) + 1));
        } else {
            map.put(s1.charAt(i), 1);
        }
    }
    System.out.println(map);

    for (int j=0;j<s2.length();j++)
    {
        if(map.containsKey(s2.charAt(j)))
        {
            map.put(s2.charAt(j), map.get(s2.charAt(j) - 1));
            flag=true;
        }
        else {
            flag=false;
            System.out.println("Not an Anagram");
            break;
        }
    }
    System.out.println("Anagram Result"+flag);

}
else {
    System.out.println("not an anagram");
}
    }

}
