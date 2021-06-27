package programmer.zaman.now.lambda.app;

import java.util.function.Supplier;

public class LazyParameterApp {

	public static void main(String[] args) {
		
		testScore(90, getName()); //Eiger
		testScoreLazy(80, () -> getName()); //Lazy
		
	}
	
	public static void testScoreLazy(int score, Supplier<String> name) {
		if(score > 80)
			System.out.println("Selamat " + name.get() + ", Anda lulus ");
		else
			System.out.println("Coba lagi tahun depan");
	}
	
	public static void testScore(int score, String name) {
		if(score > 80)
			System.out.println("Selamat " + name + ", Anda lulus ");
		else
			System.out.println("Coba lagi tahun depan");
	}
	
	//Example method lambat
	public static String getName() {
		System.out.println("Method getName() dipanggil");
		return "Andres";
	}
	
}
