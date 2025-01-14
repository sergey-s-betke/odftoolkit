/**
 * **********************************************************************
 *
 * <p>DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * <p>Copyright 2008, 2010 Oracle and/or its affiliates. All rights reserved.
 *
 * <p>Use is subject to license terms.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0. You can also obtain a copy of the License at
 * http://odftoolkit.org/docs/license.txt
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied.
 *
 * <p>See the License for the specific language governing permissions and limitations under the
 * License.
 *
 * <p>**********************************************************************
 */

/*
 * This file is automatically generated.
 * Don't edit manually.
 */
package org.odftoolkit.odfdom.dom.element.table;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element table:filter-and}. */
public class TableFilterAndElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TABLE, "filter-and");

  /**
   * Create the instance of <code>TableFilterAndElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TableFilterAndElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element table:filter-and}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element table:filter-condition}.
   *
   * @param tableFieldNumberValue the <code>Integer</code> value of <code>TableFieldNumberAttribute
   *     </code>, see {@odf.attribute table:field-number} at specification
   * @param tableOperatorValue the <code>String</code> value of <code>TableOperatorAttribute</code>,
   *     see {@odf.attribute table:operator} at specification
   * @param tableValueValue the <code>String</code> value of <code>TableValueAttribute</code>, see
   *     {@odf.attribute table:value} at specification
   * @return the element {@odf.element table:filter-condition}
   */
  public TableFilterConditionElement newTableFilterConditionElement(
      int tableFieldNumberValue, String tableOperatorValue, String tableValueValue) {
    TableFilterConditionElement tableFilterCondition =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableFilterConditionElement.class);
    tableFilterCondition.setTableFieldNumberAttribute(tableFieldNumberValue);
    tableFilterCondition.setTableOperatorAttribute(tableOperatorValue);
    tableFilterCondition.setTableValueAttribute(tableValueValue);
    this.appendChild(tableFilterCondition);
    return tableFilterCondition;
  }

  /**
   * Create child element {@odf.element table:filter-or}.
   *
   * @return the element {@odf.element table:filter-or}
   */
  public TableFilterOrElement newTableFilterOrElement() {
    TableFilterOrElement tableFilterOr =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TableFilterOrElement.class);
    this.appendChild(tableFilterOr);
    return tableFilterOr;
  }

  @Override
  public void accept(ElementVisitor visitor) {
    if (visitor instanceof DefaultElementVisitor) {
      DefaultElementVisitor defaultVisitor = (DefaultElementVisitor) visitor;
      defaultVisitor.visit(this);
    } else {
      visitor.visit(this);
    }
  }
}
