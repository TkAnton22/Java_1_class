/*
Java ДЗ №2
@author Антон Ткачев
version 11/09/21
*/
class HomeWork_2 {
    public static void  main (String[] args) {
		
		System.out.println("Задание 1:");
		System.out.println(sumNumbers(9, 0));
		System.out.println(sumNumbers(9, 2));
		System.out.println(sumNumbers(19, 2));
		System.out.println("Задание 2:");
		checkNumber(-9);
		checkNumber(0);
		checkNumber(9);
		System.out.println("Задание 3:");
		System.out.println(returnNumber(5));
		System.out.println(returnNumber(-5));
		System.out.println("Задание 4:");
		arrPrint("lorem ipsum", 3);
		System.out.println("Задание 5*:");
		System.out.println(yearCheck(2020));
		System.out.println(yearCheck(2021));
	}
	static boolean sumNumbers(int a, int b) {
		return ((a + b  >= 10) && (a + b <= 20));
	}
	static void checkNumber(int a) {
	    System.out.println(a >= 0? "Число положительное" : "Число отрицательное");
	}
	static boolean returnNumber(int b) {
	    return (b < 0);	
	}
	static void arrPrint(String text, int a) {
		for (int i = 0; i < a; i++){
		System.out.println(text);
		}
	}
	static boolean yearCheck(int x) {
		return (x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0); 
	}
	
	
}
		
		
		
	

