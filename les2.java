public class HelloWorld{
    static String COLOR = "RED";
    static String test;

	public static void main(String[] args){
		
	
		System.out.println("Hello World!");
		COLOR = "green";
		test = "orange";

		{
			System.out.println("I want to love JAVA again " + COLOR + " " + test);
		}
	}

}