package com.sbezboro.standardplugin.net;

import com.sbezboro.http.listeners.HttpRequestListener;
import com.sbezboro.standardplugin.StandardPlugin;

public class LinkHttpRequest extends StandardHttpRequest {

	public LinkHttpRequest(String username, String password, HttpRequestListener listener) {
		super(StandardPlugin.getPlugin(), HTTPMethod.POST, listener);

		addProperty("username", username);
		addProperty("password", password);
	}

	@Override
	public String apiType() {
		return "link";
	}
}
