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

package org.odftoolkit.odfdom.dom.element.draw;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.attribute.svg.SvgYAttribute;
import org.odftoolkit.odfdom.dom.attribute.draw.DrawCaptionIdAttribute;

import org.odftoolkit.odfdom.dom.element.svg.SvgTitleElement;
import org.odftoolkit.odfdom.dom.element.svg.SvgDescElement;
import org.odftoolkit.odfdom.dom.element.office.OfficeEventListenersElement;
import org.odftoolkit.odfdom.dom.element.dr3d.Dr3dSceneElement;

/**
 * DOM implementation of OpenDocument element  {@odf.element draw:g}.
 *
 */
public class DrawGElement extends DrawShapeElementBase
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DRAW, "g" );


	/**
	 * Create the instance of <code>DrawGElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DrawGElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element draw:g}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}



	/**
	 * Receives the value of the ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getSvgYAttribute()
	{
		SvgYAttribute attr = (SvgYAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.SVG), "y" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>SvgYAttribute</code> , See {@odf.attribute svg:y}
	 *
	 * @param svgYValue   The type is <code>String</code>
	 */
	public void setSvgYAttribute( String svgYValue )
	{
		SvgYAttribute attr =  new SvgYAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( svgYValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDrawCaptionIdAttribute()
	{
		DrawCaptionIdAttribute attr = (DrawCaptionIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DRAW), "caption-id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DrawCaptionIdAttribute</code> , See {@odf.attribute draw:caption-id}
	 *
	 * @param drawCaptionIdValue   The type is <code>String</code>
	 */
	public void setDrawCaptionIdAttribute( String drawCaptionIdValue )
	{
		DrawCaptionIdAttribute attr =  new DrawCaptionIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( drawCaptionIdValue );
	}

	/**
	 * Create child element {@odf.element svg:title}.
	 *
	 * @return   return  the element {@odf.element svg:title}
	 * DifferentQName 
	 */
	public SvgTitleElement newSvgTitleElement()
	{
		SvgTitleElement  svgTitle = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgTitleElement.class);
		this.appendChild( svgTitle);
		return  svgTitle;
	}                   
               
	/**
	 * Create child element {@odf.element svg:desc}.
	 *
	 * @return   return  the element {@odf.element svg:desc}
	 * DifferentQName 
	 */
	public SvgDescElement newSvgDescElement()
	{
		SvgDescElement  svgDesc = ((OdfFileDom)this.ownerDocument).newOdfElement(SvgDescElement.class);
		this.appendChild( svgDesc);
		return  svgDesc;
	}                   
               
	/**
	 * Create child element {@odf.element office:event-listeners}.
	 *
	 * @return   return  the element {@odf.element office:event-listeners}
	 * DifferentQName 
	 */
	public OfficeEventListenersElement newOfficeEventListenersElement()
	{
		OfficeEventListenersElement  officeEventListeners = ((OdfFileDom)this.ownerDocument).newOdfElement(OfficeEventListenersElement.class);
		this.appendChild( officeEventListeners);
		return  officeEventListeners;
	}                   
               
	/**
	 * Create child element {@odf.element draw:glue-point}.
	 *
     * @param drawEscapeDirectionAttributeValue  the <code>String</code> value of <code>DrawEscapeDirectionAttribute</code>, see {@odf.attribute  draw:escape-direction} at specification
	 * @param drawIdAttributeValue  the <code>String</code> value of <code>DrawIdAttribute</code>, see {@odf.attribute  draw:id} at specification
	 * @param svgXAttributeValue  the <code>String</code> value of <code>SvgXAttribute</code>, see {@odf.attribute  svg:x} at specification
	 * @param svgYAttributeValue  the <code>String</code> value of <code>SvgYAttribute</code>, see {@odf.attribute  svg:y} at specification
	 * @return   return  the element {@odf.element draw:glue-point}
	 * DifferentQName 
	 */
    
	public DrawGluePointElement newDrawGluePointElement(String drawEscapeDirectionAttributeValue, String drawIdAttributeValue, String svgXAttributeValue, String svgYAttributeValue)
	{
		DrawGluePointElement  drawGluePoint = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGluePointElement.class);
		drawGluePoint.setDrawEscapeDirectionAttribute( drawEscapeDirectionAttributeValue );
		drawGluePoint.setDrawIdAttribute( drawIdAttributeValue );
		drawGluePoint.setSvgXAttribute( svgXAttributeValue );
		drawGluePoint.setSvgYAttribute( svgYAttributeValue );
		this.appendChild( drawGluePoint);
		return  drawGluePoint;      
	}
    
	/**
	 * Create child element {@odf.element draw:rect}.
	 *
	 * @return   return  the element {@odf.element draw:rect}
	 * DifferentQName 
	 */
	public DrawRectElement newDrawRectElement()
	{
		DrawRectElement  drawRect = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRectElement.class);
		this.appendChild( drawRect);
		return  drawRect;
	}                   
               
	/**
	 * Create child element {@odf.element draw:line}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:line}
	 * DifferentQName 
	 */
    
	public DrawLineElement newDrawLineElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawLineElement  drawLine = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawLineElement.class);
		drawLine.setSvgX1Attribute( svgX1AttributeValue );
		drawLine.setSvgX2Attribute( svgX2AttributeValue );
		drawLine.setSvgY1Attribute( svgY1AttributeValue );
		drawLine.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawLine);
		return  drawLine;      
	}
    
	/**
	 * Create child element {@odf.element draw:polyline}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polyline}
	 * DifferentQName 
	 */
    
	public DrawPolylineElement newDrawPolylineElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolylineElement  drawPolyline = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolylineElement.class);
		drawPolyline.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolyline.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolyline);
		return  drawPolyline;      
	}
    
	/**
	 * Create child element {@odf.element draw:polygon}.
	 *
     * @param drawPointsAttributeValue  the <code>String</code> value of <code>DrawPointsAttribute</code>, see {@odf.attribute  draw:points} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:polygon}
	 * DifferentQName 
	 */
    
	public DrawPolygonElement newDrawPolygonElement(String drawPointsAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPolygonElement  drawPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPolygonElement.class);
		drawPolygon.setDrawPointsAttribute( drawPointsAttributeValue );
		drawPolygon.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPolygon);
		return  drawPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:regular-polygon}.
	 *
     * @param drawConcaveAttributeValue  the <code>boolean</code> value of <code>DrawConcaveAttribute</code>, see {@odf.attribute  draw:concave} at specification
	 * @param drawCornersAttributeValue  the <code>int</code> value of <code>DrawCornersAttribute</code>, see {@odf.attribute  draw:corners} at specification
	 * @return   return  the element {@odf.element draw:regular-polygon}
	 * DifferentQName 
	 */
    
	public DrawRegularPolygonElement newDrawRegularPolygonElement(boolean drawConcaveAttributeValue, int drawCornersAttributeValue)
	{
		DrawRegularPolygonElement  drawRegularPolygon = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawRegularPolygonElement.class);
		drawRegularPolygon.setDrawConcaveAttribute( Boolean.valueOf(drawConcaveAttributeValue) );
		drawRegularPolygon.setDrawCornersAttribute( Integer.valueOf(drawCornersAttributeValue) );
		this.appendChild( drawRegularPolygon);
		return  drawRegularPolygon;      
	}
    
	/**
	 * Create child element {@odf.element draw:path}.
	 *
     * @param svgDAttributeValue  the <code>String</code> value of <code>SvgDAttribute</code>, see {@odf.attribute  svg:d} at specification
	 * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:path}
	 * DifferentQName 
	 */
    
	public DrawPathElement newDrawPathElement(String svgDAttributeValue, String svgViewBoxAttributeValue)
	{
		DrawPathElement  drawPath = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPathElement.class);
		drawPath.setSvgDAttribute( svgDAttributeValue );
		drawPath.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawPath);
		return  drawPath;      
	}
    
	/**
	 * Create child element {@odf.element draw:circle}.
	 *
	 * @return   return  the element {@odf.element draw:circle}
	 * DifferentQName 
	 */
	public DrawCircleElement newDrawCircleElement()
	{
		DrawCircleElement  drawCircle = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCircleElement.class);
		this.appendChild( drawCircle);
		return  drawCircle;
	}                   
               
	/**
	 * Create child element {@odf.element draw:ellipse}.
	 *
	 * @return   return  the element {@odf.element draw:ellipse}
	 * DifferentQName 
	 */
	public DrawEllipseElement newDrawEllipseElement()
	{
		DrawEllipseElement  drawEllipse = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawEllipseElement.class);
		this.appendChild( drawEllipse);
		return  drawEllipse;
	}                   
               
	/**
	 * Create child element {@odf.element draw:g}.
	 *
	 * @return   return  the element {@odf.element draw:g}
	 * DifferentQName 
	 */
	public DrawGElement newDrawGElement()
	{
		DrawGElement  drawG = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawGElement.class);
		this.appendChild( drawG);
		return  drawG;
	}                   
               
	/**
	 * Create child element {@odf.element draw:page-thumbnail}.
	 *
	 * @return   return  the element {@odf.element draw:page-thumbnail}
	 * DifferentQName 
	 */
	public DrawPageThumbnailElement newDrawPageThumbnailElement()
	{
		DrawPageThumbnailElement  drawPageThumbnail = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawPageThumbnailElement.class);
		this.appendChild( drawPageThumbnail);
		return  drawPageThumbnail;
	}                   
               
	/**
	 * Create child element {@odf.element draw:frame}.
	 *
	 * @return   return  the element {@odf.element draw:frame}
	 * DifferentQName 
	 */
	public DrawFrameElement newDrawFrameElement()
	{
		DrawFrameElement  drawFrame = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawFrameElement.class);
		this.appendChild( drawFrame);
		return  drawFrame;
	}                   
               
	/**
	 * Create child element {@odf.element draw:measure}.
	 *
     * @param svgX1AttributeValue  the <code>String</code> value of <code>SvgX1Attribute</code>, see {@odf.attribute  svg:x1} at specification
	 * @param svgX2AttributeValue  the <code>String</code> value of <code>SvgX2Attribute</code>, see {@odf.attribute  svg:x2} at specification
	 * @param svgY1AttributeValue  the <code>String</code> value of <code>SvgY1Attribute</code>, see {@odf.attribute  svg:y1} at specification
	 * @param svgY2AttributeValue  the <code>String</code> value of <code>SvgY2Attribute</code>, see {@odf.attribute  svg:y2} at specification
	 * @return   return  the element {@odf.element draw:measure}
	 * DifferentQName 
	 */
    
	public DrawMeasureElement newDrawMeasureElement(String svgX1AttributeValue, String svgX2AttributeValue, String svgY1AttributeValue, String svgY2AttributeValue)
	{
		DrawMeasureElement  drawMeasure = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawMeasureElement.class);
		drawMeasure.setSvgX1Attribute( svgX1AttributeValue );
		drawMeasure.setSvgX2Attribute( svgX2AttributeValue );
		drawMeasure.setSvgY1Attribute( svgY1AttributeValue );
		drawMeasure.setSvgY2Attribute( svgY2AttributeValue );
		this.appendChild( drawMeasure);
		return  drawMeasure;      
	}
    
	/**
	 * Create child element {@odf.element draw:caption}.
	 *
	 * @return   return  the element {@odf.element draw:caption}
	 * DifferentQName 
	 */
	public DrawCaptionElement newDrawCaptionElement()
	{
		DrawCaptionElement  drawCaption = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCaptionElement.class);
		this.appendChild( drawCaption);
		return  drawCaption;
	}                   
               
	/**
	 * Create child element {@odf.element draw:connector}.
	 *
     * @param svgViewBoxAttributeValue  the <code>String</code> value of <code>SvgViewBoxAttribute</code>, see {@odf.attribute  svg:viewBox} at specification
	 * @return   return  the element {@odf.element draw:connector}
	 * DifferentQName 
	 */
    
	public DrawConnectorElement newDrawConnectorElement(String svgViewBoxAttributeValue)
	{
		DrawConnectorElement  drawConnector = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawConnectorElement.class);
		drawConnector.setSvgViewBoxAttribute( svgViewBoxAttributeValue );
		this.appendChild( drawConnector);
		return  drawConnector;      
	}
    
	/**
	 * Create child element {@odf.element draw:control}.
	 *
     * @param drawControlAttributeValue  the <code>String</code> value of <code>DrawControlAttribute</code>, see {@odf.attribute  draw:control} at specification
	 * @return   return  the element {@odf.element draw:control}
	 * DifferentQName 
	 */
    
	public DrawControlElement newDrawControlElement(String drawControlAttributeValue)
	{
		DrawControlElement  drawControl = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawControlElement.class);
		drawControl.setDrawControlAttribute( drawControlAttributeValue );
		this.appendChild( drawControl);
		return  drawControl;      
	}
    
	/**
	 * Create child element {@odf.element dr3d:scene}.
	 *
	 * @return   return  the element {@odf.element dr3d:scene}
	 * DifferentQName 
	 */
	public Dr3dSceneElement newDr3dSceneElement()
	{
		Dr3dSceneElement  dr3dScene = ((OdfFileDom)this.ownerDocument).newOdfElement(Dr3dSceneElement.class);
		this.appendChild( dr3dScene);
		return  dr3dScene;
	}                   
               
	/**
	 * Create child element {@odf.element draw:custom-shape}.
	 *
	 * @return   return  the element {@odf.element draw:custom-shape}
	 * DifferentQName 
	 */
	public DrawCustomShapeElement newDrawCustomShapeElement()
	{
		DrawCustomShapeElement  drawCustomShape = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawCustomShapeElement.class);
		this.appendChild( drawCustomShape);
		return  drawCustomShape;
	}                   
               
	/**
	 * Create child element {@odf.element draw:a}.
	 *
     * @param xlinkHrefAttributeValue  the <code>String</code> value of <code>XlinkHrefAttribute</code>, see {@odf.attribute  xlink:href} at specification
	 * @param xlinkTypeAttributeValue  the <code>String</code> value of <code>XlinkTypeAttribute</code>, see {@odf.attribute  xlink:type} at specification
	 * @return   return  the element {@odf.element draw:a}
	 * DifferentQName 
	 */
    
	public DrawAElement newDrawAElement(String xlinkHrefAttributeValue, String xlinkTypeAttributeValue)
	{
		DrawAElement  drawA = ((OdfFileDom)this.ownerDocument).newOdfElement(DrawAElement.class);
		drawA.setXlinkHrefAttribute( xlinkHrefAttributeValue );
		drawA.setXlinkTypeAttribute( xlinkTypeAttributeValue );
		this.appendChild( drawA);
		return  drawA;      
	}
    
}
