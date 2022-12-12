package com.lec.ex03_interface;

public class ButtonMain {
	public static void main(String[] args) {
		Button button = new Button();
		button.setListener(new Call());
		button.click();
		
		button.setListener(new Message());
		button.click();
		
		// 실습. YouTube - 동영상을 시청합니다., SendMail - 메일을 보냅니다. 
		button.setListener(new YouTube());
		button.click(); // 동영상을 시청합니다.
		button.setListener(new SendMail());
		button.click(); // 메일을 보냅니다.
	}
}
class YouTube implements Button.OnClickListener{
	@Override
	public void OnClick() {System.out.println("동영상을 시청합니다.");}
}
class SendMail implements Button.OnClickListener{
	@Override
	public void OnClick() {System.out.println("메일을 보냅니다.");}
}