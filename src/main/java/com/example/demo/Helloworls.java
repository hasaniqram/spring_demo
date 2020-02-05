package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller  
@RestController
public class Helloworls {
	
	//using get method and hello-world as URI  
		@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
		public String helloWorld() {
			return "Hello World";
		}


	@RequestMapping(value = "/plus", method = RequestMethod.GET)
	public int plus(int number1, int number2) {

		try {
			return number1 + number2;
		}

		// printStackTrace method 
		// prints line numbers + call stack 
		catch (Exception e){
			e.printStackTrace();

			// Prints what exception has been thrown 
			System.out.println(e);

		} return 0;
	}

	@RequestMapping(value = "/minus", method = RequestMethod.GET)
	public int minus(int number1, int number2) {

		try {
			return number1 - number2;
		}

		// printStackTrace method 
		// prints line numbers + call stack 
		catch (Exception e){
			e.printStackTrace();

			// Prints what exception has been thrown 
			System.out.println(e);

		} return 0;
	}

	@RequestMapping(value = "/into", method = RequestMethod.GET)
	public int into(int number1, int number2) {

		try {
			return number1 * number2;
		}

		// printStackTrace method 
		// prints line numbers + call stack 
		catch (Exception e){
			e.printStackTrace();

			// Prints what exception has been thrown 
			System.out.println(e);

		} return 0;
	}


	@RequestMapping(value = "/divided", method = RequestMethod.GET)
	public int divided(int number1, int number2) {

		try {
			return number1 / number2;
		}

		// printStackTrace method 
		// prints line numbers + call stack 
		catch (Exception e){
			e.printStackTrace();

			// Prints what exception has been thrown 
			System.out.println(e);

		} return 0;
	}
}
