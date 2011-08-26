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

package org.odftoolkit.odfdom.dom.element.chart;

import org.odftoolkit.odfdom.pkg.OdfName;
import org.odftoolkit.odfdom.pkg.OdfNamespace;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.dom.style.OdfStyleFamily;
import org.odftoolkit.odfdom.dom.element.OdfStylableElement;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartStyleNameAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartDimensionAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartErrorLowerRangeAttribute;
import org.odftoolkit.odfdom.dom.attribute.chart.ChartErrorUpperRangeAttribute;


/**
 * DOM implementation of OpenDocument element  {@odf.element chart:error-indicator}.
 *
 */
public class ChartErrorIndicatorElement extends OdfStylableElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.newName(OdfDocumentNamespace.CHART, "error-indicator" );


	/**
	 * Create the instance of <code>ChartErrorIndicatorElement</code> 
	 *
	 * @param  ownerDoc     The type is <code>OdfFileDom</code>
	 */
	public ChartErrorIndicatorElement( OdfFileDom ownerDoc )
	{
		super( ownerDoc, ELEMENT_NAME, OdfStyleFamily.Chart, OdfName.newName(OdfDocumentNamespace.CHART, "style-name" )	);
	}

	/**
	 * Get the element name 
	 *
	 * @return  return   <code>OdfName</code> the name of element {@odf.element chart:error-indicator}.
	 */
	public OdfName getOdfName()
	{
		return ELEMENT_NAME;
	}

	/**
	 * Initialization of the mandatory attributes of {@link  ChartErrorIndicatorElement}
	 *
     * @param chartDimensionAttributeValue  The mandatory attribute {@odf.attribute  chart:dimension}"
     *
	 */
	public void init(String chartDimensionAttributeValue)
	{
		setChartDimensionAttribute( chartDimensionAttributeValue );
	}

	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartStyleNameAttribute()
	{
		ChartStyleNameAttribute attr = (ChartStyleNameAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.CHART), "style-name" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartStyleNameAttribute</code> , See {@odf.attribute chart:style-name}
	 *
	 * @param chartStyleNameValue   The type is <code>String</code>
	 */
	public void setChartStyleNameAttribute( String chartStyleNameValue )
	{
		ChartStyleNameAttribute attr =  new ChartStyleNameAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartStyleNameValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartDimensionAttribute</code> , See {@odf.attribute chart:dimension}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartDimensionAttribute()
	{
		ChartDimensionAttribute attr = (ChartDimensionAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.CHART), "dimension" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartDimensionAttribute</code> , See {@odf.attribute chart:dimension}
	 *
	 * @param chartDimensionValue   The type is <code>String</code>
	 */
	public void setChartDimensionAttribute( String chartDimensionValue )
	{
		ChartDimensionAttribute attr =  new ChartDimensionAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartDimensionValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartErrorLowerRangeAttribute</code> , See {@odf.attribute chart:error-lower-range}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartErrorLowerRangeAttribute()
	{
		ChartErrorLowerRangeAttribute attr = (ChartErrorLowerRangeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.CHART), "error-lower-range" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartErrorLowerRangeAttribute</code> , See {@odf.attribute chart:error-lower-range}
	 *
	 * @param chartErrorLowerRangeValue   The type is <code>String</code>
	 */
	public void setChartErrorLowerRangeAttribute( String chartErrorLowerRangeValue )
	{
		ChartErrorLowerRangeAttribute attr =  new ChartErrorLowerRangeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartErrorLowerRangeValue );
	}


	/**
	 * Receives the value of the ODFDOM attribute representation <code>ChartErrorUpperRangeAttribute</code> , See {@odf.attribute chart:error-upper-range}
	 *
	 * @return - the <code>String</code> , the value or <code>null</code>, if the attribute is not set and no default value defined.
	 */
	public String getChartErrorUpperRangeAttribute()
	{
		ChartErrorUpperRangeAttribute attr = (ChartErrorUpperRangeAttribute) getOdfAttribute( OdfNamespace.newNamespace(OdfDocumentNamespace.CHART), "error-upper-range" ) ;
		if( attr != null ){
			return String.valueOf( attr.getValue() );
		}
		return null;
	}
		 
	/**
	 * Sets the value of ODFDOM attribute representation <code>ChartErrorUpperRangeAttribute</code> , See {@odf.attribute chart:error-upper-range}
	 *
	 * @param chartErrorUpperRangeValue   The type is <code>String</code>
	 */
	public void setChartErrorUpperRangeAttribute( String chartErrorUpperRangeValue )
	{
		ChartErrorUpperRangeAttribute attr =  new ChartErrorUpperRangeAttribute( (OdfFileDom)this.ownerDocument );
		setOdfAttribute( attr );
		attr.setValue( chartErrorUpperRangeValue );
	}

}
