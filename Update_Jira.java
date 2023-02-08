package Week3_Jira;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Update_Jira {
	@Test
	public void updatejiraincident()
	{
		
		RestAssured.baseURI="https://restapi23jan.atlassian.net/rest/api/2/";
		RestAssured.authentication=RestAssured.preemptive().basic("sathishkumarvijayaraghavan@gmail.com","ATATT3xFfGF0Tsed9TxGSjGrvv8ZrGA4iFbEwZJ9qB0DF095K9-fzqf7bmeuZcDyXjeaXs3rxEwsiGwo6fOTK1lN5KqMo1allo9K4oeSI9i-DdmMmwpcmx20GaDpC6W5crZEKE0iwYxtABzQWPCsN_qHC5-ET5byCWFgIyly9fhZMoNlpR0EpTw=CF1BFE93");
		RequestSpecification body = RestAssured.given().contentType("application/json").accept("application/json").when().body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "\r\n"
				+ "        \"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "    }\r\n"
				+ "}\r\n"
				+ "");
		
		Response put = body.put("/issue/10032");
		int statuscode = put.getStatusCode();
		System.out.println("Status code for update incident" + statuscode);
	    put.prettyPrint();
		
	}

}
