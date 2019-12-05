package com.lj.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("comment", "comment_id", Comment.class);
		arp.addMapping("contact", "contact_id", Contact.class);
		arp.addMapping("fengge", "fengge_id", Fengge.class);
		arp.addMapping("jiaju", "jiaju_id", Jiaju.class);
		arp.addMapping("jiancai", "jiancai_id", Jiancai.class);
		arp.addMapping("post", "post_id", Post.class);
		arp.addMapping("user", "user_id", User.class);
	}
}

