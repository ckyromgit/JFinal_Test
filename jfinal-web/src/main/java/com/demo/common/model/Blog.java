package com.demo.common.model;

import com.demo.common.model.base.BaseBlog;
import com.jfinal.plugin.activerecord.Page;

/**
 * Created by keyou.chen on 2017/3/27.
 */
@SuppressWarnings("serial")
public class Blog extends BaseBlog<Blog> {
    public static final Blog me = new Blog().dao();

    public Page<Blog> paginate(int pageNumber, int pageSize) {
        return paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
    }
}
