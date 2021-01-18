package com.study.base.pattern.filter;

public interface Filter {
    void doFilter(Request request,Response response,FilterChain chain);
}
