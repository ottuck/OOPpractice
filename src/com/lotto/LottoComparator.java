package com.lotto;

import java.util.Set;

public class LottoComparator {
	public int compare(Set<Integer> lottoNumbers, Set<Integer> userNumbers) {
	        int matchCount = 0;
	        for (int number : userNumbers) {
	            if (lottoNumbers.contains(number)) {
	                matchCount++;
	            }
	        }
	        return matchCount;
	    }
	 
    public String determineResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers) {
        int matchCount = compare(lottoNumbers, userNumbers);
        switch (matchCount) {
            case 6:
                return "1등입니다!";
            case 5:
                return "2등입니다!";
            case 4:
                return "3등입니다!";
            case 3:
                return "4등입니다!";
            default:
                return "당첨되지 않았습니다.";
        }
    }
   
}
