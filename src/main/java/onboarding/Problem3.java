package onboarding;

public class Problem3 {

    /**
     * 숫자를 입력받아 손뼉을 치는 횟수를 구하는 메서드
     *
     * @param number 입력받은 숫자
     * @return 손뼉을 치는 횟수
     */
    static int countClap (int number) {
        int count = 0;
        while (number > 0) {
            if (number % 10 == 3 || number % 10 == 6 || number % 10 == 9) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
    public static int solution(int number) {
        int answer = 0;
        return answer;
    }
}
