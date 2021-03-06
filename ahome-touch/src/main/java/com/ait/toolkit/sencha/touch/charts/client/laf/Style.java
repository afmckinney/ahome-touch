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
package com.ait.toolkit.sencha.touch.charts.client.laf;

import com.ait.toolkit.core.client.JsoHelper;
import com.ait.toolkit.sencha.touch.client.core.config.BaseConfig;

public class Style extends BaseConfig {

	public Style() {
		jsObj = JsoHelper.createObject();
	}

	public void setOpacity(double value) {
		JsoHelper.setAttribute(jsObj, "opacity", value);
	}

	public void setSmooth(boolean value) {
		JsoHelper.setAttribute(jsObj, "smooth", value);
	}

	public void setStroke(String value) {
		JsoHelper.setAttribute(jsObj, "stroke", value);
	}

	public void setFill(String value) {
		JsoHelper.setAttribute(jsObj, "fill", value);
	}

	public void setMiterLimit(int value) {
		JsoHelper.setAttribute(jsObj, "miterLimit", value);
	}

	public void setLineWidth(int value) {
		JsoHelper.setAttribute(jsObj, "lineWidth", value);
	}

	public void setLineCap(String value) {
		JsoHelper.setAttribute(jsObj, "lineCap", value);
	}

	public void setFillOpacity(double value) {
		JsoHelper.setAttribute(jsObj, "fillOpacity", value);
	}

}
