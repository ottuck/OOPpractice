package com.lotto;

import java.util.Set;

import com.lotto.LottoComparator.Result;
import static com.lotto.AnsiColorCode.*; //색상코드가 담긴 enum 클래스를 임포트할때 코드 간결성을 위해 정적 임포트를 사용하였습니다

public class LottoResultDisplay2 implements LottoResultDisplayImp {
    @Override
    public void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, Result result) {
    	 // ANSI 색상 코드
//        final String RESET = "\u001B[0m";
//        final String YELLOW = "\u001B[33m";
//        final String GREEN = "\u001B[32m";
//        final String BLUE = "\u001B[34m";
        
        System.out.println(GREEN + "생성된 로또 번호: " + RESET + lottoNumbers);
        System.out.println(BLUE + "입력한 번호: " + RESET + userNumbers);
        System.out.println(YELLOW + "맞힌 숫자: " + RESET + result.getMatchCount() + "개");
        System.out.println("결과: " + result.getMessage());
    }
}
