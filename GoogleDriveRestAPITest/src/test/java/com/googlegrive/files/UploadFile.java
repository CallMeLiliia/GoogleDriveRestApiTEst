package com.googlegrive.files;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UploadFile {
	
	private String acessToken ="Bearer ya29.Il-vBzzyBC_LCQ-18zpxvaq52H8sowb-6vDOyVmB1trJpg5PApUHGN99ypx_yIpdk4ZzNjAAEUuhAmj4Xsiu3jLMk0BWHouQDQjhzXH4WGDGl_xD1pigLMvpcMU7dSRwIA";
	
@Test	
	public void uploadPDFFile() {
	//Construct request
	String responceAsString = given().baseUri("https://www.googleapis.com")
	       .queryParam("uploadType", "media").header("Authorization", acessToken)
	       .get("/upload/drive/v3/files")
	      .body().asString();
	System.out.println(responceAsString);
		
	}

}
