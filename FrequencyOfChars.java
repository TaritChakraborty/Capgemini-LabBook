package com.capgemini.jse.Lab6;

import java.util.*;

public class FrequencyOfChars {
	public static Map<Character,Integer> countChars(char[] charr){
		int len = charr.length;
		int[] frequency = new int[len];
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i = 0 ; i < len ; i++) {
			frequency[i] = 1;
			for(int j = i + 1 ; j < len ; j++) {
				if(charr[i] == charr[j]) {
					frequency[i]++;
					charr[j] = '0';
				}
			}
			hm.put(charr[i], frequency[i]);
		} hm.remove('0');
		return hm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		char[] charr = new char[limit];
		for(int i = 0 ; i < limit ; i++) {
			char chr = sc.next().charAt(0);
			charr[i] = chr;
		}
		System.out.println(countChars(charr));
        sc.close();
	}

}
