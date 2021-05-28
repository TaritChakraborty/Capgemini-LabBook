package com.capgemini.jse.Lab6;

import java.util.HashMap;
import java.util.Scanner;

public class SquareOfNumber {
	public static HashMap<Integer,Integer> getSquares(int[] arr){
		int len = arr.length;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < len ; i++) {
			int pow = arr[i] * arr[i];
			hm.put(arr[i], pow);
		}
		return hm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int[] arr = new int[limit];
		for(int i = 0 ; i < limit ; i++) {
			int elm = sc.nextInt();	
			arr[i] = elm;
		}
        System.out.println(getSquares(arr));
        sc.close();
	}
}
