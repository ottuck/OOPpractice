package com.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
  자료구조, OOP를 공부하기 위해 간단한 로또 프로그램을 만들어 봤습니다.
  지금부터 절차지향으로 짜여진 로또 프로그램을 객체지향으로 바꿔가겠습니다.
*/
public class LottoMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        List<Integer> lottoNumArr = new ArrayList<Integer>();
        List<Integer> inputNumArr = new ArrayList<Integer>();

        // 로또넘버 생성: 중복없이 lottoNumArr 배열에 넣기
        while (lottoNumArr.size() < 6) {
            int randomNumber = rand.nextInt(45) + 1;  // 1부터 45까지의 랜덤 숫자 생성
            if (!lottoNumArr.contains(randomNumber)) {  // 중복 확인
                lottoNumArr.add(randomNumber);
            }
        }
        Collections.sort(lottoNumArr);  // 로또 번호 정렬

        // 유저에게 입력 받은 로또 정보를 inputNumArr 배열에 넣기
        System.out.println("로또 번호를 입력하세요(숫자범위:1~45):");
        while (inputNumArr.size() < 6) {
            int inputNumber = sc.nextInt();
            if (inputNumber < 1 || inputNumber > 45) {
                System.out.println("1부터 45사이의 숫자를 입력해주세요.");
            } else if (inputNumArr.contains(inputNumber)) {
                System.out.println("이미 입력된 번호입니다. 다른 번호를 입력하세요.");
            } else {
                inputNumArr.add(inputNumber);
            }
        }
        Collections.sort(inputNumArr);  // 입력 번호 정렬

        // 로또 번호와 입력 번호 비교하여 맞힌 숫자와 몇 등인지 출력
        int matchCount = 0;
        for (int number : inputNumArr) {
            if (lottoNumArr.contains(number)) {
                matchCount++;
            }
        }

        System.out.println("생성된 로또 번호: " + lottoNumArr);
        System.out.println("입력한 번호: " + inputNumArr);
        System.out.println("맞힌 번호의 개수: " + matchCount);

        // 등수 출력
        switch (matchCount) {
            case 6:
                System.out.println("1등입니다!");
                break;
            case 5:
                System.out.println("2등입니다!");
                break;
            case 4:
                System.out.println("3등입니다!");
                break;
            case 3:
                System.out.println("4등입니다!");
                break;
            default:
                System.out.println("당첨되지 않았습니다.");
                break;
        }

        sc.close();
    }
}
