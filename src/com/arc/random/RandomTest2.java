package com.arc.random;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {

		//로또 번호 출력
		//1~45 6개

		Random random = new Random();

		for(int i=0;i<6;i++) {
			int num = random.nextInt(44)+1;
			//int num = random.nextInt(46);
			/*
			if(num==0) {
				i--;
				continue;
			}
			*/
				System.out.println(num);
			
		}
	}

}
