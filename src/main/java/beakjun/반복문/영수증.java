package beakjun.반복문;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int numberOfTypes = sc.nextInt();
        int[][] purchaseList = new int[numberOfTypes][2];
        for (int i = 0; i < numberOfTypes; i++) {
            for (int j = 0; j < 2; j++) {
                purchaseList[i][j] = sc.nextInt();
            }
        }
        int temporaryTotal = 0;
        for (int i = 0; i < numberOfTypes; i++) {
            temporaryTotal += purchaseList[i][0] * purchaseList[i][1];
        }
        if(total == temporaryTotal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
