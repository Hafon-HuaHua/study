package com.study.base.pattern.filter;

public class Filter2 implements Filter{
    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("<request>handle request 2</request>");
        chain.doFilter(request,response);
        System.out.println("<response>handle response 2</response>");
    }
}
