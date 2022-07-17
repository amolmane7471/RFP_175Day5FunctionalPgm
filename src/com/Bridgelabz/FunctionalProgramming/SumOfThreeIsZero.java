package com.Bridgelabz.FunctionalProgramming;

import java.util.Scanner;

public class SumOfThreeIsZero {
	public void sumOfThreeIsZero(int[] arr) {
		System.out.println("Array : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " is distinct triplets");
					}
				}
			}
		}

	}

		public static void main(String[] args) {
			SumOfThreeIsZero sum=new SumOfThreeIsZero();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter number for elements");
			int count=scanner.nextInt();
			System.out.println("Enter elements");
			int[] arr=new int[count];
			for (int i = 0; i < count; i++) {
				arr[i]=scanner.nextInt();
			}
			sum.sumOfThreeIsZero(arr);
					scanner.close();

		}

	}

