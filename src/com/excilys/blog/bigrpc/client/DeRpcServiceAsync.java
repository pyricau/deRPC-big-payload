package com.excilys.blog.bigrpc.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DeRpcServiceAsync {

	void retrieve(AsyncCallback<Data> callback);
}
