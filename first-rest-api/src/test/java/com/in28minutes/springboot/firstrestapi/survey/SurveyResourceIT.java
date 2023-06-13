package com.in28minutes.springboot.firstrestapi.survey;

import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class SurveyResourceIT {
//	
	//http://localhost:8080/surveys/Survey1/questions/Question1
//	String str = """
//			
//			{
//			  "id": "Question1",
//			  "description": "Most Popular Cloud Platform Today",
//			  "options": [
//			    "AWS",
//			    "Azure",
//			    "Google Cloud",
//			    "Oracle Cloud"
//			  ],
//			  "correctAnswer": "AWS"
//			}
//			
//			""";
//	
//	
//	// 
//	
//	private static String SPECIFIC_QUESTION_URL = "/surveys/Survey1/questions/Question1";
//	
//	@Autowired
//	private TestRestTemplate template;
//	
//	//
//	//[Content-Type:"application/json", 
//
//	
//	@Test
//	void retrieveSpecificSurveyQuestion_basicScenario() throws JSONException {
//		ResponseEntity<String> responseEntity = template.getForEntity(SPECIFIC_QUESTION_URL, String.class);
//
//		String expectedResponse =
//				"""
//				{
//					"id":"Question1",
//					"description":"Most Popular Cloud Platform Today",
//					"correctAnswer":"AWS"
//				}
//				""";
//
//		JSONAssert.assertEquals(expectedResponse, responseEntity.getBody(), false);
//		//assertEquals(expectedResponse.trim(), responseEntity.getBody());
//		//System.out.println();
//		//System.out.println(responseEntity.getHeaders());
//	}
	
	
//}
