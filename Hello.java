import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Hello {
	private static String name = "a";
	public Hello() {
		
	}
	
	public static void main(String[] args) {
		try {
		System.out.println("Enter num1, num2, operator (+, -, *, /)");
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		String r = br.readLine();
		String[] tokens = r.split(",");
		int num1 = Integer.parseInt(tokens[0]);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}


