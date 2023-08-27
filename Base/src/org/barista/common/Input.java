package org.barista.common;

import java.util.Scanner;

public class Input {
	
	// 입력 받는 기능
	// facade pattern
	
	static Scanner scan = new Scanner(System.in);
	
	//String type - enter 전까지 입력
	public static String read(String title) {
		
		System.out.print(title);
		
		return scan.nextLine();
	}
	
	// 값을 입력하면 입력한 값 리턴, enter 입력하면 기본 값 리턴
	public static String read(String title, String defaultValue) {
		
		System.out.printf("%s %s", title, defaultValue);
		
		String value = scan.nextLine(); // nextLine() : null을 리턴하지 않음
		
		if(value == "") {
			return defaultValue;
		}
		
		return value;
	}
	
	// int type return - 숫자 입력 후 숫자만 리턴 (enter는 제거)
	public static int readInt(String title) {
		
		System.out.println(title);
		
		int value = scan.nextInt();
		scan.nextLine(); // enter 제거
		
		return value;
	}
}
