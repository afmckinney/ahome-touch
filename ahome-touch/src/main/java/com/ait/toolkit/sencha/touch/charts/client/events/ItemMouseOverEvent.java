package com.ait.toolkit.sencha.touch.charts.client.events;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.touch.charts.client.series.AbstractSeries;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ItemMouseOverEvent extends EventObject {

	public static String EVENT_NAME = "itemmouseover";

	private AbstractSeries series;
	private JavaScriptObject item;

	public ItemMouseOverEvent(AbstractSeries series, JavaScriptObject item, JavaScriptObject nativeEvent) {
		super(nativeEvent);
		this.series = series;
		this.item = item;
	}

	/**
	 * UiBinder implementations
	 */
	private static Type<ItemMouseOverHandler> TYPE = new Type<ItemMouseOverHandler>(EVENT_NAME, null);

	public static Type<ItemMouseOverHandler> getType() {
		return TYPE;
	}

	public static Type<ItemMouseOverHandler> getAssociatedType() {
		return TYPE;
	}

	protected ItemMouseOverEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public AbstractSeries getSeries() {
		return series;
	}

	public JavaScriptObject getItem() {
		return item;
	}

}
