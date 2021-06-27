package programmer.zaman.now.lambda.app;

import java.util.function.Function;
import java.util.function.Predicate;

import programmer.zaman.now.lambda.util.StringUtil;

public class MethodReferenceApp {

	public static void main(String[] args) {
		
		Predicate<String> predicate = StringUtil::isLowerCase;
		
		System.out.println(predicate.test("Andres"));
		System.out.println(predicate.test("andres"));
		
		//Method Reference di parameter
		
		Function<String, String> functionUpper = String::toUpperCase;
		
		System.out.println(functionUpper.apply("Andres")); //ANDRES
	}
	
	public void run() {
		Predicate<String> predicate = this::isLowerCase;
		
		System.out.println(predicate.test("Andres"));
		System.out.println(predicate.test("andres"));
		
	}
	
	public void run2() {
		MethodReferenceApp app = new MethodReferenceApp();
		
		Predicate<String> predicate = app::isLowerCase;
		
		System.out.println(predicate.test("Andres"));
		System.out.println(predicate.test("andres"));
		
	}
	
	public boolean isLowerCase(String value) {
		
		for(char c : value.toCharArray()) {
			if(!Character.isLowerCase(c))
				return false;
		}
		
		return true;
	}
	
}
