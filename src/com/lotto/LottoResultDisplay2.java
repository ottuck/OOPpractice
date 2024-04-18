package com.lotto;

import java.util.Set;

public class LottoResultDisplay2 implements LottoResultDisplayImp {
    @Override
    public void showResult(Set<Integer> lottoNumbers, Set<Integer> userNumbers, int matchCount, String resultMessage) {
        // CLI환경에서 적용가능한 ANSI 색상 코드
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_BLUE = "\u001B[34m";

        System.out.println(ANSI_GREEN + "생성된 로또 번호: " + ANSI_RESET + lottoNumbers);
        System.out.println(ANSI_BLUE + "입력한 번호: " + ANSI_RESET + userNumbers);
        System.out.println(ANSI_YELLOW + "맞힌 숫자: " + ANSI_RESET + matchCount);
        System.out.println("결과: " + resultMessage);
    }
}
