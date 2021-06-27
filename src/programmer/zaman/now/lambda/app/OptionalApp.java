package programmer.zaman.now.lambda.app;

import java.util.Optional;

public class OptionalApp {

	public static void main(String[] args) {
		
		sayHello("Andres");
		sayHello(null); // Tidak terjadi apa apa
	}
	
	public static void sayHello(String name) {
		//Menggunakan optional
		Optional<String> optionalName = Optional.ofNullable(name);
		Optional<String> optionalUpperName = optionalName.map(String::toUpperCase);
		optionalUpperName.ifPresent(value -> System.out.println("Hello " + name));
		
		//Menggunakan chain
		Optional.ofNullable(name)
			.map(String::toUpperCase)
			.ifPresent(value -> System.out.println("Hello " + value));
		
		Optional.ofNullable(name)
			.map(String::toUpperCase)
			.ifPresentOrElse(
				value -> System.out.println("Hello " + value),
				() -> System.out.println("Hello") //Dijalankan untuk bagian data null
			);
		
		String upperName = Optional.ofNullable(name)
			.map(String::toUpperCase)
			.orElse("TEMAN"); //Mengembalikan data jika null
		
		System.out.println("Hello " + upperName);
		
		/* //Menggunakan if
		if(name != null){
			String upperName = name.toUpperCase();
			System.out.println("Hello " + upperName);
		}*/
	}
	
}
