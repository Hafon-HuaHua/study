package com.study.base.pattern.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain{
    private List<Filter> filters = new ArrayList<>();
    private int index = 0;
    public FilterChain add(Filter filter){
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if(index == filters.size()) return;
        Filter f = filters.get(index);
        index++;
        f.doFilter(request,response,this);
    }
}
