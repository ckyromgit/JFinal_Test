package com.demo.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Created by keyou.chen on 2017/3/27.
 */
public class _MappingKit {
    public static void mapping(ActiveRecordPlugin arp) {
        arp.addMapping("blog", "id", Blog.class);
    }
}
