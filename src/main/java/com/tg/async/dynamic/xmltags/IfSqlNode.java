package com.tg.async.dynamic.xmltags;

/**
 * Created by twogoods on 2018/4/13.
 */
public class IfSqlNode implements SqlNode{
    @Override
    public boolean apply(DynamicContext dynamicContext) {
        return false;
    }
}
