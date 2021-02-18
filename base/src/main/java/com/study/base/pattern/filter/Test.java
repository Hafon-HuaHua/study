package com.study.base.pattern.filter;

/**
 * 责任链
 */
public class Test {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStr("<request>start handle request</request>");
        Response response = new Response();
        response.setStr("<response>end handle response</response>");

        FilterChain chain = new FilterChain();
        chain.add(new Filter1()).add(new Filter2());
        chain.doFilter(request,response);
    }
}
