package com.demo.blog;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.demo.common.model.Blog;

/**
 * Created by keyou.chen on 2017/3/27.
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {

}
