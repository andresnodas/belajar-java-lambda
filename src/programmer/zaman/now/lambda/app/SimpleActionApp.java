package programmer.zaman.now.lambda.app;

import programmer.zaman.now.lambda.SimpleAction;

public class SimpleActionApp {

	public static void main(String[] args) {
		
		/*SimpleAction simpleAction = new SimpleAction() {
			
			@Override
			public String action(String name) {
				return "Andres";
			}
		};

		System.out.println(simpleAction.action("Andres")); //Andres
		
		SimpleAction simpleAction2 = (String name) -> {
			return "Nodas";
		};
		
		System.out.println(simpleAction2.action("Nodas"));*/
		
		
		/*SimpleAction simpleAction1 = (String name) -> {
			return "Hello " + name;
		};
		
		SimpleAction simpleAction2 = (name) -> {
			return "Hello " + name;
		};*/
		
		SimpleAction simpleAction1 = (String name) -> "Hello " + name;
		
		SimpleAction simpleAction2 = (name) -> "Hello " + name;
		
		SimpleAction simpleAction3 = name -> "Hello " + name;
		
	}
	
}
