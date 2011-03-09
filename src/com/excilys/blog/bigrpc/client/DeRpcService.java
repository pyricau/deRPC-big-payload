package com.excilys.blog.bigrpc.client;

import com.google.gwt.rpc.client.RpcService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("derpc")
public interface DeRpcService extends RpcService, CommonRpcService {}
