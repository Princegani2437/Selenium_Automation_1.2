package generic_utility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Ganesh N Bhat
 */
public class Java_utility {
/**
 *This method is used to capture current system date and time
 * @return system date and time
 * 
 */
	
	
	
	public String getSystemtime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will return random numbers within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ram = new Random();
		return ram.nextInt(1000);
	}
}
