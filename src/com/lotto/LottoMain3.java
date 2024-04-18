package com.lotto;

import java.util.Set;

/*
 1. SOLID원칙의 단일책임원칙(SRP)을 의식하며 객체지향프로그래밍(OOP)방식으로 개량하였습니다.
 2. 제2원칙인 개방/폐쇄원칙(OCP)을 의식하여 인터페이스를 사용할지 생각해 볼 필요가 있습니다.
 3. 로또넘버를 담는 배열, 유저로 부터 입력 받는 배열은 '숫자의 중복을 피하고', '정렬하는 기능'이 필요하기 때문에 
 	ArrayList를 사용하는 방식에서 TreeSet을 사용하는 방식으로 바꿨습니다. 
*/
public class LottoMain3 {
    public static void main(String[] args) {
        LottoNumberGenerator generator = new LottoNumberGenerator();
        LottoUserInput userInput = new LottoUserInput();
        LottoComparator comparator = new LottoComparator();
        
        //인터페이스를 사용하여 원하는 출력방식으로 쉽게 바꿀 수 있다.(OCP원칙 적용)
//        LottoResultDisplayImp display = new LottoResultDisplay1();
        LottoResultDisplayImp display = new LottoResultDisplay2();

        Set<Integer> lottoNumbers = generator.generate();
        Set<Integer> userNumbers = userInput.getUserInput();
        
        String resultMsg = comparator.determineResult(lottoNumbers, userNumbers);
        int matchCount = comparator.compare(lottoNumbers, userNumbers);
        display.showResult(lottoNumbers, userNumbers, matchCount, resultMsg);
    }
}
