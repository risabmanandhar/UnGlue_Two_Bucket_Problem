package utils;

import model.Bucket;

public class BucketUtil {
    
    public void getBucketInformation(Bucket b1, Bucket b2) {
	b2.displayBucket();
	b1.displayBucket();
    }

    public void pourToAnotherBucket(Bucket b1, Bucket b2) {
	if ((b2.getCapacity() - b2.getOccupancy()) >= b1.getOccupancy()) {
	    b2.setOccupancy(b2.getOccupancy() + b1.getOccupancy());
	    b1.setOccupancy(0);
	} else {
	    b1.setOccupancy(b1.getOccupancy() - (b2.getCapacity() - b2.getOccupancy()));
	    b2.setOccupancy(b2.getCapacity());
	}
    }
}
