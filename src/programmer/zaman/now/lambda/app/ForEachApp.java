package programmer.zaman.now.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {

	public static void main(String[] args) {
		
		List<String> names = List.of("Andres", "Nodas");
		
		//for each
		for(String name : names)
			System.out.println(name);
		
		//Anonymous Class
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
		
		//lambda
		names.forEach(name -> System.out.println(name));
		
		//lambda method reference
		names.forEach(System.out::println);
		
	}
	
}
