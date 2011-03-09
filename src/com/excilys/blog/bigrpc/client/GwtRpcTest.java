package com.excilys.blog.bigrpc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtRpcTest implements EntryPoint {

	private static final ClassicRpcServiceAsync oldService = GWT.create(ClassicRpcService.class);
	private static final DeRpcServiceAsync newService = GWT.create(DeRpcService.class);

	public void onModuleLoad() {
		final Button classicRPCButton = new Button("classicRPC");
		final Button deRPCButton = new Button("deRPC");

		RootPanel rootPanel = RootPanel.get("sendButtonContainer");
		rootPanel.add(classicRPCButton);
		rootPanel.add(deRPCButton);

		classicRPCButton.addClickHandler(new RetrieveClickHandler(oldService));
		deRPCButton.addClickHandler(new RetrieveClickHandler(newService));
	}
	
	static class RetrieveClickHandler implements ClickHandler {
		private final CommonServiceAsync commonServiceAsync;
		
		public RetrieveClickHandler(CommonServiceAsync commonServiceAsync) {
			this.commonServiceAsync = commonServiceAsync;
		}

		@Override
		public void onClick(ClickEvent event) {
			commonServiceAsync.retrieve(new AsyncCallback<Data>() {
				@Override
				public void onSuccess(Data result) {
					Window.alert("Data retrieved");
				}

				@Override
				public void onFailure(Throwable caught) {
				}
			});
		}
	}
}
