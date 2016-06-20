/**
 * 
 */
package gameRps;

/**
 * @date :2016. 6. 20.
 * @author :오승준
 * @file :rpsBean.java
 * @story :
 */
public class RPSBean {
	private String play,comp;
	
	public void setPlay(String play){
		switch (play) {
		case "1":
			this.play = "가위";
			break;
		case "2":
			this.play = "바위";
		default:
			this.play = "보";
			break;
		}
		this.play = play;
	}
	public void setComp(String comp){
		this.comp = comp;
	}
	public String getPlay(){
		return play;
	}
	public String getComp(){
		return comp;
	}
	@Override
	public String toString() {
		return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
	}
}