package com.lotto;

public class LottoGameFactory {
	 public static LottoGame createLottoGame(int displayNumber) {
	        LottoNumberGenerator generator = new LottoNumberGenerator();
	        LottoUserInput userInput = new LottoUserInput();
	        LottoComparator comparator = new LottoComparator();
	        LottoResultDisplayImp display = null; 	        
	        
	        if (displayNumber == 1) {
	        	display = new LottoResultDisplay1(); 
			} else if (displayNumber == 2) {
				display = new LottoResultDisplay2(); 
			}

	        return new LottoGame(generator, userInput, comparator, display);
	    }
}
