package com.excilys.blog.bigrpc.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtRpcTest implements EntryPoint {

	private static final ClassicRpcServiceAsync	oldService	= GWT.create(ClassicRpcService.class);

	private static final DeRpcServiceAsync	newService	= GWT.create(DeRpcService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		final Button oldButton = new Button("Old");
		final Button newButton = new Button("New");

		RootPanel.get("sendButtonContainer").add(oldButton);
		RootPanel.get("sendButtonContainer").add(newButton);

		oldButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				oldService.retrieve(new AsyncCallback<Data>() {

					@Override
					public void onSuccess(Data result) {}

					@Override
					public void onFailure(Throwable caught) {}
				});
			}
		});

		newButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				newService.retrieve(new AsyncCallback<Data>() {

					@Override
					public void onSuccess(Data result) {}

					@Override
					public void onFailure(Throwable caught) {}
				});
			}
		});
	}
}
