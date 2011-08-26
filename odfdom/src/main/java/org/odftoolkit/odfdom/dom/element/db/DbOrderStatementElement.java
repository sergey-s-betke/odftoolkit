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

package org.odftoolkit.odfdom.dom.element.db;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.dom.attribute.db.DbCommandAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbApplyCommandAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:order-statement}.
 *
 */
public class DbOrderStatementElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "order-statement" );


	/**
	 * Create the instance of <code>DbOrderStatementElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbOrderStatementElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:order-statement}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbOrderStatementElement}
	 *
     * @param dbCommandAttributeValue  The mandatory attribute {@odf.attribute  db:command}"
     *
	 */
	public void init(String dbCommandAttributeValue)
	{
		setDbCommandAttribute( dbCommandAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbCommandAttribute</code> , See {@odf.attribute db:command}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbCommandAttribute()
	{
		DbCommandAttribute attr = (DbCommandAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DB), "command" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbCommandAttribute</code> , See {@odf.attribute db:command}
	 *
	 * @param dbCommandValue   The type is <code>String</code>
	 */
	public void setDbCommandAttribute( String dbCommandValue )
	{
		DbCommandAttribute attr =  new DbCommandAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbCommandValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbApplyCommandAttribute</code> , See {@odf.attribute db:apply-command}
	 *
	 * @return - the <code>Boolean</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Boolean getDbApplyCommandAttribute()
	{
		DbApplyCommandAttribute attr = (DbApplyCommandAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DB), "apply-command" ) ;
		if( attr != null ){
			return Boolean.valueOf( attr.booleanValue() );
		}
		return Boolean.valueOf( DbApplyCommandAttribute.DEFAULT_VALUE );
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbApplyCommandAttribute</code> , See {@odf.attribute db:apply-command}
	 *
	 * @param dbApplyCommandValue   The type is <code>Boolean</code>
	 */
	public void setDbApplyCommandAttribute( Boolean dbApplyCommandValue )
	{
		DbApplyCommandAttribute attr =  new DbApplyCommandAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setBooleanValue( dbApplyCommandValue.booleanValue() );
	}

}
