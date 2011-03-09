package com.excilys.blog.bigrpc.server;

import com.excilys.blog.bigrpc.client.CommonRpcService;
import com.excilys.blog.bigrpc.client.Data;
import com.excilys.blog.bigrpc.client.DeRpcService;
import com.google.gwt.rpc.server.RpcServlet;

/**
 * Implementation of {@link CommonRpcService} that uses deRPC.
 */
@SuppressWarnings("serial")
public class DeRpcServiceImpl extends RpcServlet implements DeRpcService {

	@Override
	public Data retrieve() {
		return DataGenerator.getDataInstance();
	}
}
