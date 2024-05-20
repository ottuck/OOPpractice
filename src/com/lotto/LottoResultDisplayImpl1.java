package com.lotto;

import java.util.Set;

import com.lotto.LottoComparator.Result;

public class LottoResultDisplayImpl1 implements LottoResultDisplay {
    @Override
	public void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, Result result) {
        System.out.println("생성된 로또 번호: " + lottoNumbers);
        System.out.println("입력한 번호: " + userNumbers);
        System.out.println("맞힌 숫자: " + result.getMatchCount() + "개");
        System.out.println("결과: " + result.getMessage());
    }
}
