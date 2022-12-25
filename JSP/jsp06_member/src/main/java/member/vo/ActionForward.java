package member.vo;

public class ActionForward {
	
	private boolean isRedirect = false;
	private String path = null; // 다음으로 이동할 화면
	
	public boolean isRedirect() {
		return isRedirect;
	}
	
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
}