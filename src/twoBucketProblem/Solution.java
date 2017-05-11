package twoBucketProblem;

import dao.BucketDAOFactory;
import model.Bucket;
import utils.InputOutputHandler;

public class Solution {
    public static void main(String[] args) {
	float inputValue;
	float goal;
	int numberOfStepsInCase1 = 0, numberOfStepsInCase2 = 0;

	InputOutputHandler ioHandler = new InputOutputHandler();

	ioHandler.printMessage("Enter the capacity for the first bucket in gallons:");
	inputValue = ioHandler.readPositiveFloatFromConsole();
	Bucket bucket1 = new Bucket(inputValue);

	ioHandler.printMessage("Enter the capacity for the second bucket in gallons:");
	inputValue = ioHandler.readPositiveFloatFromConsole();
	Bucket bucket2 = new Bucket(inputValue);

	ioHandler.printMessage("Enter the desired amount of gallons to be collected in any of the bucket:");
	inputValue = ioHandler.readPositiveFloatFromConsole();

	while (inputValue >= bucket1.getCapacity() && inputValue >= bucket2.getCapacity()) {
	    ioHandler.printMessage(
		    "Desired amount of gallons cannot greater than the Large Bucket size. Please enter the valid amount:");
	    inputValue = ioHandler.readPositiveFloatFromConsole();
	}
	goal = inputValue;

	ioHandler.printMessage("\nFilling the bucket with capacity of " + bucket2.getCapacity() + " gallons first\n");
	ioHandler.printMessage("-----------------------------------------\n");
	numberOfStepsInCase1 = BucketDAOFactory.getSolution().produceSolution(bucket1, bucket2, goal);

	ioHandler.printMessage("\nFilling the bucket with capacity of " + bucket1.getCapacity() + " gallons first\n");
	ioHandler.printMessage("-----------------------------------------\n");
	numberOfStepsInCase2 = BucketDAOFactory.getSolution().produceSolution(bucket2, bucket1, goal);

	BucketDAOFactory.getConclusion().drawConclusion(bucket1, bucket2, numberOfStepsInCase1, numberOfStepsInCase2);
	ioHandler.closeHandler();
    }
}