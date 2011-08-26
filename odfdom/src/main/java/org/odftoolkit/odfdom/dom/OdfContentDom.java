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
package org.odftoolkit.odfdom.dom;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import org.odftoolkit.odfdom.pkg.NamespaceName;
import org.odftoolkit.odfdom.pkg.OdfFileDom;
import org.odftoolkit.odfdom.doc.OdfDocument;
import org.odftoolkit.odfdom.dom.element.office.OfficeDocumentContentElement;

/**
 * The DOM repesentation of the ODF content.xml file of an ODF document.
 */
public class OdfContentDom extends OdfFileDom {

	private static final long serialVersionUID = 766167617530147883L;

	/**
	 * Creates the DOM representation of an XML file of an Odf document.
	 *
	 * @param odfDocument   the document the XML files belongs to
	 * @param packagePath   the internal package path to the XML file
	 */
	public OdfContentDom(OdfDocument odfDocument, String packagePath) {
		super(odfDocument, packagePath);
		mPackageDocument = odfDocument;
		for (NamespaceName name : OdfDocumentNamespace.values()) {
			mURIByPrefix.put(name.getPrefix(), name.getUri());
			mPrefixByURI.put(name.getUri(), name.getPrefix());
		}
	}

	/**
	 * Retrieves the Odf Document
	 * 
	 * @return The <code>OdfDocument</code>
	 */
	public OdfDocument getOdfDocument() {
		return (OdfDocument) mPackageDocument;
	}

	/**
	 * @return The root element <office:document-content> of the content.xml file as <code>OfficeDocumentContentElement</code>.
	 */
	@Override
	public OfficeDocumentContentElement getRootElement() {
		return (OfficeDocumentContentElement) getDocumentElement();
	}

	/**
	 * Creates an JDK <code>XPath</code> instance.
	 * Initialized with ODF namespaces from <code>OdfDocumentNamespace</code>. Updated with all namespace of the XML file.
	 * @return an XPath instance with namespace context set to include the standard
	 * ODFDOM prefixes.
	 */
	@Override
	public XPath getXPath() {
		if (mXPath == null) {
			mXPath = XPathFactory.newInstance().newXPath();
			mXPath.setNamespaceContext(this);
		}
		return mXPath;
	}
}
