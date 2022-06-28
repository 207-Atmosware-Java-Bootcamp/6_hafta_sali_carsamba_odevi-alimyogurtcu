package com.turkcell.Odevler;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		
		int arrayLength = getArrayLength();
		int[] cloneArray = setArrayRandom(arrayLength).clone();
		
		showArray(cloneArray);
		maxAndMinNumber(cloneArray);
		sumAndAve(cloneArray);
		oddAndEven(cloneArray);
		binarySearch(cloneArray);
		removeDuplicateElements(cloneArray);
		showDuplicates(cloneArray);
		
	}
	
	public static int getArrayLength() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizi eleman sayisi: ");
		try {
			return scan.nextInt();
		} catch (Exception e) {
			System.out.print("Sayi girmelisiniz");
			System.exit(0);
			return 0;
		}
		
	}
	
	public static int[] setArrayRandom(int length) {
		int randomArray[] = new int[length];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = new Random().nextInt(10) + 1;
		}
		
		return randomArray;
	}
	
	public static void maxAndMinNumber(int[] array) {
		Arrays.sort(array);
		System.out.println("En kucuk sayi: " + array[0]);
		System.out.println("En buyuk sayi: " + array[array.length - 1]);
	}
	
	public static void showArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void sumAndAve(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		System.out.println("Toplam: " + sum);
		System.out.println("Ortalama: " + df.format((double) sum / array.length));
	}
	
	public static void oddAndEven(int[] array) {
		int odd = 0, even = 0, oddCount = 0, evenCount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				even += array[i];
				evenCount++;
			} else {
				odd += array[i];
				oddCount++;
			}
		}
		
		System.out.println("Dizide " + oddCount + " tane tek sayi var. Toplami: " + odd);
		System.out.println("Dizide " + evenCount + " tane tek sayi var. Toplami: " + even);
	}
	
	public static void binarySearch(int[] array) {
		
		if (Arrays.binarySearch(array, 5) > 0)
			System.out.println("Dizide 5 var.");
		else
			System.out.println("Dizide 5 yok.");
	}
	
	public static void removeDuplicateElements(int array[]) {
		int j = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			}
		}
		array[j++] = array[array.length - 1];
		System.out.print("Tekrarlilar 1 kere: ");
		
		for (int k = 0; k < j; k++) {
			System.out.print(array[k] + " ");
		}
		
		System.out.println();
	}
	
	public static void showDuplicates(int[] array) {
		int count = 0;
		System.out.print("Tekrar edenler: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.print(array[j] + " ");
					count++;
				}
			}
		}
		if (count == 0)
			System.out.print("Yok");
	}
	
}