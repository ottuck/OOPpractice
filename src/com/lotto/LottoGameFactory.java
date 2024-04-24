package com.lotto;

public class LottoGameFactory {
	 public static LottoGame createLottoGame() {
	        LottoNumberGenerator generator = new LottoNumberGenerator();
	        LottoUserInput userInput = new LottoUserInput();
	        LottoComparator comparator = new LottoComparator();
	        LottoResultDisplayImp display = new LottoResultDisplay2(); // 인터페이스를 사용하여 원하는 출력방식으로 쉽게 바꿀 수 있다.(OCP원칙 적용)

	        return new LottoGame(generator, userInput, comparator, display);
	    }
}
