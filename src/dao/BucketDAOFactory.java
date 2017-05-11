package dao;

public class BucketDAOFactory {

    public static BucketInterface getSolution() {
	return new BucketDAOImpl();
    }

    public static BucketInterface getConclusion() {
	return new BucketDAOImpl();
    }

}
