package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.events.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

@Slf4j
@SpringBootTest
class DemoApplicationTests {



	@Test
	void contextLoads() {
		RestTemplate restTemplate= new RestTemplate();
		String url="https://api.openrouteservice.org/geocode/search?api_key=5b3ce3597851110001cf62482acfcf33648640fa98ca37a229d25cec&text=New%20York&layers=locality";
		LinkedHashMap result = restTemplate.getForObject(url, LinkedHashMap.class);
		System.out.println(result);
	}

//	@Test
//	void parameterRestTemplate(){
//		RestTemplate restTemplate= new RestTemplate();
//		String url="https://api.openrouteservice.org/geocode/search?api_key=5b3ce3597851110001cf62482acfcf33648640fa98ca37a229d25cec&text=New%20York&layers=locality";
//		ResponseEntity<PagedResources> eventsResponse = restTemplate.exchange(url,
//				HttpMethod.GET, null, ParameterizedTypeReference<Object.class>() {});
//	}

	@Test
	void httpClientGet(){
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet getRequest = new HttpGet(
					"https://api.openrouteservice.org/geocode/search?api_key=5b3ce3597851110001cf62482acfcf33648640fa98ca37a229d25cec&text=New%20York&layers=locality");
			getRequest.addHeader("accept", "application/json");

			HttpResponse response = httpClient.execute(getRequest);

			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(
					new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (ClientProtocolException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
