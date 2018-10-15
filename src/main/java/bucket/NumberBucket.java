package bucket;

import java.util.ArrayList;
import java.util.Random;

public class NumberBucket {
	private static Random randomGen = new Random();

	private ArrayList<Integer> bucket;

	public NumberBucket() {
		bucket = new ArrayList<Integer>();
	}

	public void addNumber(int toAdd) {
		bucket.add(toAdd);
	}

	public double average() {
		double sum = 0.0;
		for (Integer x : bucket) {
			sum += x;
		}
		return sum / bucket.size();
	}

	public int drawRandom() {
		int slot = randomGen.nextInt(bucket.size());
		return bucket.get(slot);
	}

	public int getSize() {
		return bucket.size();
	}
}
