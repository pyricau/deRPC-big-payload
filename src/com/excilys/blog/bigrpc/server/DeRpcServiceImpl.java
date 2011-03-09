package com.excilys.blog.bigrpc.server;

import com.excilys.blog.bigrpc.client.Data;
import com.excilys.blog.bigrpc.client.DeRpcService;
import com.google.gwt.rpc.server.RpcServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class DeRpcServiceImpl extends RpcServlet implements DeRpcService {

	@Override
	public Data retrieve() {
		return DataGenerator.generateData();
	}
}
