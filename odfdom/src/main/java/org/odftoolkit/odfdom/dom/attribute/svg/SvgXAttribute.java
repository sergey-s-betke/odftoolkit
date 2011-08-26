/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Use is subject to license terms.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0. You can also
 * obtain a copy of the License at http://odftoolkit.org/docs/license.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ************************************************************************/

/*
 * This file is automatically generated.
 * Don't edit manually.
 */    
package org.odftoolkit.odfdom.dom.attribute.svg;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartDataLabelElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartEquationElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartFooterElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartLegendElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartPlotAreaElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartSubtitleElement;
import org.odftoolkit.odfdom.dom.element.chart.ChartTitleElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawAreaRectangleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCaptionElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCircleElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawControlElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawCustomShapeElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawEllipseElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawFrameElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGluePointElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPageThumbnailElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPathElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolygonElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawPolylineElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRectElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawRegularPolygonElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeAnnotationElement;
import org.odftoolkit.odfdom.dom.element.presentation.PresentationPlaceholderElement;
import org.odftoolkit.odfdom.dom.element.style.StyleGraphicPropertiesElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute svg:x}.
 *
 */
public class SvgXAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName( OdfDocumentNamespace.SVG, "x" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute svg:x}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public SvgXAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute svg:x}.
	 */
	@Override
	public OdfName getOdfName() {
		return ATTRIBUTE_NAME;
	}
	
	/**
	 * @return Returns the name of this attribute.
	 */
	@Override
	public String getName() {
		return ATTRIBUTE_NAME.getLocalName();
	}

	/**
	 * @param attrValue The <code>String</code> value of the attribute.
	 * @throws IllegalArgumentException If the provided attribute value is invalid
	 */
	@Override
	public void setValue(String attrValue) {
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof ChartDataLabelElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartEquationElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartFooterElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartLegendElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartPlotAreaElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartSubtitleElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof ChartTitleElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof Dr3dSceneElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawAreaPolygonElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawAreaRectangleElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawCaptionElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawCircleElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawControlElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawCustomShapeElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawEllipseElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawFrameElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawGluePointElement ){
					//2DO: need validate value against distance;percent
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPageThumbnailElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPathElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPolygonElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawPolylineElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawRectElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof DrawRegularPolygonElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof OfficeAnnotationElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}else if( parentElement instanceof PresentationPlaceholderElement ){
					//2DO: need validate value against coordinate;percent
					super.setValue(attrValue);
				}else if( parentElement instanceof StyleGraphicPropertiesElement ){
					//2DO: need validate value against Coordinate
					super.setValue(attrValue);
				}			
			} catch (NullPointerException e) {
				// TODO: validation handling/logging
				throw new IllegalArgumentException(e);
			}
			  catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw (e);
			}
		}else{
			//2DO:what should do when the owner element is null?
			super.setValue(attrValue);
		}
	}
    
	/**
	 * @return Returns the <code>String</code> value of the attribute
	 */
	@Override
	public String getValue(){
		OdfElement parentElement = (OdfElement)getOwnerElement();
		if( parentElement != null ){
			try {
				if( parentElement instanceof ChartDataLabelElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartEquationElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartFooterElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartLegendElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartPlotAreaElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartSubtitleElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof ChartTitleElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof Dr3dSceneElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawAreaPolygonElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawAreaRectangleElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawCaptionElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawCircleElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawControlElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawCustomShapeElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawEllipseElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawFrameElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawGluePointElement ){
					//2DO: need validate value against distance;percent
					return super.getValue();
				}else if( parentElement instanceof DrawPageThumbnailElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawPathElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawPolygonElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawPolylineElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawRectElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof DrawRegularPolygonElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof OfficeAnnotationElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}else if( parentElement instanceof PresentationPlaceholderElement ){
					//2DO: need validate value against coordinate;percent
					return super.getValue();
				}else if( parentElement instanceof StyleGraphicPropertiesElement ){
					//2DO: need validate value against Coordinate
					return super.getValue();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of svg:x is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute svg:x}.
	 * 
	 * @return the default value as <code>String</code> dependent of its element name
	 *         return <code>null</code> if the default value does not exist
	 */
	@Override
	public String getDefault() {
		return null;
	}
	
	/**
	 * Default value indicator. As the attribute default value is dependent from its element, the attribute has only a default, when a parent element exists.
	 * 
	 * @return <code>true</code> if {@odf.attribute svg:x} has an element parent 
	 *         otherwise return <code>false</code> as undefined.
	 */
	@Override
	public boolean hasDefault() {
		return false;
	}
	
	/**
	 * @return Returns whether this attribute is known to be of type ID (i.e. xml:id ?)
	 */
	@Override
	public boolean isId() {
		return false;
    
	}
}
