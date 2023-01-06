package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac = new
            AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("빈 이름으로 조회")
    void findBeanByName(){
        MemberService memberService=ac.getBean("memberService", MemberService.class);
        //System.out.println("memberService : "+memberService); //memberService : hello.core.member.MemberServiceImpl@172b013
        //System.out.println("memberService.getClass() : "+memberService.getClass()); //memberService.getClass() : class hello.core.member.MemberServiceImpl
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("이름 없이 타입만으로 조회")
    void findBeanByType(){
        MemberService memberService=ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    // 역할에 의존해야하기 때문에 아래껀 좋진않지만...!
    @Test
    @DisplayName("구체 타입으로 조회")
    void findBeanByName2(){
        MemberService memberService=ac.getBean("memberService", MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("빈 이름으로 조회X")
    void findBeanByNameX(){
        //ac.getBean("xxxxx",MemberService.class);
        //MemberService xxxxx=ac.getBean("xxxxx",MemberService.class); // No bean named 'xxxxx' available
        assertThrows(NoSuchBeanDefinitionException.class,
                ()->ac.getBean("xxxxx",MemberService.class));
        // 에러가 터져야 성공!
    }
}
