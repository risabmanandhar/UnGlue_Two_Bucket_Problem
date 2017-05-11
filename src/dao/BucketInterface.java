package dao;

import model.Bucket;

public interface BucketInterface {
    public void drawConclusion(Bucket bucket1, Bucket bucket2, int numberOfStepsInCase1, int numberOfStepsInCase2);

    public int produceSolution(Bucket b1, Bucket b2, float goal);

}
