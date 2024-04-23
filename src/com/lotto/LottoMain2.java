package com.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 1. 기능에 따라 method 를 만들었지만 클래스로 나누기전에 OOP의 다섯원칙인 SOLID원칙 중 제 1원칙인 단일책임원칙(SRP)원칙을 지켜야 합니다.
    showResult 클래스는 결과만 출력하지 않고 등수계산 기능도 가지고 있습니다. 이를 분리하여 등수계산, 결과출력 클래스로 나눠 볼 수 있을것 같습니다.
 2. main 클래스에서 array 를 인스턴스화해서 parameter로 보내는것 보다 각 기능을 담당하는 메소드에서 처리하고 반환하는게 날것 같습니다. 
*/
public class LottoMain2 {
	public static void main(String[] args) {
		List<Integer> lottoNumArr = new ArrayList<Integer>(6);
		List<Integer> inputNumArr = new ArrayList<Integer>(6);
		
		generateLottoNumbers(lottoNumArr);
		inputNumbers(inputNumArr);
		
		// 출력을 정렬
		Collections.sort(lottoNumArr); 
		Collections.sort(inputNumArr); 
		
		int matchCount = compareNumbers(lottoNumArr, inputNumArr);
		showResult(lottoNumArr, inputNumArr, matchCount);	
	}

	private static void generateLottoNumbers(List<Integer> lottoNumArr) {
		Random rand = new Random();
		
		// 로또넘버 생성 중복없을시 lottoNumArr 배열에 넣기
		while (lottoNumArr.size() < 6) {
			int randomNumber = rand.nextInt(45) + 1; // 45까지 랜덤숫자 생성
			if (!lottoNumArr.contains(randomNumber)) // 중복 확인
				lottoNumArr.add(randomNumber);
		}
	}

	private static void inputNumbers(List<Integer> inputNumArr) {
		Scanner sc = new Scanner(System.in);
		
		// 유저에게 입력 받은 로또 정보 inputNumArr 배열에 넣기
		System.out.println("로또 번호를 입력하세요(숫자범위:1~45)");
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
		sc.close();
	}

	private static int compareNumbers(List<Integer> lottoNumArr, List<Integer> inputNumArr) {
		// 번호 비교
		int matchCount = 0;
		for (int number : inputNumArr) {
			if (lottoNumArr.contains(number)) {
				matchCount++;
			}
		}
		return matchCount;
	}

	private static void showResult(List<Integer> lottoNumArr, List<Integer> inputNumArr, int matchCount) {
		// 맞힌 숫자와 몇등인지 출력
		System.out.println("생성된 로또 번호: " + lottoNumArr);
		System.out.println("입력한 번호: " + inputNumArr);
		System.out.println("맞힌 번호의 개수: " + matchCount);
		
		String resultMsg;
		// 등수 출력
		switch (matchCount) {
		case 6:
			resultMsg = "1등입니다!";
			break;
		case 5:
			resultMsg = "2등입니다!";
			break;
		case 4:
			resultMsg = "3등입니다!";
			break;
		case 3:
			resultMsg = "4등입니다!";
			break;
		default:
			resultMsg = "당첨되지 않았습니다.";
			break;
		}
		System.out.println("결과 : " + resultMsg);
	}
	
}
