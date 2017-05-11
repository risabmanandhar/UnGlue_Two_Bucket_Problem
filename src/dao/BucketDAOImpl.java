package dao;

import controller.BucketController;
import model.Bucket;

public class BucketDAOImpl implements BucketInterface {

    @Override
    public void drawConclusion(Bucket bucket1, Bucket bucket2, int numberOfStepsInCase1, int numberOfStepsInCase2) {
	BucketController bController = new BucketController();
	bController.drawConclusion(bucket1, bucket2, numberOfStepsInCase1, numberOfStepsInCase2);
	// We can have more methods implemented if different scenario occurs as
	// future enhancement
    }

    @Override
    public int produceSolution(Bucket b1, Bucket b2, float goal) {
	BucketController bControllerSc1 = new BucketController();
	return bControllerSc1.produceSolution(b1, b2, goal);
	// We can have more methods implemented if different scenario occurs as
	// future enhancement
    }

}
