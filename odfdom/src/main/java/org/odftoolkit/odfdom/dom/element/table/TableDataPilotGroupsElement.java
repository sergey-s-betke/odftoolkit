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
import org.odftoolkit.odfdom.dom.attribute.table.TableSourceFieldNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDateStartAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStartAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableDateEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableEndAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableStepAttribute;
import org.odftoolkit.odfdom.dom.attribute.table.TableGroupedByAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element table:data-pilot-groups}.
 *
 */
public class TableDataPilotGroupsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.TABLE, "data-pilot-groups" );


	/**
	 * Create the instance of <code>TableDataPilotGroupsElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public TableDataPilotGroupsElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element table:data-pilot-groups}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  TableDataPilotGroupsElement}
	 *
     * @param tableSourceFieldNameAttributeValue  The mandatory attribute {@odf.attribute  table:source-field-name}"
     * @param tableDateStartAttributeValue  The mandatory attribute {@odf.attribute  table:date-start}"
     * @param tableStartAttributeValue  The mandatory attribute {@odf.attribute  table:start}"
     * @param tableDateEndAttributeValue  The mandatory attribute {@odf.attribute  table:date-end}"
     * @param tableEndAttributeValue  The mandatory attribute {@odf.attribute  table:end}"
     * @param tableStepAttributeValue  The mandatory attribute {@odf.attribute  table:step}"
     * @param tableGroupedByAttributeValue  The mandatory attribute {@odf.attribute  table:grouped-by}"
     *
	 */
	public void init(String tableSourceFieldNameAttributeValue, String tableDateStartAttributeValue, String tableStartAttributeValue, String tableDateEndAttributeValue, String tableEndAttributeValue, double tableStepAttributeValue, String tableGroupedByAttributeValue)
	{
		setTableSourceFieldNameAttribute( tableSourceFieldNameAttributeValue );
		setTableDateStartAttribute( tableDateStartAttributeValue );
		setTableStartAttribute( tableStartAttributeValue );
		setTableDateEndAttribute( tableDateEndAttributeValue );
		setTableEndAttribute( tableEndAttributeValue );
		setTableStepAttribute( Double.valueOf(tableStepAttributeValue) );
		setTableGroupedByAttribute( tableGroupedByAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableSourceFieldNameAttribute()
	{
		TableSourceFieldNameAttribute attr = (TableSourceFieldNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "source-field-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableSourceFieldNameAttribute</code> , See {@odf.attribute table:source-field-name}
	 *
	 * @param tableSourceFieldNameValue   The type is <code>String</code>
	 */
	public void setTableSourceFieldNameAttribute( String tableSourceFieldNameValue )
	{
		TableSourceFieldNameAttribute attr =  new TableSourceFieldNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableSourceFieldNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDateStartAttribute</code> , See {@odf.attribute table:date-start}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDateStartAttribute()
	{
		TableDateStartAttribute attr = (TableDateStartAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "date-start" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDateStartAttribute</code> , See {@odf.attribute table:date-start}
	 *
	 * @param tableDateStartValue   The type is <code>String</code>
	 */
	public void setTableDateStartAttribute( String tableDateStartValue )
	{
		TableDateStartAttribute attr =  new TableDateStartAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableDateStartValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStartAttribute</code> , See {@odf.attribute table:start}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableStartAttribute()
	{
		TableStartAttribute attr = (TableStartAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "start" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStartAttribute</code> , See {@odf.attribute table:start}
	 *
	 * @param tableStartValue   The type is <code>String</code>
	 */
	public void setTableStartAttribute( String tableStartValue )
	{
		TableStartAttribute attr =  new TableStartAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableStartValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableDateEndAttribute</code> , See {@odf.attribute table:date-end}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableDateEndAttribute()
	{
		TableDateEndAttribute attr = (TableDateEndAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "date-end" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableDateEndAttribute</code> , See {@odf.attribute table:date-end}
	 *
	 * @param tableDateEndValue   The type is <code>String</code>
	 */
	public void setTableDateEndAttribute( String tableDateEndValue )
	{
		TableDateEndAttribute attr =  new TableDateEndAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableDateEndValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableEndAttribute</code> , See {@odf.attribute table:end}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableEndAttribute()
	{
		TableEndAttribute attr = (TableEndAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "end" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableEndAttribute</code> , See {@odf.attribute table:end}
	 *
	 * @param tableEndValue   The type is <code>String</code>
	 */
	public void setTableEndAttribute( String tableEndValue )
	{
		TableEndAttribute attr =  new TableEndAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableEndValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableStepAttribute</code> , See {@odf.attribute table:step}
	 *
	 * @return - the <code>Double</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public Double getTableStepAttribute()
	{
		TableStepAttribute attr = (TableStepAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "step" ) ;
		if( attr != null ){
			return Double.valueOf( attr.doubleValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableStepAttribute</code> , See {@odf.attribute table:step}
	 *
	 * @param tableStepValue   The type is <code>Double</code>
	 */
	public void setTableStepAttribute( Double tableStepValue )
	{
		TableStepAttribute attr =  new TableStepAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setDoubleValue( tableStepValue.doubleValue() );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>TableGroupedByAttribute</code> , See {@odf.attribute table:grouped-by}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getTableGroupedByAttribute()
	{
		TableGroupedByAttribute attr = (TableGroupedByAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.TABLE), "grouped-by" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>TableGroupedByAttribute</code> , See {@odf.attribute table:grouped-by}
	 *
	 * @param tableGroupedByValue   The type is <code>String</code>
	 */
	public void setTableGroupedByAttribute( String tableGroupedByValue )
	{
		TableGroupedByAttribute attr =  new TableGroupedByAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( tableGroupedByValue );
	}

	/**
	 * Create child element {@odf.element table:data-pilot-group}.
	 *
     * @param tableNameAttributeValue  the <code>String</code> value of <code>TableNameAttribute</code>, see {@odf.attribute  table:name} at specification
	 * @return   return  the element {@odf.element table:data-pilot-group}
	 * DifferentQName 
	 */
    
	public TableDataPilotGroupElement newTableDataPilotGroupElement(String tableNameAttributeValue)
	{
		TableDataPilotGroupElement  tableDataPilotGroup = ((OdfFileDom)this.ownerDocument).newOdfElement(TableDataPilotGroupElement.class);
		tableDataPilotGroup.setTableNameAttribute( tableNameAttributeValue );
		this.appendChild( tableDataPilotGroup);
		return  tableDataPilotGroup;      
	}
    
}
