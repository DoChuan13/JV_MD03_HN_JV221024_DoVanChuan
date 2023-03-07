package Exam_B1;

import java.util.Scanner;

public class Exam_B1 {
    public static void main(String[] args) {
        //Create Menu
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[100];
        int[] sizeArray = new int[1];
        sizeArray[0] = 100;
        int option;
        do {
            System.out.print("\n****************HACKATHON-JAVA-BASIC-1-MENU***************\n" +
                    "1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím\n" +
                    "2. In ra giá trị các phần tử trong mảng\n" +
                    "3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng\n" +
                    "4. In ra giá trị lớn nhất và nhỏ nhất trong mảng\n" +
                    "5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng\n" +
                    "6. In ra mảng đảo ngược\n" +
                    "7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng\n" +
                    "8. Sắp xếp mảng tăng dần\n" +
                    "9. Thoát\n");
            System.out.print("Nhập chức năng muốn thực thi: ");
            option = input.nextInt();
            if (option != 9) {
                switch (option) {
                    case 1:
                        inputIntArray(intArray, sizeArray);
                        break;
                    case 2:
                        displayIntArray(intArray, sizeArray);
                        break;
                    case 3:
                        displayOddValue(intArray, sizeArray);
                        break;
                    case 4:
                        findMinMaxValue(intArray, sizeArray);
                        break;
                    case 5:
                        findNumberDivide2And3(intArray, sizeArray);
                        break;
                    case 6:
                        reverseArray(intArray, sizeArray);
                        break;
                    case 7:
                        findPrimeNumber(intArray, sizeArray);
                        break;
                    case 8:
                        ascendingArray(intArray, sizeArray);
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại");
                        break;
                }
            } else {
                System.out.println("Ứng dụng sẽ được kết thúc!!!");
            }
        } while (option != 9);
    }

    //1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím
    public static void inputIntArray(int[] intArray, int[] sizeArray) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Vui lòng nhập kích thước thực của mảng số nguyên (max = 100): ");
            size = input.nextInt();
            if (size < 0 || size > 100) {
                System.out.println("Kích thước mảng số nguyên không hợp lệ, vui lòng nhập lại...");
            }
        } while (size < 0 || size > 100);
        sizeArray[0] = size;
        for (int i = 0; i < size; i++) {
            System.out.printf("Nhập phần tử thứ %d của mảng %d phần tử: ", (i + 1), size);
            intArray[i] = input.nextInt();
        }
        System.out.printf("\nMảng %d phần tử đã được nhập thành công\n", size);
    }

    //2. In ra giá trị các phần tử trong mảng
    public static void displayIntArray(int[] intArray, int[] sizeArray) {
        int size = sizeArray[0];
        System.out.print("Danh sách phần tử của mảng là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + "\t");
        }
    }

    //3. Tính tổng và in ra các phần tử có giá trị lẻ trong mảng
    public static void displayOddValue(int[] intArray, int[] sizeArray) {
        System.out.print("Danh sách phần tử số lẻ trong mảng là: ");
        int size = sizeArray[0];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (intArray[i] % 2 != 0) {
                System.out.print(intArray[i] + "\t");
                sum += intArray[i];
            }
        }
        System.out.printf("\nTổng của các số lẻ là %d\n", sum);
    }

    //4. In ra giá trị lớn nhất và nhỏ nhất trong mảng
    public static void findMinMaxValue(int[] intArray, int[] sizeArray) {
        int min = intArray[0], max = intArray[0];
        int size = sizeArray[0];
        for (int i = 0; i < size; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            } else if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        System.out.printf("Giá trị lớn nhất trong mảng là %d\n", max);
        System.out.printf("Giá trị lớn nhỏ trong mảng là %d\n", min);

    }

    //5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng
    public static void findNumberDivide2And3(int[] intArray, int[] sizeArray) {
        int size = sizeArray[0];
        int count = 0;
        System.out.printf("Danh sách các phần tử chia hết cho cả 2 và 3 trong mảng là: ");
        for (int i = 0; i < size; i++) {
            if (intArray[i] % 2 == 0 && intArray[i] % 3 == 0) {
                count++;
                System.out.print(intArray[i] + "\t");
            }
        }
    }

    //6. In ra mảng đảo ngược
    public static void reverseArray(int[] intArray, int[] sizeArray) {
        int size = sizeArray[0];
        for (int i = 0; i < size / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[size - i - 1];
            intArray[size - i - 1] = temp;
        }
        System.out.printf("Mảng đảo ngược là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + "\t");
        }
    }

    //7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng
    public static void findPrimeNumber(int[] intArray, int[] sizeArray) {
        int size = sizeArray[0];
        int sum = 0;
        System.out.print("Danh sách số nguyên tố trong mảng là: ");
        for (int i = 0; i < size; i++) {
            boolean primeCheck = isPrime(intArray[i]);
            if (primeCheck) {
                System.out.print(intArray[i] + "\t");
                sum += intArray[i];
            }
        }
        System.out.printf("\nTổng của các số nguyên tố trong mảng là: %d", sum);
    }

    //8. Sắp xếp mảng tăng dần
    public static void ascendingArray(int[] intArray, int[] sizeArray) {
        int size = sizeArray[0];
        System.out.println("Mảng tăng dần là: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (intArray[j] > intArray[i]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + "\t");
        }
    }


    //Extra Is Prime
    public static boolean isPrime(int number) {
        boolean flag = true;
        if (number < 2) {
            flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

}
