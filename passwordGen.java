import java.util.*;

public class passwordGen {
	public static void main(String[] args) {
	int length = 15;
	System.out.println(Password(length));
	}
static char[] Password( int len) {
	System.out.println("Generating password");
	System.out.println("Pasword: ");
	String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	String numbers = "0123456789";
	String specialchars = "1234567890-_=+,./<>?;";
	String values = 
		upperCase + lowerCase + numbers + specialchars;
	Random rand_method = new Random();
	char[] password = new char[len];
	for(int i = 0; i < len; i++){
	password[i] = values.charAt
		(rand_method.nextInt(values.length()));
	}
	return password;
	}
}
