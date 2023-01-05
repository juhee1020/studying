package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements  DiscountPolicy{
    private int discountFixAmount=1000; // 1000원 할인하겠다.
    @Override
    public int discount(Member member, int price) {
        if(member.getGradle()==Grade.VIP){ // enum타입은 == 쓰는게 맞다.
            return discountFixAmount; // 1000원 리턴
        }else return 0;
    }
}
