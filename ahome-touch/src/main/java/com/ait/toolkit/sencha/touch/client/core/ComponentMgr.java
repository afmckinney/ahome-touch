/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.touch.client.core;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.sencha.shared.client.dom.DomUtil;
import com.ait.toolkit.sencha.shared.client.dom.ExtElement;
import com.google.gwt.dom.client.Element;

/**
 * Component manager.
 * 
 */
public class ComponentMgr {

	/**
	 * Registers a function that will be called when a specified component is
	 * added to ComponentMgr.
	 * 
	 * @param id
	 *            the component ID
	 * @param fn
	 *            the function to execute
	 */
	public native void onAvailable(String id, Function fn)/*-{
		$wnd.Ext.ComponentMgr.onAvailable(id, function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * Returns a component by id.
	 * 
	 * @param id
	 *            the component ID
	 * @return the component or null if not found
	 */
	public static native Component getComponent(String id) /*-{
		var comp = $wnd.Ext.ComponentMgr.get(id);
		return comp == null || comp === undefined ? null
				: @com.ait.toolkit.sencha.touch.client.ui.ComponentFactory::getComponent(Lcom/google/gwt/core/client/JavaScriptObject;)(comp);
	}-*/;

	/**
	 * Returns a component that the passed element represents.
	 * 
	 * @param element
	 *            the element
	 * @return the component or null if not found
	 */
	public static Component getComponent(Element element) {
		return getComponent(DomUtil.getID(element));
	}

	/**
	 * Returns a component that the passed element represents.
	 * 
	 * @param element
	 *            the element
	 * @return the component or null if not found
	 */
	public static Component getComponent(ExtElement element) {
		return getComponent(element.getDom());
	}
}
