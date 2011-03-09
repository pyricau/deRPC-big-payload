package com.excilys.blog.bigrpc.client;

import java.io.Serializable;
import java.util.List;
import java.util.TreeMap;

/**
 * Transport object to show the payload of GWT serialization.
 */
public class Data implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * This field is not used on the client side. Its only there to be serialized.
	 */
	@SuppressWarnings("unused")
	private List<TreeMap<Integer, Integer>>	big;

	/**
	 * Empty constructor needed for GWT deserializing
	 */
	Data() {}

	/**
	 * Server side constructor for {@link Data} objects.
	 */
	public Data(List<TreeMap<Integer, Integer>> big) {
		this.big = big;
	}

}
