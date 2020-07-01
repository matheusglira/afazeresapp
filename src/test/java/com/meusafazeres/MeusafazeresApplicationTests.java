package com.meusafazeres;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
class MeusafazeresApplicationTests {

	@Test
	public void consumirAPI() {
		RestTemplate template = new RestTemplate();
		
		String uri = "https://sv443.net/jokeapi/v2/joke/Miscellaneous?blacklistFlags=nsfw,religious,political,racist,sexist&format=txt";
		
		ResponseEntity<String> response = template.exchange(uri, HttpMethod.GET, null, String.class);
		
		System.out.println(response.getBody());
	}

}
