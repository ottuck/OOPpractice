package com.lotto;

public class LottoGameFactory {
	 public static LottoGame createLottoGame(int displayNumber) {
	        LottoNumberGenerator generator = new LottoNumberGenerator();
	        LottoUserInput userInput = new LottoUserInput();
	        LottoComparator comparator = new LottoComparator();
	        LottoResultDisplay display = null; 	        
	        
	        if (displayNumber == 1) {
				display = new LottoResultDisplayImpl1();
				} else if (displayNumber == 2) {
				display = new LottoResultDisplayImpl2();
				} else {
				//유효하지 않은 번호가 입력 되었을 경우 default display 사용
				System.out.println("유효하지 않은 디스플레이 번호입니다. 기본 디스플레이를 사용합니다.");
	            display = new LottoResultDisplayImpl1(); 
				}

	        return new LottoGame(generator, userInput, comparator, display);
	    }
}
