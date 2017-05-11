package model;

public class Bucket {
    private float capacity;
    private float occupancy;

    public Bucket(float capacity) {
	this.capacity = capacity;
	this.occupancy = 0;
    }

    public float getCapacity() {
	return capacity;
    }

    public float getOccupancy() {
	return occupancy;
    }

    public void setOccupancy(float occupancy) {
	this.occupancy = occupancy;
    }

    public boolean isEmpty() {
	if (getOccupancy() == 0) {
	    return true;
	} else {
	    return false;
	}
    }

    public boolean isFull() {
	if (getOccupancy() == getCapacity()) {
	    return true;
	} else {
	    return false;
	}
    }

    public void fillBucket() {
	this.occupancy = this.capacity;
    }

    public void emptyBucket() {
	this.occupancy = 0;
    }

    public void displayBucket() {
	System.out.println("Bucket with Capacity:" + getCapacity() + "\t has occupancy:" + getOccupancy());
    }
}
