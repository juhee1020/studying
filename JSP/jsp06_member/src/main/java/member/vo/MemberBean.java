package member.vo;

public class MemberBean {

	private String member_id;
	private String member_pw;
	private String member_name;
	private int member_age;
	private String member_gender;
	private String member_email;



	// 게터세터
	public String getMember_id() {return member_id;}
	public void setMember_id(String member_id) {this.member_id = member_id;}

	public String getMember_pw() {return member_pw;}
	public void setMember_pw(String member_pw) {this.member_pw = member_pw;}

	public String getMember_name() {return member_name;}
	public void setMember_name(String member_name) {this.member_name = member_name;}

	public int getMember_age() {return member_age;}
	public void setMember_age(int member_age) {this.member_age = member_age;}

	public String getMember_gender() {return member_gender;}
	public void setMember_gender(String member_gender) {this.member_gender = member_gender;}

	public String getMember_email() {return member_email;}
	public void setMember_email(String member_email) {this.member_email = member_email;}



	@Override
	public String toString() {
		return "MemberBean [member_id=" + member_id + ", member_pw=" + member_pw + ", member_name=" + member_name
				+ ", member_age=" + member_age + ", member_gender=" + member_gender + ", member_email=" + member_email
				+ "]";
	}

}
