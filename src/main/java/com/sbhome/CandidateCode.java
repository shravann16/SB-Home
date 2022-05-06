package com.sbhome;

import java.io.*;
import java.util.*;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No Of Test Cases ");
		int noOfTestCases = sc.nextInt();
		
		int min = 0;
		int c1 = 0;
		int c2 = 0;
		int N = 0;
		
		for (int k = 0; k < noOfTestCases; k++) {
			 c1  = 0;
			 c2  = 0;
			 N   = 0;
			 min = 0;
			
			System.out.println("Enter NoOfChaco and C1 and C2 for Test Case : " + k);
			N = sc.nextInt();
			c1 = sc.nextInt();
			c2 = sc.nextInt();

			for (int i = 0, j = N; i <= N && j >= 0; i++, j--) {
				int value = (int) ((int) c1 * Math.pow(i, 2) + c2 * Math.pow(j, 2));
				System.out.println(" " + i + "  " + j + "  ==  " + value);
				if (min == 0)
					min = value;
				if (value < min)
					min = value;
			}
			System.out.println("Hanna Test Case : "+ k +" Min Value is " + min);
		}

		

	}
}
