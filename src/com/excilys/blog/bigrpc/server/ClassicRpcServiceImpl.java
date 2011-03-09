package com.excilys.blog.bigrpc.server;

import com.excilys.blog.bigrpc.client.Data;
import com.excilys.blog.bigrpc.client.ClassicRpcService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class ClassicRpcServiceImpl extends RemoteServiceServlet implements ClassicRpcService {

	@Override
	public Data retrieve() {
		return DataGenerator.generateData();
	}
}
