package programmer.zaman.now.lambda.util;

public class StringUtil {

	public static boolean isLowerCase(String value) {
		
		for(char c : value.toCharArray()) {
			if(!Character.isLowerCase(c))
				return false;
		}
		
		return true;
	}
	
}
