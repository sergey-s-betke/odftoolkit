/************************************************************************
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 *
 * Copyright 2008 Sun Microsystems, Inc. All rights reserved.
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

package org.odftoolkit.odfdom.dom.element.presentation;

import org.odftoolkit.odfdom.doc.OdfFileDom;
import org.odftoolkit.odfdom.dom.OdfName;
import org.odftoolkit.odfdom.dom.OdfNamespace;
import org.odftoolkit.odfdom.dom.element.OdfElement;
import org.odftoolkit.odfdom.dom.type.OdfBoolean;
import org.odftoolkit.odfdom.dom.type.OdfDuration;
import org.odftoolkit.odfdom.dom.type.presentation.OdfAnimationsType;
import org.odftoolkit.odfdom.dom.type.presentation.OdfTransitionOnClickType;
import javax.xml.datatype.Duration;


/**
 * ODF DOM Element implementation for element "<presentation:settings>".
 */
public abstract class OdfSettingsElement extends OdfElement
{        
    public static final OdfName ELEMENT_NAME = OdfName.get( OdfNamespace.PRESENTATION, "settings" );

    public OdfSettingsElement( OdfFileDom _aOwnerDoc )
    {
        super( _aOwnerDoc, ELEMENT_NAME );
    }

    public OdfName getOdfName()
    {
        return ELEMENT_NAME;
    }


    /**
     * Get value of attribute "presentation:start-page".
     */
    public String getStartPage()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-page" ) );
    }

    /**
     * Set value of attribute "presentation:start-page".
     */
    public void setStartPage( String _aStartPage )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-page" ), _aStartPage );
    }

    /**
     * Get value of attribute "presentation:show".
     */
    public String getShow()
    {
        return getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show" ) );
    }

    /**
     * Set value of attribute "presentation:show".
     */
    public void setShow( String _aShow )
    {
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show" ), _aShow );
    }

    /**
     * Get value of attribute "presentation:full-screen".
     */
    public Boolean getFullScreen()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "full-screen" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:full-screen".
     */
    public void setFullScreen( Boolean _aFullScreen )
    {                    
        String aStringVal = OdfBoolean.toString( _aFullScreen );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "full-screen" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:endless".
     */
    public Boolean getEndless()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "endless" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:endless".
     */
    public void setEndless( Boolean _aEndless )
    {                    
        String aStringVal = OdfBoolean.toString( _aEndless );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "endless" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:pause".
     */
    public Duration getPause()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "pause" ) );
        return OdfDuration.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:pause".
     */
    public void setPause( Duration _aPause )
    {                    
        String aStringVal = OdfDuration.toString( _aPause );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "pause" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:show-logo".
     */
    public Boolean getShowLogo()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show-logo" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:show-logo".
     */
    public void setShowLogo( Boolean _aShowLogo )
    {                    
        String aStringVal = OdfBoolean.toString( _aShowLogo );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show-logo" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:force-manual".
     */
    public Boolean getForceManual()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "force-manual" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:force-manual".
     */
    public void setForceManual( Boolean _aForceManual )
    {                    
        String aStringVal = OdfBoolean.toString( _aForceManual );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "force-manual" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:mouse-visible".
     */
    public Boolean getMouseVisible()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "mouse-visible" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:mouse-visible".
     */
    public void setMouseVisible( Boolean _aMouseVisible )
    {                    
        String aStringVal = OdfBoolean.toString( _aMouseVisible );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "mouse-visible" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:mouse-as-pen".
     */
    public Boolean getMouseAsPen()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "mouse-as-pen" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:mouse-as-pen".
     */
    public void setMouseAsPen( Boolean _aMouseAsPen )
    {                    
        String aStringVal = OdfBoolean.toString( _aMouseAsPen );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "mouse-as-pen" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:start-with-navigator".
     */
    public Boolean getStartWithNavigator()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-with-navigator" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:start-with-navigator".
     */
    public void setStartWithNavigator( Boolean _aStartWithNavigator )
    {                    
        String aStringVal = OdfBoolean.toString( _aStartWithNavigator );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "start-with-navigator" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:animations".
     */
    public OdfAnimationsType getAnimations()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "animations" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "enabled";
        }

        return OdfAnimationsType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:animations".
     */
    public void setAnimations( OdfAnimationsType _aAnimations )
    {                    
        String aStringVal = OdfAnimationsType.toString( _aAnimations );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "animations" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:transition-on-click".
     */
    public OdfTransitionOnClickType getTransitionOnClick()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "transition-on-click" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "enabled";
        }

        return OdfTransitionOnClickType.enumValueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:transition-on-click".
     */
    public void setTransitionOnClick( OdfTransitionOnClickType _aTransitionOnClick )
    {                    
        String aStringVal = OdfTransitionOnClickType.toString( _aTransitionOnClick );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "transition-on-click" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:stay-on-top".
     */
    public Boolean getStayOnTop()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "stay-on-top" ) );
        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:stay-on-top".
     */
    public void setStayOnTop( Boolean _aStayOnTop )
    {                    
        String aStringVal = OdfBoolean.toString( _aStayOnTop );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "stay-on-top" ), aStringVal );
    }

    /**
     * Get value of attribute "presentation:show-end-of-presentation-slide".
     */
    public Boolean getShowEndOfPresentationSlide()
    {                    
        String aStringVal = getOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show-end-of-presentation-slide" ) );
        if( aStringVal.length()==0 )
        {
            aStringVal = "true";
        }

        return OdfBoolean.valueOf( aStringVal);
    }

    /**
     * Set value of attribute "presentation:show-end-of-presentation-slide".
     */
    public void setShowEndOfPresentationSlide( Boolean _aShowEndOfPresentationSlide )
    {                    
        String aStringVal = OdfBoolean.toString( _aShowEndOfPresentationSlide );
        setOdfAttribute( OdfName.get( OdfNamespace.PRESENTATION, "show-end-of-presentation-slide" ), aStringVal );
    }

}