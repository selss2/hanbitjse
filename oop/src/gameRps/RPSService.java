/**
 * 
 */
package gameRps;

/**
 * @date   :2016. 6. 20.
 * @author :오승준
 * @file   :RPSService.java
 * @story  : 
 */

public interface RPSService {
	public void betPlayerValue(int playerValue);
	public void setComputerValue();
	public void whoWin();
	public String showResult();
	public boolean checkValidation(String rps); // 유효성체크
}