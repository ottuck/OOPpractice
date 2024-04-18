package com.lotto;

import java.util.Set;

public class LottoResultDisplay1 implements LottoResultDisplayImp {
    @Override
	public void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, int matchCount, String resultMessage) {
        System.out.println("생성된 로또 번호: " + lottoNumbers);
        System.out.println("입력한 번호: " + userNumbers);
        System.out.println("맞힌 숫자: " + matchCount);
        System.out.println("결과: " + resultMessage);
    }
}
