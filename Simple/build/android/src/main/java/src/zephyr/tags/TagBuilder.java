// Generated by Haxe 3.4.2 (git build master @ 890f8c7)
package zephyr.tags;

import haxe.root.*;

@SuppressWarnings(value={"rawtypes", "unchecked"})
public class TagBuilder extends haxe.lang.HxObject
{
	public TagBuilder(haxe.lang.EmptyObject empty)
	{
	}
	
	
	public TagBuilder()
	{
		//line 9 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\TagBuilder.hx"
		zephyr.tags.TagBuilder.__hx_ctor_zephyr_tags_TagBuilder(this);
	}
	
	
	public static void __hx_ctor_zephyr_tags_TagBuilder(zephyr.tags.TagBuilder __hx_this)
	{
	}
	
	
	public static zephyr.tags.VBox vbox(java.lang.Object options, haxe.root.Array<zephyr.tags.Tag> childs)
	{
		//line 17 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\TagBuilder.hx"
		return new zephyr.tags.VBox(((haxe.root.Array<zephyr.tags.Tag>) (childs) ));
	}
	
	
	public static zephyr.tags.textview.TextView textview(java.lang.Object options)
	{
		//line 43 "d:\\Workspace\\Haxe\\ZephyrNative\\src\\zephyr\\tags\\TagBuilder.hx"
		return new zephyr.tags.textview.TextView(((java.lang.Object) (options) ));
	}
	
	
}

