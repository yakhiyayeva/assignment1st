import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//
//       //1
//        int result = sc.nextInt();
//        sc.close();
//        System.out.println("Sum of squares up to " + result + ": " + Task1.calculateSum(result));
//
//        //2
//        int arraySize = sc.nextInt();
//        int[] array = new int[arraySize];
//        for (int i = 0; i < arraySize; i++) {
//            array[i] = sc.nextInt();
//        }
//        int n = sc.nextInt();
//        int sum = Task2.sumOfFirstNElements(array, n);
//        System.out.println("Sum of first " + n + " elements of the array: " + sum);
//        sc.close();
//
//        //3
//        int nTask3 = sc.nextInt();
//        int sumTask3 = Task3.sumOfFirstNInts(nTask3);
//        System.out.println("Sum of the first " + nTask3 + " positive integers: " + sumTask3);
//        sc.close();
//
//        //4
//        int b = sc.nextInt();
//        int nTask4 = sc.nextInt();
//        int sumTask4 = Task4.sumOfFirstNPows(b, nTask4);
//        System.out.println( sumTask4);
//        sc.close();
//
//
//        //5
//            Scanner scanner = new Scanner(System.in);
//            int number = scanner.nextInt();
//            Task5.reversedSequence(scanner, n);
//
//            scanner.close();
//        //6
//        //public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.println("Enter the number of strings:");
//            int n = scanner.nextInt();
//            System.out.println("Enter the strings:");
//
//            Task6.reverseStrings(scanner, n);
//
//            scanner.close();
        //7
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the size of the square:");
//        int n = scanner.nextInt();
//
//        int[][] square = new int[n][n];
//        Task7.fillSpiral(square, 1, 0, 0, 0, n); // Start filling from the top-left corner
//        Task7.printSquare(square, n); // Print the filled square
//
//        scanner.close();
        //8
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//
//        Task8.generateSequences(n, k, "");
//
//        scanner.close();
        //9
//        char[] input1 = {'A', 'B'};
//        System.out.println("Sample Output 1:");
//        Task9.Permutations(input1, 0, input1.length - 1);
//
//        char[] input2 = {'I', 'O', 'X'};
//        System.out.println("\nSample Output 2:");
//        Task9.Permutations(input2, 0, input2.length - 1);
//    }
        //10
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number between 0 and 32:");
            int inputNumber = scanner.nextInt();
            scanner.close();

            if (isPowerOfTwo(inputNumber))
                System.out.println(inputNumber + " is a power of two");
            else
                System.out.println(inputNumber + " is not a power of two");
        }

//    private static boolean isPowerOfTwo(int inputNumber) {
//        public static boolean isPowerOfTwo(int n) {
//            // base case: if n = 1, it's a power of 2
//            if (n == 1)
//                return true;
//            else if (n % 2 != 0 || n == 0)
//                return false;
//                //recursive case: continue dividing n by 2
//            else
//                return isPowerOfTwo(n / 2);
//        }
//    }
}

    }
