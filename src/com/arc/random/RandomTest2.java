package com.arc.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {

		//로또 번호 출력
		//1~45 6개

		Random random = new Random();
		ArrayList<Integer> n = new ArrayList<Integer>();



		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1;
			//int num = random.nextInt(46);
			/*
			if(num==0) {
				i--;
				continue;
			}
			 */
			n.add(num);

			for(int j=0;j<i;j++) {
				if(n.get(j)==num) {
					i--;
					n.remove(j);
					break;
				}
			}
		}//for


		for(int i=0;i<6;i++) {
			System.out.println(n.get(i));
		}
		
	}//main

}
