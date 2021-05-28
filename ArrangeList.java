package com.capgemini.jse.Lab6;

import java.util.*;
public class ArrangeList {
	public static List<Integer> getValues(HashMap<Integer,Integer> hm) {
		List<Integer> l1 = new ArrayList<Integer>(hm.values());
		Collections.sort(l1);
		return l1;
	}
	public static void main(String[] args) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for(int i = 0 ; i < limit ; i++) {
			int elm = sc.nextInt();
			hm.put(i, elm);
		}
		System.out.println(getValues(hm));
		sc.close();
	}
}
