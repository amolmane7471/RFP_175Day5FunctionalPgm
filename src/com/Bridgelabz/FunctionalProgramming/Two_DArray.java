package com.Bridgelabz.FunctionalProgramming;

import java.util.Scanner;

public class Two_DArray {
		Scanner sc=new Scanner(System.in);
		
		public int[][] arrayInputInt(int m, int n) {
			int[][] arr = new int[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			return arr;
		}
		public void print2dArrayInt(int[][] result) {
			System.out.println("Printing result array");
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					System.out.print(result[i][j] + " ");
				} 
				System.out.println();
			}
		}
		public double[][] arrayInputDouble(int m, int n) {
			double[][] arr = new double[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextDouble();
				}
			}
			return arr;
		}
		public void print2dArrayDouble(double[][] resultDouble) {
			System.out.println("Printing result array");
			for (int i = 0; i < resultDouble.length; i++) {
				for (int j = 0; j < resultDouble[i].length; j++) {
					System.out.print(resultDouble[i][j] + " ");
				}
				System.out.println();
			}
		}
		public boolean[][] arrayInputBoolean(int m, int n) {
			boolean[][] arr = new boolean[m][n];

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextBoolean();
				}
			}
			return arr;
		}
		 
		public void print2dArrayBoolean(boolean[][] resultBoolean) {
			System.out.println("Printing result of array");
			for (int i = 0; i < resultBoolean.length; i++) {
				for (int j = 0; j < resultBoolean[i].length; j++) {
					System.out.print(resultBoolean[i][j] + " ");
				}
				System.out.println();
			}

		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Two_DArray a= new Two_DArray();
			int m, n;
			System.out.println("Select option\n 1.int array\n 2.double array\n 3.boolean array");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter row and column of array");
				m = scanner.nextInt();
				n = scanner.nextInt();
				System.out.println("Enter element for array");
				int[][] arr = a.arrayInputInt(m, n);
				a.print2dArrayInt(arr);
				break;
			case 2:
				System.out.println("Enter row and column of array");
				m = scanner.nextInt();
				n = scanner.nextInt();
				System.out.println("Enter element for array");
				double[][] doubleArr = a.arrayInputDouble(m, n);
				a.print2dArrayDouble(doubleArr);
				break;
			case 3:
				System.out.println("Enter row and column of array");
				m = scanner.nextInt();
				n = scanner.nextInt();
				System.out.println("Enter element for array");
				boolean[][] boolArr = a.arrayInputBoolean(m, n);
				a.print2dArrayBoolean(boolArr);
				break;

			default:
				System.out.println("Please select valid option");
				break;
			}

			scanner.close();

		}

	}

