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
		@RequestMapping(value = "/score", method = RequestMethod.GET)
		public String update(String rev) {
			StringBuilder sb = new StringBuilder(rev);

			return sb.reverse().toString();
		}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public int add(int number1, int number2) {

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

	@RequestMapping(value = "/sub", method = RequestMethod.GET)
	public int sub(int number1, int number2) {

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

	@RequestMapping(value = "/multi", method = RequestMethod.GET)
	public int multi(int number1, int number2) {

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


	@RequestMapping(value = "/div", method = RequestMethod.GET)
	public int div(int number1, int number2) {

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

//GET Method= path?number1=value1&number1=value2
