package Week3_Jira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncident_Jira {
	@Test
	public void  createjiraincident ()
	{
		RestAssured.baseURI="https://restapi23jan.atlassian.net/rest/api/2/";
		RestAssured.authentication=RestAssured.preemptive().basic("sathishkumarvijayaraghavan@gmail.com","ATATT3xFfGF0Tsed9TxGSjGrvv8ZrGA4iFbEwZJ9qB0DF095K9-fzqf7bmeuZcDyXjeaXs3rxEwsiGwo6fOTK1lN5KqMo1allo9K4oeSI9i-DdmMmwpcmx20GaDpC6W5crZEKE0iwYxtABzQWPCsN_qHC5-ET5byCWFgIyly9fhZMoNlpR0EpTw=CF1BFE93");
		RequestSpecification body = RestAssured.given().contentType("application/json").accept("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": \r\n"
				+ "        {\r\n"
				+ "            \"key\": \"AP\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"create issue in Postman project\",\r\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the Postman\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}");
		Response post = body.post("issue/");
		                                
		post.prettyPrint();
		
		
	}
	

}
