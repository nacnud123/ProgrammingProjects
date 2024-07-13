
package candidateReg;

import java.io.*;
import javax.swing.*;

/**
 * @author Duncan Armstrong
 *
 */

public class Input {
	private String nameIn;
	private String messageIn;

	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	public Input() {
		nameIn = "";
		messageIn = ""; /**/

	}

	public void setName() {
		if (nameIn.equals("")) {
			while (nameIn.equals("")) {
				nameIn = JOptionPane.showInputDialog("Enter your first name: ");
			}

		} else {
			nameIn = nameIn.replaceAll("[^a-zA-Z ]", "");
			getName();
		}

	}

	public void setMessage() {
		if (messageIn.equals("")) {
			while (messageIn.equals("")) {
				messageIn = JOptionPane.showInputDialog("Enter your message: ");
			}

		} else {
			messageIn = messageIn.replaceAll("[^a-zA-Z ]", "");
			if (messageIn.length() > 100) {
				JOptionPane.showMessageDialog(null, "Enter a message that is less than 100 characters long!", "Error",
						JOptionPane.INFORMATION_MESSAGE);
				System.exit(0);
			} else {
				getMessage();
			}
		}

	}

	public String getName() {
		return nameIn;
	}

	public String getMessage() {
		return messageIn;
	}

}
