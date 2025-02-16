package insight_global.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import insight_global.day5.CredentialException;


public class CredentialTester {
	public static void main(String[] args) {
		try {
		getCredentials();
		System.out.println("Welcome to the App");
		}catch(CredentialException e) {
		System.out.println(e);
		}
	

}
private static void getCredentials() throws CredentialException{
	try(
	BufferedReader reader=
	new BufferedReader(new InputStreamReader(System.in));
	){
		System.out.println("Enter userId: ");
		String userid=reader.readLine();
		if(!userid.equals("admin")) {
			throw new CredentialException(userid);
		}
		}catch(IOException e) {
		}
	}
}
