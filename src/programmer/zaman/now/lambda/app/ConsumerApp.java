package programmer.zaman.now.lambda.app;

import java.util.function.Consumer;

public class ConsumerApp {

	public static void main(String[] args) {
		
		Consumer<String> consumer1 = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		Consumer<String> consumer2 = value -> System.out.println(value);
		
		consumer2.accept("Andres Nodas");
		
	}
	
}
