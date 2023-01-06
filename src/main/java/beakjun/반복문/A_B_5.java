package beakjun.반복문;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A_B_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int key = 1;
        int value = 1;
        while(true) {
            key = sc.nextInt();
            value = sc.nextInt();
            if (key == 0 && value == 0) {
                break;
            }
            list.add(key + value);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
