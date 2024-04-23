package com.lotto;

import java.util.Set;

import com.lotto.LottoComparator.Result;

public class LottoGame {
	LottoNumberGenerator generator = new LottoNumberGenerator();
	LottoUserInput userInput = new LottoUserInput();
	LottoComparator comparator = new LottoComparator();
	
	// 인터페이스를 사용하여 원하는 출력방식으로 쉽게 바꿀 수 있다.(OCP원칙 적용)
//  LottoResultDisplayImp display = new LottoResultDisplay1();
	LottoResultDisplayImp display = new LottoResultDisplay2();

	public void playLotto() {
		Set<Integer> lottoNumbers = generator.generate();
        Set<Integer> userNumbers = userInput.getUserInput();
        Result result = comparator.determineResult(lottoNumbers, userNumbers);
        display.showResult(lottoNumbers, userNumbers, result);
	}
}
