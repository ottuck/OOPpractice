package com.lotto;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.InputMismatchException;

public class LottoUserInput {		
    public Set<Integer> getUserInput() {
    	Scanner scanner = new  Scanner(System.in);
    	
        Set<Integer> inputNumbers = new TreeSet<>();
        System.out.println("로또 번호를 6개 입력해주세요.(숫자범위:1~45)");

        while (inputNumbers.size() < 6) {
            System.out.println((inputNumbers.size() + 1) + "번째 숫자:");
            try {
                int inputNumber = scanner.nextInt();

                if (inputNumber < 1 || inputNumber > 45) {
                    System.out.println("1부터 45 사이의 숫자를 입력해주세요.");
                } else if (!inputNumbers.add(inputNumber)) {
                    System.out.println("이미 입력된 번호입니다. 다른 번호를 입력하세요.");
                }
            } catch (InputMismatchException ime) {
                System.out.println("유효한 숫자를 입력해주세요. 문자나 특수 문자는 허용되지 않습니다.");
                scanner.next();  // 현재 라인 지우고 다음 입력 대기
                System.out.println();
            }
        }
        scanner.close();
        return inputNumbers;
    }

}
