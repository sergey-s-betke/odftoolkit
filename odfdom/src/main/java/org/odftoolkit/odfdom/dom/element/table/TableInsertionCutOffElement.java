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
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.table.TableIdAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TablePositionAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:insertion-cut-off}.
 *
 */
public class TableInsertionCutOffElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "insertion-cut-off" );


	/**
	 * Create the instance of <code>TableInsertionCutOffElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableInsertionCutOffElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:insertion-cut-off}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableInsertionCutOffElement}
	 *
     * @param tableIdAttributeValue  The mandatory attribute {@odf.attribute  table:id}"
     * @param tablePositionAttributeValue  The mandatory attribute {@odf.attribute  table:position}"
     *
	 */
	public void init(String tableIdAttributeValue, int tablePositionAttributeValue)
	{
		setTableIdAttribute( tableIdAttributeValue );
		setTablePositionAttribute( Integer.valueOf(tablePositionAttributeValue) );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableIdAttribute()
	{
		TableIdAttribute attr = (TableIdAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "id" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableIdAttribute</code> , See {@odf.attribute table:id}
	 *
	 * @param tableIdValue   The type is <code>String</code>
	 */
	public void setTableIdAttribute( String tableIdValue )
	{
		TableIdAttribute attr =  new TableIdAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableIdValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TablePositionAttribute</code> , See {@odf.attribute table:position}
	 *
	 * @return - the <code>Integer</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Integer getTablePositionAttribute()
	{
		TablePositionAttribute attr = (TablePositionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "position" ) ;
		if( attr != null ){
			return Integer.valueOf( attr.intValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TablePositionAttribute</code> , See {@odf.attribute table:position}
	 *
	 * @param tablePositionValue   The type is <code>Integer</code>
	 */
	public void setTablePositionAttribute( Integer tablePositionValue )
	{
		TablePositionAttribute attr =  new TablePositionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setIntValue( tablePositionValue.intValue() );
	}

}
