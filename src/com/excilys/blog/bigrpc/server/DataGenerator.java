package com.excilys.blog.bigrpc.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

import com.excilys.blog.bigrpc.client.Data;

/**
 * Factory and container for random {@link Data}.
 */
public class DataGenerator {
	
	private static final Data data = generateData();
	
	/**
	 * Always returns the same instance, which has been generated using {@link #generateData()}
	 */
	public static Data getDataInstance() {
		return data;
	}

	/**
	 * Generates a random {@link Data}
	 */
private static Data generateData() {
	List<TreeMap<Integer, Integer>> big = new ArrayList<TreeMap<Integer, Integer>>();
	
	Random random = new Random();

	for (int i = 0; i < 1000; i++) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int j = 0; j < 20; j++) {
			map.put(random.nextInt(), random.nextInt());
		}

		big.add(map);
	}

	return new Data(big);
}

}
