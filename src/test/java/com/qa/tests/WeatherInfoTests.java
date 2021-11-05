package com.qa.tests;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.util.Helper;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class WeatherInfoTests extends TestBase{ 
	
	String serviceUrl = Helper.GetOverRideJenkinsUserName("serviceUrl");
	String TESTDATA_SHEET_PATH = Helper.GetOverRideJenkinsUserName("spreadSheet");
	String tab = Helper.GetOverRideJenkinsUserName("tab");
	
		@DataProvider
		public Object getData() throws Exception {
			Object testData[][] = TestUtil.getTestData(tab, TESTDATA_SHEET_PATH);
			return testData;

		}
		
		@Test(priority = 1, dataProvider = "getData")
		public void GetWeatherDetailsWithCorrectDataTest(String city, String HTTPMethod, String humidity,
				String temp, String weatherdescription, String windspeed, String winddirectiondegree) { //String serviceUrl

			//1, Define base uri
			RestAssured.baseURI = serviceUrl; //;
			
			//2, Define the request spec.		
			RequestSpecification httpRequest = RestAssured.given();
			
			//3, make a request
			Response response = httpRequest.request(Method.GET, "/"+city);
			
			//4, get the response body
			String responseBody = response.getBody().asString();
			System.out.println("Response body ="+responseBody);
			
			//5, Get Status code + validate it
			int statusCode = response.statusCode();
			System.out.println("Status code = "+statusCode);
			Assert.assertEquals(statusCode, TestUtil.RESPONSE_CODE_200);
			
			String statusLine = response.getStatusLine();
			System.out.println("Status line = "+statusLine);
			
			//6, Get headers
			Headers headers = response.getHeaders();
			System.out.println("Headers = "+headers);
			
			String Contentlength = response.getHeader("Content-Length");
			System.out.println("ContentLen = "+Contentlength);
			
			String ContentType = response.getHeader("Content-Type");
			System.out.println("ContentType = "+ContentType);
			
			
			JsonPath jsonPathValue = response.jsonPath();
			
			System.out.println("jsonPathValue = "+jsonPathValue.toString());
			
			String apiCity = jsonPathValue.get("City");
			Assert.assertEquals(city, apiCity );
			
			
			String apiHumidity = jsonPathValue.get("Humidity");
			//Assert.assertEquals(humidity, apiHumidity );
			
			String apiTemperature = jsonPathValue.get("Temperature");
			//Assert.assertEquals(temp, apiTemperature );
			
			String apiWeather_Description = jsonPathValue.get("WeatherDescription");
			//Assert.assertEquals(weatherdescription, apiWeather_Description );
			
			String apiWind_Speed = jsonPathValue.get("WindSpeed");
			//Assert.assertEquals(windspeed,apiWind_Speed );
			
			String apiWindDirectiondegree = jsonPathValue.get("WindDirectiondegree");
			//Assert.assertEquals(apiWindDirectiondegree, winddirectiondegree);
			
		
			//Output
			System.out.println("The value of City = "+apiCity);
			System.out.println("The value of Humidity = "+apiHumidity);
			System.out.println("The value of Temperature = "+apiTemperature);
			System.out.println("The value of Weather_Description = "+apiWeather_Description);
			System.out.println("The value of Wind_Speed = "+apiWind_Speed);
			System.out.println("The value of WindDirectiondegree = "+apiWindDirectiondegree);
			
			
			
			
			
			
			
		}
	
	

}
