package com.lotto;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//v1: ArrayList를 사용하여 로또넘버를 생성
//v2: 로또넘버를 담는 배열, 유저로 부터 입력 받는 배열은 '숫자의 중복을 피하고', '정렬하는 기능'이 필요하기 때문에 ArrayList를 사용하는 방식에서 TreeSet을 사용하는 방식으로 바꿨습니다. 
//v3: 마지막으로 람다표현식으로 바꿔봤습니다. 람다 표현식을 빠르게 이해하기 위해서는 generate, limit, boxed 등 해당 기능을 명확히 알고 있어야하기 때문에 가독성은 전통적인 방식의 표현이 좋은것 같다고 생각합니다.
public class LottoNumberGenerator {
    private Random rand = new Random();
    
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
    
//    public Set<Integer> generate() {
//        Set<Integer> numbers = new TreeSet<>();
//        while (numbers.size() < 6) {
//            int randomNumber = rand.nextInt(45) + 1;
//            numbers.add(randomNumber); // TreeSet은 중복을 자동으로 처리하고 정렬함
//        }
//        return numbers;
//    }
    
    public Set<Integer> generate() {
        return IntStream.generate(() -> rand.nextInt(45) + 1) // 무한 스트림 생성
                        .limit(6)   // 스트림으로 6개만 요소만 처리
                        .boxed()    // TreeSet 컬렉션에 넣기 위해 int를 Integer로 박싱
                        .collect(Collectors.toCollection(TreeSet::new)); // 결과를 TreeSet에 수집
    }
}
