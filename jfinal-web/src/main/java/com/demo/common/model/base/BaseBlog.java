package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Created by keyou.chen on 2017/3/27.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBlog<M extends BaseBlog<M>> extends Model<M> implements IBean {
    public M setId(java.lang.Integer id) {
        set("id", id);
        return (M)this;
    }

    public java.lang.Integer getId() {
        return get("id");
    }

    public M setTitle(java.lang.String title) {
        set("title", title);
        return (M)this;
    }

    public java.lang.String getTitle() {
        return get("title");
    }

    public M setContent(java.lang.String content) {
        set("content", content);
        return (M)this;
    }

    public java.lang.String getContent() {
        return get("content");
    }
}
