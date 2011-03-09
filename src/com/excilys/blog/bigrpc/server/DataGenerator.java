package com.excilys.blog.bigrpc.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;

import com.excilys.blog.bigrpc.client.Data;

public class DataGenerator {

	public static Data generateData() {
		List<TreeMap<Integer, Integer>> big = new ArrayList<TreeMap<Integer, Integer>>();

		for (int i = 0; i < 1000; i++) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			for (int j = 0; j < 20; j++) {
				Random random = new Random();
				map.put(random.nextInt(), random.nextInt());
			}

			big.add(map);
		}

		return new Data(big);
	}

}
