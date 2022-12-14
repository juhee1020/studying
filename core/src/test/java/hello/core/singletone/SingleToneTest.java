package hello.core.singletone;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class SingleToneTest {
    @Test
    @DisplayName("스프링 없는 순수한 DI 컨테이너")
    void pureContainer(){
        AppConfig appConfig=new AppConfig();
        // 1. 조회 : 호출할 때마다 객체를 생성
        MemberService memberService1=appConfig.memberService();
        MemberService memberService2=appConfig.memberService();

        System.out.println("memberservice1 : "+ memberService1);
        System.out.println("memberservice2 : "+ memberService2);
        // 각각 다른 객체

        // memberservice1=/=memberservice2
        assertThat(memberService1).isNotSameAs(memberService2);
    }
}
