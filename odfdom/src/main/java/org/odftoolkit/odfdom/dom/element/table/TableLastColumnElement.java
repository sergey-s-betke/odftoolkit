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

package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableParagraphStyleNameAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:last-column}.
 *
 */
public class TableLastColumnElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "last-column" );


	/**
	 * Create the instance of <code>TableLastColumnElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableLastColumnElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.TableCell, OdfName.newName(OdfDocumentNamespace.TABLE, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:last-column}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableLastColumnElement}
	 *
     * @param tableStyleNameAttributeValue  The mandatory attribute {@odf.attribute  table:style-name}"
     *
	 */
	public void init(String tableStyleNameAttributeValue)
	{
		setTableStyleNameAttribute( tableStyleNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStyleNameAttribute()
	{
		TableStyleNameAttribute attr = (TableStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStyleNameAttribute</code> , See {@odf.attribute table:style-name}
	 *
	 * @param tableStyleNameValue   The type is <code>String</code>
	 */
	public void setTableStyleNameAttribute( String tableStyleNameValue )
	{
		TableStyleNameAttribute attr =  new TableStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableParagraphStyleNameAttribute</code> , See {@odf.attribute table:paragraph-style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableParagraphStyleNameAttribute()
	{
		TableParagraphStyleNameAttribute attr = (TableParagraphStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "paragraph-style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableParagraphStyleNameAttribute</code> , See {@odf.attribute table:paragraph-style-name}
	 *
	 * @param tableParagraphStyleNameValue   The type is <code>String</code>
	 */
	public void setTableParagraphStyleNameAttribute( String tableParagraphStyleNameValue )
	{
		TableParagraphStyleNameAttribute attr =  new TableParagraphStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableParagraphStyleNameValue );
	}

}
