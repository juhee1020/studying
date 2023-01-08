package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    // 할인 정책을 변경하려면 클라이언트인 OrderServiceImpl 코드를 고쳐야 한다.  <-- 이렇게 고쳐야하는게 좋은 방법이 아닌것!
    // 3. 스프링 핵심 원리 이해2 - 객체 지향 원리 적용 <- 참고!

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member=memberRepository.findById(memberId);
        int discountPrice=discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //테스트 용도
    public MemberRepository getMemberRepository(){
        return memberRepository;
    }
}
