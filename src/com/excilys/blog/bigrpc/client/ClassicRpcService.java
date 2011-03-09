package com.excilys.blog.bigrpc.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("classic")
public interface ClassicRpcService extends RemoteService, CommonRpcService {}
