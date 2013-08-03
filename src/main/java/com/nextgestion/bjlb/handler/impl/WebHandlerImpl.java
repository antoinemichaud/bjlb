package com.nextgestion.bjlb.handler.impl;

import org.vertx.java.core.http.HttpServerRequest;

import com.nextgestion.bjlb.handler.WebHandler;

public class WebHandlerImpl implements WebHandler {

	@Override
	public void handle(HttpServerRequest req) {
		
		final String file = "/".equals(req.path) ? "index.html" : req.path;
        final String fileRequiredPath = "webroot/" + file;

        if (fileExists(fileRequiredPath)) {
            req.response.sendFile(fileRequiredPath);
        } else {
            req.response.sendFile("webroot/Kickstrap/extras/root goodies/404.html");
        }
	}
	
	private boolean fileExists(String path) {
        return WebHandlerImpl.class.getResourceAsStream("/" + path) != null;
    }

}
