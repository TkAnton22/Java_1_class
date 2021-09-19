import java.util.Arrays;

class HomeWork3 {
    public static void main (String [] args) {
        changeNumber();
        System.out.println("Задание 2: " + (Arrays.toString(emptyArr(100))));
        multUp6(6);
        System.out.println("Задание 4: ");
        diagonal();
        System.out.println("Задание 5: " + (Arrays.toString(returnArr(7, 10101010))));
        elementsMinAndMax();
    }
    static void changeNumber() {
        int[] arr = new int[] {1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++)
        if (arr[i] == 0) {
            arr[i] = 1;
        } else arr[i] = 0;
        System.out.println("Задание 1: " + (Arrays.toString(arr)));
    }
    static int[] emptyArr(int a) {
        int[] emptyArr = new int[a];
        for (int i = 1; i <= a; i++) {
            emptyArr[i-1] = i;
        }
        return emptyArr;
    }
    static void multUp6(int b) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++)
        if (arr[i] < b) {
            arr[i] = (arr[i] * 2);
        }
        System.out.println("Задание 3: " + (Arrays.toString(arr)));
    }
    static void diagonal() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j) || (i == 3 - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int [] returnArr(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i <= (len - 1); i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    static void elementsMinAndMax() {
        int[] arr = new int[]{4, 6, 3, 7, 9, 1, 2};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Задание 6: min = " + min + " max = " + max);
    }
//решить остальные задачи у меня не вышло. Возможно с Вами разобрать их решение подробно?
}