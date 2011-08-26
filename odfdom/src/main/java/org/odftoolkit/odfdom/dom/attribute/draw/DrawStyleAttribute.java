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
package org.odftoolkit.odfdom.dom.attribute.draw;

import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfAttribute;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawGradientElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawHatchElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawOpacityElement;
import org.odftoolkit.odfdom.dom.element.draw.DrawStrokeDashElement;
     
/**
 * DOM implementation of OpenDocument attribute  {@odf.attribute draw:style}.
 *
 */
public class DrawStyleAttribute extends OdfAttribute {

	public static final OdfName ATTRIBUTE_NAME = OdfName.newName( OdfDocumentNamespace.DRAW, "style" );

	/**
	 * Create the instance of OpenDocument attribute {@odf.attribute draw:style}.
	 * 
	 * @param ownerDocument       The type is <code>OdfFileDom</code>
	 */
	public DrawStyleAttribute(OdfFileDom ownerDocument) {
		super(ownerDocument, ATTRIBUTE_NAME);
	}
	
	/**
	 * Returns the attribute name.
	 * 
	 * @return the <code>OdfName</code> for {@odf.attribute draw:style}.
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
	 * The value set of {@odf.attribute draw:style}.
	 */
	public enum Value {
	 
	 AXIAL( "axial" ), DOUBLE( "double" ), ELLIPSOID( "ellipsoid" ), LINEAR( "linear" ), RADIAL( "radial" ), RECT( "rect" ), RECTANGULAR( "rectangular" ), ROUND( "round" ), SINGLE( "single" ), SQUARE( "square" ), TRIPLE( "triple" );
              
		private String mValue;

		Value( String value )
		{
			mValue = value;
		}
	 	
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static Value enumValueOf( String value )
	    {
	        for( Value aIter : values() )
	        {
	            if( value.equals( aIter.toString() ) )
	            {
	                return aIter;
	            }
	        }
	        return null;
	    }
	}
	 
	/**
	 * @param attrValue The <code>Enum</code> value of the attribute.
	 */
	public void setEnumValue(Value attrValue) {
		setValue(attrValue.toString());
	}
    
	/**
	 * @return Returns the <code>Enum</code> value of the attribute
	 */
	public Value getEnumValue(){
		return Value.enumValueOf(this.getValue());
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
				if( parentElement instanceof DrawGradientElement ){
					super.setValue(DrawGradientElement.DrawStyleAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawHatchElement ){
					super.setValue(DrawHatchElement.DrawStyleAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawOpacityElement ){
					super.setValue(DrawOpacityElement.DrawStyleAttributeValue.enumValueOf(attrValue).toString());
				}else if( parentElement instanceof DrawStrokeDashElement ){
					super.setValue(DrawStrokeDashElement.DrawStyleAttributeValue.enumValueOf(attrValue).toString());
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
				if( parentElement instanceof DrawGradientElement ){
					return super.getValue();
				}else if( parentElement instanceof DrawHatchElement ){
					return DrawHatchElement.DrawStyleAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawOpacityElement ){
					return DrawOpacityElement.DrawStyleAttributeValue.enumValueOf(super.getValue()).toString();
				}else if( parentElement instanceof DrawStrokeDashElement ){
					return DrawStrokeDashElement.DrawStyleAttributeValue.enumValueOf(super.getValue()).toString();
				}			
			} catch (IllegalArgumentException e) {
				// TODO: validation handling/logging
				throw new NumberFormatException("the value of draw:style is not valid");
			}
		}else{
			//2DO:what should do when the owner element is null?
			return super.getValue();
		}
		return null;
	}
	
	/**
	 * Returns the default value of {@odf.attribute draw:style}.
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
	 * @return <code>true</code> if {@odf.attribute draw:style} has an element parent 
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
