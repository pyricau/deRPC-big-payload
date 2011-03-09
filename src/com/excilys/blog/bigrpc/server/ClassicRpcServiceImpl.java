package com.excilys.blog.bigrpc.server;

import com.excilys.blog.bigrpc.client.CommonRpcService;
import com.excilys.blog.bigrpc.client.Data;
import com.excilys.blog.bigrpc.client.ClassicRpcService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Implementation of {@link CommonRpcService} that uses the good old GWT RPC mechanism.
 */
@SuppressWarnings("serial")
public class ClassicRpcServiceImpl extends RemoteServiceServlet implements ClassicRpcService {

	@Override
	public Data retrieve() {
		return DataGenerator.getDataInstance();
	}
}
