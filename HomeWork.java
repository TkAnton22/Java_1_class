class HomeWork {
    public static void main(String[] args) {
	
	printThreeWords();
	checkSumSign(2, 17);
	printColor();
	compareNumbers(666, 66);
	
	}
	static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	static void checkSumSign(int a, int b) {
		if (a + b >= 0){
			System.out.println("Сумма положительная");
		} else {
			System.out.println("Сумма отрицательная");
		}
		//System.out.println(a + b >= 0?"Сумма положительная" : "Сумма отрицательная");
			
	}
	static void printColor() {
		int value = 22;
		if (value <= 0) {
			System.out.println("Красный");
		} else if (value > 0 || value <= 100) {
			System.out.println("Желтый");
		} else {
			System.out.println("Зеленый");
		}		
	}
    static void compareNumbers(int a, int b) {
		if (a >= b) {
			System.out.println("a >= b");
		} else {
			System.out.println("a < b");
		}
		//System.out.println(a >= b?"a >= b" : "a < b");
	}
}

//input for test
// another input for test 