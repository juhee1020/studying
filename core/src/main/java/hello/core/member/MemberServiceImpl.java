package hello.core.member;

public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository=new MemoryMemberRepository();

    @Override
    public void join(Member member) { // 오버라이드 된걸 오버라이드 해온거
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
