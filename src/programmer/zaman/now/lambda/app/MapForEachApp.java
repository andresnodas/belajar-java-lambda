package programmer.zaman.now.lambda.app;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class MapForEachApp {

	public static void main(String[] args) {
		
		Map<String, String> map = Map.of(
			"Andres", "Andres Value",
			"Nodas", "Nodas Value"
		);
		
		//for each
		for(Entry<String, String> entry : map.entrySet())
			System.out.println(entry.getKey() + ":" + entry.getValue());
		
		//Anonymous Class
		map.forEach(new BiConsumer<String, String>() {
			@Override
			public void accept(String key, String value) {
				System.out.println(key + ":" + value);
			}
		});
		
		//Lambda
		map.forEach((key, value) -> System.out.println(key + ":" + value));
	}
	
}
