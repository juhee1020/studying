package code_study;
/*
숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

제한사항
1 ≤ p의 길이 ≤ 18
p의 길이 ≤ t의 길이 ≤ 10,000
t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
*/
class Solution3 {
    public int solution(String t, String p) {
    	int len=p.length();
    	int answer=0;
    	String cut3[]=new String[(t.length()-len+1)];
    	for(int i=0; i<cut3.length; i++) {
    		cut3[i]=t.substring(i, i+len);
    	}
    	for(int i=0; i<cut3.length; i++) {
    		//if(Integer.parseInt(cut3[i]) <= Integer.parseInt(p)) {
    		if(Long.parseLong(cut3[i]) <= Long.parseLong(p)) {
    		/* 여기서 Integer.parseInt를 사용하면 런타임 에러가 걸린다.
    		https://survive20.tistory.com/18 참고.
    		추가 설명 : Integer.parseInt를 사용하지 않은 이유 -> 
    		제 코드가 채점시 런타임에러가 나요.p의 제한사항으로 최대길이가 18자리 라고 주어졌는데, 
    		이 경우 Integer의 최댓값인 약21억(10자리)을 초과하기 때문에, 
    		처리하지못해서 더큰 정수형 데이터인 Long클래스의 parseLong을 사용한 것 입니다.*/
    			answer=answer+1;
    		}
    	}
        return answer;
    }
}