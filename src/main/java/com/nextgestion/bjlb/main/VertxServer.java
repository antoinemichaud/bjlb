package com.nextgestion.bjlb.main;

import org.vertx.java.core.http.RouteMatcher;
import org.vertx.java.deploy.Verticle;

import com.nextgestion.bjlb.handler.RestHandler;
import com.nextgestion.bjlb.handler.StaticWebHandler;
import com.nextgestion.bjlb.handler.impl.RestHandlerImpl;
import com.nextgestion.bjlb.handler.impl.StaticWebHandlerImpl;

public class VertxServer extends Verticle {

	private static final Integer PORT_NUMBER = 8182;
	
    @Override
    public void start() throws Exception {
    	
    	StaticWebHandler webHandler = new StaticWebHandlerImpl();
    	RestHandler restHandler = new RestHandlerImpl();
        
        final RouteMatcher routeMatcher = new RouteMatcher();
    	
        routeMatcher.get("/page/:page", restHandler);
    	
        vertx.createHttpServer().requestHandler(routeMatcher).listen(PORT_NUMBER);
    }
}
