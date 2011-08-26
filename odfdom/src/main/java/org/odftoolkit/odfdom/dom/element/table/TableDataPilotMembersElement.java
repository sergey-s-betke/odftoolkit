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


/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-members}.
 *
 */
public class TableDataPilotMembersElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-members" );


	/**
	 * Create the instance of <code>TableDataPilotMembersElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotMembersElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-members}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}


	/**
	 * Create child element {@odf.element table:data-pilot-member}.
	 *
     * @param tableNameAttributeValue  the <code>String</code> value of <code>TableNameAttribute</code>, see {@odf.attribute  table:name} at specification
	 * @return   return  the element {@odf.element table:data-pilot-member}
	 * DifferentQName 
	 */
    
	public TableDataPilotMemberElement newTableDataPilotMemberElement(String tableNameAttributeValue)
	{
		TableDataPilotMemberElement  tableDataPilotMember = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotMemberElement.class);
		tableDataPilotMember.setTableNameAttribute( tableNameAttributeValue );
		this.appendChild( tableDataPilotMember);
		return  tableDataPilotMember;      
	}
    
}
