import lombok.Data;

@Data // 롬복 - 투스트링,게터세터,이퀄즈앤드해시코드,리콰이어드콘스트럭터 자동생성
public class SocialUser {
    private String name;
    private String id;
    private String social;
    private String email;
    private String nickname;
    private String area;
}
