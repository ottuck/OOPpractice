package com.lotto;

import java.util.Set;

public interface LottoResultDisplayImp {

	void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, int matchCount, String resultMessage);

}