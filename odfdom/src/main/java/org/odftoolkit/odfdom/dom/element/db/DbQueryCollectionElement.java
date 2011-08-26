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
import org.odftoolkit.odfdom.dom.attribute.db.DbNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbTitleAttribute;
import org.odftoolkit.odfdom.dom.attribute.db.DbDescriptionAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element db:query-collection}.
 *
 */
public class DbQueryCollectionElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.DB, "query-collection" );


	/**
	 * Create the instance of <code>DbQueryCollectionElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public DbQueryCollectionElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element db:query-collection}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  DbQueryCollectionElement}
	 *
     * @param dbNameAttributeValue  The mandatory attribute {@odf.attribute  db:name}"
     *
	 */
	public void init(String dbNameAttributeValue)
	{
		setDbNameAttribute( dbNameAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbNameAttribute()
	{
		DbNameAttribute attr = (DbNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DB), "name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbNameAttribute</code> , See {@odf.attribute db:name}
	 *
	 * @param dbNameValue   The type is <code>String</code>
	 */
	public void setDbNameAttribute( String dbNameValue )
	{
		DbNameAttribute attr =  new DbNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbTitleAttribute()
	{
		DbTitleAttribute attr = (DbTitleAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DB), "title" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbTitleAttribute</code> , See {@odf.attribute db:title}
	 *
	 * @param dbTitleValue   The type is <code>String</code>
	 */
	public void setDbTitleAttribute( String dbTitleValue )
	{
		DbTitleAttribute attr =  new DbTitleAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbTitleValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getDbDescriptionAttribute()
	{
		DbDescriptionAttribute attr = (DbDescriptionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.DB), "description" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>DbDescriptionAttribute</code> , See {@odf.attribute db:description}
	 *
	 * @param dbDescriptionValue   The type is <code>String</code>
	 */
	public void setDbDescriptionAttribute( String dbDescriptionValue )
	{
		DbDescriptionAttribute attr =  new DbDescriptionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( dbDescriptionValue );
	}

	/**
	 * Create child element {@odf.element db:query}.
	 *
     * @param dbCommandAttributeValue  the <code>String</code> value of <code>DbCommandAttribute</code>, see {@odf.attribute  db:command} at specification
	 * @param dbNameAttributeValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * @return   return  the element {@odf.element db:query}
	 * DifferentQName 
	 */
    
	public DbQueryElement newDbQueryElement(String dbCommandAttributeValue, String dbNameAttributeValue)
	{
		DbQueryElement  dbQuery = ((OdfFileDom)this.ownerDocument).newOdfElement(DbQueryElement.class);
		dbQuery.setDbCommandAttribute( dbCommandAttributeValue );
		dbQuery.setDbNameAttribute( dbNameAttributeValue );
		this.appendChild( dbQuery);
		return  dbQuery;      
	}
    
	/**
	 * Create child element {@odf.element db:query-collection}.
	 *
     * @param dbNameAttributeValue  the <code>String</code> value of <code>DbNameAttribute</code>, see {@odf.attribute  db:name} at specification
	 * @return   return  the element {@odf.element db:query-collection}
	 * DifferentQName 
	 */
    
	public DbQueryCollectionElement newDbQueryCollectionElement(String dbNameAttributeValue)
	{
		DbQueryCollectionElement  dbQueryCollection = ((OdfFileDom)this.ownerDocument).newOdfElement(DbQueryCollectionElement.class);
		dbQueryCollection.setDbNameAttribute( dbNameAttributeValue );
		this.appendChild( dbQueryCollection);
		return  dbQueryCollection;      
	}
    
}
