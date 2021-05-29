package com.capgemini.jse.Lab6;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static int getSorted(int[] arr) {
		int len = arr.length;
		int rem, revnum, num;
		for(int i = 0 ; i < len ; i++) {
			num = arr[i];
			revnum = 0;
			while(num > 0) {
				rem = num % 10;
				revnum = revnum * 10 + rem;
				num = num / 10;
			} arr[i] = revnum;
		}
		Arrays.sort(arr);
		StringBuilder str = new StringBuilder();
		for(int i = 0 ; i < len ; i++) {
			str.append(arr[i]);
		} int result = Integer.parseInt(str.toString());
		return result;		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int[] arr = new int[limit];
		for(int i = 0 ; i < limit ; i++) {
			int elm = sc.nextInt();
			arr[i] = elm;
		} 
		System.out.println(getSorted(arr));
        sc.close();
	}

}
