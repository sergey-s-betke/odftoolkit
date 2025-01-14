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
package org.odftoolkit.odfdom.dom.element.text;

import org.odftoolkit.odfdom.dom.DefaultElementVisitor;
import org.odftoolkit.odfdom.dom.OdfDocumentNamespace;
import org.odftoolkit.odfdom.pkg.ElementVisitor;
import org.odftoolkit.odfdom.pkg.OdfElement;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.pkg.OdfName;

/** DOM implementation of OpenDocument element {@odf.element text:user-field-decls}. */
public class TextUserFieldDeclsElement extends OdfElement {

  public static final OdfName ELEMENT_NAME =
      OdfName.newName(OdfDocumentNamespace.TEXT, "user-field-decls");

  /**
   * Create the instance of <code>TextUserFieldDeclsElement</code>
   *
   * @param ownerDoc The type is <code>OdfFileDom</code>
   */
  public TextUserFieldDeclsElement(OdfFileDom ownerDoc) {
    super(ownerDoc, ELEMENT_NAME);
  }

  /**
   * Get the element name
   *
   * @return return <code>OdfName</code> the name of element {@odf.element text:user-field-decls}.
   */
  public OdfName getOdfName() {
    return ELEMENT_NAME;
  }

  /**
   * Create child element {@odf.element text:user-field-decl}.
   *
   * @param officeValueValue the <code>Double</code> value of <code>OfficeValueAttribute</code>, see
   *     {@odf.attribute office:value} at specification
   * @param officeValueTypeValue the <code>String</code> value of <code>OfficeValueTypeAttribute
   *     </code>, see {@odf.attribute office:value-type} at specification
   * @param textNameValue the <code>String</code> value of <code>TextNameAttribute</code>, see
   *     {@odf.attribute text:name} at specification
   * @return the element {@odf.element text:user-field-decl}
   */
  public TextUserFieldDeclElement newTextUserFieldDeclElement(
      double officeValueValue, String officeValueTypeValue, String textNameValue) {
    TextUserFieldDeclElement textUserFieldDecl =
        ((OdfFileDom) this.ownerDocument).newOdfElement(TextUserFieldDeclElement.class);
    textUserFieldDecl.setOfficeValueAttribute(officeValueValue);
    textUserFieldDecl.setOfficeValueTypeAttribute(officeValueTypeValue);
    textUserFieldDecl.setTextNameAttribute(textNameValue);
    this.appendChild(textUserFieldDecl);
    return textUserFieldDecl;
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
