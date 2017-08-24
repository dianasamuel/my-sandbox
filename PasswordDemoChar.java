package com.samuel;
// https://stackoverflow.com/questions/8881291/why-is-char-preferred-over-string-for-passwords
// hashing from From https://dzone.com/articles/storing-passwords-java-web

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordDemoChar {

	public static void main(String[] args) {

		char[] salt = {'t','l','a','s'};
		char[] password1 = {'p','a','s','s','9','9'};
		
		char[] password2 = {'t','e','s','t','9','9'};
		
		System.out.println("hash password1 " + generateHash(password1));
		System.out.println("hash password2 " + generateHash(password2));
		System.out.println("hash password1 " + generateHash(password1));
		
		System.out.println(new String(concatChars(salt, password1)) );
		
		System.out.println("hash salt+password1 " +generateHash(concatChars(salt, password1)) );
		
		System.out.println("hash salt+password2 " +generateHash(concatChars(salt, password2)) );
	}

	public static char[] concatChars(char[] first, char[] second)
	{
		char[] combined = new char[first.length + second.length];
		
		for(int i=0; i<first.length;i++)
		{
			combined[i] = first[i];			
		}
		int counter = 0;
		for(int j=first.length; j<combined.length; j++)
		{
			combined[j] = second[counter];
			counter++;
		}
		
		return combined;
	}
	
	
	public static String generateHash(char[] input) {
		StringBuilder hash = new StringBuilder();

		try {
			MessageDigest sha = MessageDigest.getInstance("SHA-1");
			byte[] hashedBytes = sha.digest(new String(input).getBytes());
			char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
					'a', 'b', 'c', 'd', 'e', 'f' };
			for (int idx = 0; idx < hashedBytes.length; ++idx) {
				byte b = hashedBytes[idx];
				hash.append(digits[(b & 0xf0) >> 4]);
				hash.append(digits[b & 0x0f]);
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return hash.toString();
	}
}
