package com.demo.index;

import com.jfinal.core.Controller;
/**
 * Created by keyou.chen on 2017/3/27.
 */
public class IndexController extends Controller {
    public void index() {
        render("index.html");
    }
}
