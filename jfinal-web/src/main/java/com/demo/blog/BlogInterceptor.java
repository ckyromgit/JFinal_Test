package com.demo.blog;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * Created by keyou.chen on 2017/3/27.
 */
public class BlogInterceptor implements Interceptor {
    public void intercept(Invocation inv) {
        System.out.println("Before invoking " + inv.getActionKey());
        inv.invoke();
        System.out.println("After invoking " + inv.getActionKey());
    }
}
