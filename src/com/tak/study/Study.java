package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수값 : ");
        int number = sc.nextInt();

        System.out.println("마지막 자릿수를 제외한 값은 : " + (number / 10) + "입니다.");
        System.out.println("마지막 자릿수는 : " + (number % 10) + "입니다.");

        /* number % 100 으로 하면 끝에 2자리를 뽑아올 수 있다. % 1000 이라고 하면 3자리 */

    }

}
