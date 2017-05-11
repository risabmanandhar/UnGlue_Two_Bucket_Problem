package utils;

import java.util.Scanner;

public class InputOutputHandler {
    private Scanner scan = new Scanner(System.in);

    public float readPositiveFloatFromConsole() {
	float value = 0;
	boolean notValid = true;
	do {
	    String input = scan.nextLine();
	    try {
		value = Float.parseFloat(input);
		if (value > 0) {
		    notValid = false;
		} else {
		    this.printMessage("Please enter positive value greater than 0:");
		}
	    } catch (Exception e) {
		this.printMessage("Please enter numeric characters only:");
	    }
	} while (notValid);
	return value;
    }

    public void printMessage(String msg) {
	System.out.print(msg);
    }

    public void closeHandler() {
	this.scan.close();
    }
}
