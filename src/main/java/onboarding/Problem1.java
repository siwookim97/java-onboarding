package onboarding;

import java.util.ArrayList;
import java.util.List;

class Problem1 {

    /**
     * 예외사항 확인 메서드
     *
     * @param name 책을 펼치는 사람, Integer형의 List로 길이는 2
     * @return 예외 사항이 있을 시 true, 그 외엔 false를 반환
     */
    static boolean isException(List<Integer> name) {
        if ((name.get(0) < 1) || name.get(1) > 400)
            return true;
        else if ((name.get(0) == null) || (name.get(1) == null))
            return true;
        else if (name.get(0) % 2 != 1)
            return true;
        else if (name.get(1) % 2 != 0)
            return true;
        else if ((name.get(1) - name.get(0)) != 1)
            return true;
        else if ((name.get(0) == 1 || name.get(0) == 399 || name.get(1) == 2 || name.get(1) == 400)) {
            return true;
        }

        return false;
    }

    /**
     * 각 자릿수의 숫자를 구하는 메서드
     *
     * @param num 책의 페이지
     * @return 각 자릿수를 구해 Integer형 List로 반환
     */
    static List<Integer> calcEachDigitNum (Integer num) {
        List<Integer> list = new ArrayList<>();

        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }

        return list;
    }

    /**
     * 자릿수의 계산 중 큰 수를 구하는 메서드
     *
     * @param digitNumList 각 자릿수의 수가 들어있는 List
     * @return 각 자리수의 덧셈과 곱셈중 큰 수를 리턴
     */
    static int calcLargestNum(List<Integer> digitNumList) {
        int sum = 0;
        int mul = 1;

        for (int i = 0; i < digitNumList.size(); i++) {
            sum += digitNumList.get(i);
            mul *= digitNumList.get(i);
        }

        return sum > mul ? sum : mul;
    }

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }
}