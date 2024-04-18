package com.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//로또넘버를 담는 배열, 유저로 부터 입력 받는 배열은 '숫자의 중복을 피하고', '정렬하는 기능'이 필요하기 때문에 ArrayList를 사용하는 방식에서 TreeSet을 사용하는 방식으로 바꿨습니다. 
public class LottoNumberGenerator {
    private Random rand = new Random();
    
    // ArrayList를 사용한 로또넘버 생성 버전
//    public List<Integer> generate() {
//        List<Integer> numbers = new ArrayList<>();
//        while (numbers.size() < 6) {
//            int randomNumber = rand.nextInt(45) + 1;
//            if (!numbers.contains(randomNumber)) {  // 중복 번호 체크
//                numbers.add(randomNumber);
//            }
//        }
//        Collections.sort(numbers);  // 숫자 정렬
//        return numbers;
//    }
    
    public Set<Integer> generate() {
        Set<Integer> numbers = new TreeSet<>();
        while (numbers.size() < 6) {
            int randomNumber = rand.nextInt(45) + 1;
            numbers.add(randomNumber); // TreeSet은 중복을 자동으로 처리하고 정렬함
        }
        return numbers;
    }
}
