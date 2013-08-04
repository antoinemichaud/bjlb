package com.nextgestion.bjlb.handler.impl;

import java.util.Map;

import org.vertx.java.core.http.HttpServerRequest;

import com.nextgestion.bjlb.handler.RestHandler;

public class RestHandlerImpl implements RestHandler {

	private static final String page = "page";
	
	@Override
	public void handle(final HttpServerRequest event) {
		
		final Map<String, String> params = event.params();
		
		if (params.containsKey(page) && params.get(page) != null) {
			event.response.write(params.get(page));
			event.response.end();
		}
	}

}
