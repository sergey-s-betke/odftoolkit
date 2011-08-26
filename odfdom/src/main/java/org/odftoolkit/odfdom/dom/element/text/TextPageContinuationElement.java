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

package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.text.TextSelectPageAttribute;
import org.odftoolkit.odfdom.dom.attribute.text.TextStringValueAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element text:page-continuation}.
 *
 */
public class TextPageContinuationElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TEXT, "page-continuation" );

	/**
	 * The value set of {@odf.attribute text:select-page}.
	 */
	 public enum TextSelectPageAttributeValue {
	 
	 NEXT( TextSelectPageAttribute.Value.NEXT.toString() ), PREVIOUS( TextSelectPageAttribute.Value.PREVIOUS.toString() );
              
		private String mValue;
	 	
		TextSelectPageAttributeValue( String value )
		{
			mValue = value;
		}
		
		@Override
		public String toString()
		{
			return mValue;
		}
		
		public static TextSelectPageAttributeValue enumValueOf( String value )
	    {
	        for( TextSelectPageAttributeValue aIter : values() )
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
	 * Create the instance of <code>TextPageContinuationElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TextPageContinuationElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element text:page-continuation}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TextPageContinuationElement}
	 *
     * @param textSelectPageAttributeValue  The mandatory attribute {@odf.attribute  text:select-page}"
     *
	 */
	public void init(String textSelectPageAttributeValue)
	{
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextSelectPageAttribute</code> , See {@odf.attribute text:select-page}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextSelectPageAttribute()
	{
		TextSelectPageAttribute attr = (TextSelectPageAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TEXT), "select-page" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextSelectPageAttribute</code> , See {@odf.attribute text:select-page}
	 *
	 * @param textSelectPageValue   The type is <code>String</code>
	 */
	public void setTextSelectPageAttribute( String textSelectPageValue )
	{
		TextSelectPageAttribute attr =  new TextSelectPageAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textSelectPageValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TextStringValueAttribute</code> , See {@odf.attribute text:string-value}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTextStringValueAttribute()
	{
		TextStringValueAttribute attr = (TextStringValueAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TEXT), "string-value" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TextStringValueAttribute</code> , See {@odf.attribute text:string-value}
	 *
	 * @param textStringValueValue   The type is <code>String</code>
	 */
	public void setTextStringValueAttribute( String textStringValueValue )
	{
		TextStringValueAttribute attr =  new TextStringValueAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( textStringValueValue );
	}

}
