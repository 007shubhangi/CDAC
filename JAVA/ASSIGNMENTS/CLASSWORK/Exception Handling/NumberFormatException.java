//numberformatexception is uncheck it is optional to handle it.
//if we dont thrw it also okk
public class NumberFormatException {
    private static int convert(String str)throws java.lang.NumberFormatException{
		return Integer.parseInt( str );
	}
	public static void main(String[] args) {
		String str = "abc";
		int number = NumberFormatException.convert(str);
		System.out.println("Number	:	"+number);
	}

}
