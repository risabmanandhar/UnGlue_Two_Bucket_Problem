package controller;

import model.Bucket;
import utils.BucketUtil;

public class BucketController
{
    private static BucketUtil bUtil = new BucketUtil();

    public void drawConclusion(Bucket bucket1, Bucket bucket2, int numberOfStepsInCase1, int numberOfStepsInCase2) {
	System.out.println("\nConclusion");
	System.out.println("-----------------------------------------");
	if (numberOfStepsInCase2 < numberOfStepsInCase1) {
	    System.out.println("Filling the bucket with capacity of " + bucket1.getCapacity()
		    + " first is more efficient because");
	    System.out.println("goal can be reached in " + numberOfStepsInCase2 + " steps in comparison to "
		    + numberOfStepsInCase1 + " steps choosing to fill the bucket with capacity of "
		    + bucket2.getCapacity() + " first ");

	} else if (numberOfStepsInCase2 > numberOfStepsInCase1) {
	    System.out.println("Filling the bucket with capacity of " + bucket2.getCapacity()
		    + " first is more efficient because");
	    System.out.println("goal can be reached in " + numberOfStepsInCase1 + " steps in comparison to "
		    + numberOfStepsInCase2 + " steps choosing to fill the bucket with capacity of "
		    + bucket1.getCapacity() + " first ");
	} else {
	    System.out.println("Either way, choosing any of the bucket first leads to the goal in "
		    + numberOfStepsInCase2 + " steps.");
	}
    }

    public int produceSolution(Bucket b1, Bucket b2, float goal) {
	b2.emptyBucket();
	b1.emptyBucket();
	int steps = 0;
	b2.fillBucket();
	System.out.println("Step " + ++steps + ": Fill the bucket of capacity " + b2.getCapacity() + " gallons");
	bUtil.getBucketInformation(b1, b2);
	if (b2.getOccupancy() == goal || b1.getOccupancy() == goal) {
	    return steps;
	}
	while (true) {
	    bUtil.pourToAnotherBucket(b2, b1);
	    System.out.println("\nStep " + ++steps + ": Pour from bucket of capacity " + b2.getCapacity()
		    + " to bucket of capacity " + b1.getCapacity());
	    bUtil.getBucketInformation(b1, b2);

	    if (b2.getOccupancy() == goal || b1.getOccupancy() == goal) {
		return steps;
	    }

	    if (b2.isEmpty()) {
		b2.fillBucket();
		System.out.println("\nStep " + ++steps + ": Fill the bucket of capacity " + b2.getCapacity());
		bUtil.getBucketInformation(b1, b2);
	    }

	    if (b1.isFull()) {
		b1.emptyBucket();
		System.out.println("\nStep " + ++steps + ": Empty the bucket of capacity " + b1.getCapacity());
		bUtil.getBucketInformation(b1, b2);
	    }
	}
    }
}