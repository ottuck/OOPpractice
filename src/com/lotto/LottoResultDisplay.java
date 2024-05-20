package com.lotto;

import java.util.Set;

import com.lotto.LottoComparator.Result;

public interface LottoResultDisplay {

	void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, Result result);

}