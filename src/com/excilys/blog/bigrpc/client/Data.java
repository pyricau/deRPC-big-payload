package com.excilys.blog.bigrpc.client;

import java.io.Serializable;
import java.util.List;
import java.util.TreeMap;

public class Data implements Serializable {

	private List<TreeMap<Integer, Integer>>	big;

	public Data() {

	}

	public Data(List<TreeMap<Integer, Integer>> big) {
		this.big = big;
	}

}
