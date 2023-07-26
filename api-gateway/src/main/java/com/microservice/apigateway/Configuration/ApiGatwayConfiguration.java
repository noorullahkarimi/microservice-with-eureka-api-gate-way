package com.microservice.apigateway.Configuration;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

public class ApiGatwayConfiguration {
    @Bean
    public RouteLocator gatewayRouter (RouteLocatorBuilder builder){
        return builder.routes().
                route(p->p.path("/get")
                    .filters(f->f.addRequestHeader("MyHeader", "MyURI")
                    .addRequestParameter("param", "MyValue"))
                .uri("http:httpbin.org:80"))
                .route(p->p.path("/SERVICE-USERS/**")
                .uri("lb://SERVICE-USERS"))
                .route(p->p.path("/SERVICE-POSTS/**")
                        .uri("lb://SERVICE-POSTS"))
        .build();
//        SERVICE-POSTS
//        Function<PredicateSpec, Buildable<Route>> routeFunction
//                = p ->p.path("/get")
//                .filters(f->f
//                        .addRequestHeader("MyHeader", "MyURI"))
//                        .uri("http://httpbin.org:80");
//                return builder.routes()
//                        .route(routeFunction)
//                        .build();
    }
}
