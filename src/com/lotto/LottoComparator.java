package com.lotto;

import java.util.Set;

public class LottoComparator {
	public static class Result {
        private final int matchCount;
        private final String message;

        public Result(int matchCount, String message) {
            this.matchCount = matchCount;
            this.message = message;
        }

        public int getMatchCount() {
            return matchCount;
        }

        public String getMessage() {
            return message;
        }
    }
	
	private int compare(Set<Integer> lottoNumbers, Set<Integer> userNumbers) {
	        int matchCount = 0;
	        for (int number : userNumbers) {
	            if (lottoNumbers.contains(number)) {
	                matchCount++;
	            }
	        }
	        return matchCount;
	    }
	
//	private int compare(Set<Integer> lottoNumbers, Set<Integer> userNumbers) {
//	    return (int) userNumbers.stream()     
//	                            .filter(lottoNumbers::contains) 
//	                            .count();                        
//	}

	public Result determineResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers) {
        int matchCount = compare(lottoNumbers, userNumbers);
        String resultMessage;
        switch (matchCount) {
            case 6:
                resultMessage = "1등입니다!";
                break;
            case 5:
                resultMessage = "2등입니다!";
                break;
            case 4:
                resultMessage = "3등입니다!";
                break;
            case 3:
                resultMessage = "4등입니다!";
                break;
            default:
                resultMessage = "당첨되지 않았습니다.";
                break;
        }
        return new Result(matchCount, resultMessage);
    }
    
}
