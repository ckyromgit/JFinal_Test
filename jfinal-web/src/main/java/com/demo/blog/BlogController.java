package com.demo.blog;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.demo.common.model.Blog;

/**
 * Created by keyou.chen on 2017/3/27.
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {
    public void index() {
        setAttr("blogPage", Blog.me.paginate(getParaToInt(0, 1), 10));
        render("blog.html");
    }

    public void add() {
    }

    @Before(BlogValidator.class)
    public void save() {
        getModel(Blog.class).save();
        redirect("/blog");
    }

    public void edit() {
        setAttr("blog", Blog.me.findById(getParaToInt()));
    }

    @Before(BlogValidator.class)
    public void update() {
        getModel(Blog.class).update();
        redirect("/blog");
    }

    public void delete() {
        Blog.me.deleteById(getParaToInt());
        redirect("/blog");
    }
}
