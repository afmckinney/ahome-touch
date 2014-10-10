package com.ait.toolkit.sencha.touch.client.events.dataview;

import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.touch.client.ui.ListView;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class DiscloseEvent extends EventObject {

	public static String EVENT_NAME = "disclosure";

	private ListView source;
	private BaseModel record;
	private Element target;
	private int index;

	/**
	 * UiBinder implementations
	 */
	private static Type<DiscloseHandler> TYPE = new Type<DiscloseHandler>(EVENT_NAME, null);

	public static Type<DiscloseHandler> getType() {
		return TYPE;
	}

	public static Type<DiscloseHandler> getAssociatedType() {
		return TYPE;
	}

	protected DiscloseEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public DiscloseEvent(JavaScriptObject jsObj, ListView source, BaseModel record, Element target, int index) {
		super(jsObj);
		this.source = source;
		this.record = record;
		this.target = target;
		this.index = index;
	}

	/**
	 * @return the source
	 */
	public ListView getSource() {
		return source;
	}

	public BaseModel getRecord() {
		return record;
	}

	public Element getTarget() {
		return target;
	}

	public int getIndex() {
		return index;
	}
}
