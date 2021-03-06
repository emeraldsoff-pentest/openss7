/*
 @(#) src/java/jain/protocol/ss7/tcap/dialogue/ProviderAbortIndEvent.java <p>
 
 Copyright &copy; 2008-2015  Monavacon Limited <a href="http://www.monavacon.com/">&lt;http://www.monavacon.com/&gt;</a>. <br>
 Copyright &copy; 2001-2008  OpenSS7 Corporation <a href="http://www.openss7.com/">&lt;http://www.openss7.com/&gt;</a>. <br>
 Copyright &copy; 1997-2001  Brian F. G. Bidulock <a href="mailto:bidulock@openss7.org">&lt;bidulock@openss7.org&gt;</a>. <p>
 
 All Rights Reserved. <p>
 
 This program is free software: you can redistribute it and/or modify it under
 the terms of the GNU Affero General Public License as published by the Free
 Software Foundation, version 3 of the license. <p>
 
 This program is distributed in the hope that it will be useful, but <b>WITHOUT
 ANY WARRANTY</b>; without even the implied warranty of <b>MERCHANTABILITY</b>
 or <b>FITNESS FOR A PARTICULAR PURPOSE</b>.  See the GNU Affero General Public
 License for more details. <p>
 
 You should have received a copy of the GNU Affero General Public License along
 with this program.  If not, see
 <a href="http://www.gnu.org/licenses/">&lt;http://www.gnu.org/licenses/&gt</a>,
 or write to the Free Software Foundation, Inc., 675 Mass Ave, Cambridge, MA
 02139, USA. <p>
 
 <em>U.S. GOVERNMENT RESTRICTED RIGHTS</em>.  If you are licensing this
 Software on behalf of the U.S. Government ("Government"), the following
 provisions apply to you.  If the Software is supplied by the Department of
 Defense ("DoD"), it is classified as "Commercial Computer Software" under
 paragraph 252.227-7014 of the DoD Supplement to the Federal Acquisition
 Regulations ("DFARS") (or any successor regulations) and the Government is
 acquiring only the license rights granted herein (the license rights
 customarily provided to non-Government users).  If the Software is supplied to
 any unit or agency of the Government other than DoD, it is classified as
 "Restricted Computer Software" and the Government's rights in the Software are
 defined in paragraph 52.227-19 of the Federal Acquisition Regulations ("FAR")
 (or any successor regulations) or, in the cases of NASA, in paragraph
 18.52.227-86 of the NASA Supplement to the FAR (or any successor regulations). <p>
 
 Commercial licensing and support of this software is available from OpenSS7
 Corporation at a fee.  See
 <a href="http://www.openss7.com/">http://www.openss7.com/</a>
 */

package jain.protocol.ss7.tcap.dialogue;

import jain.protocol.ss7.tcap.*;
import jain.protocol.ss7.*;
import jain.*;

/**
  * An event representing a TCAP ProviderAbort indication dialogue
  * primitive. This event will be passed from the Provider (TCAP) to the
  * Listener(the TC User) to inform the Tc User that the dialogue has
  * been terminated by the service provider (the transaction sublayer)
  * in reaction to a transaction abort by the transaction sublayer. Any
  * pending components are not transmitted. <br>
  * The mandatory parameters of this primitive are supplied to the
  * constructor. Optional parameters may then be set using the set
  * methods.
  * @version 1.2.2
  * @author Monavacon Limited
  * @see DialogueIndEvent
  */
public final class ProviderAbortIndEvent extends DialogueIndEvent {
    /** Constructs a new ProviderAbortIndEvent, with only the Event
      * Source and the JAIN TCAP Mandatory parameters being supplied to
      * the constructor.
      * @param source
      * The Event Source supplied to the constructor.
      * @param dialogueId
      * The Dialogue Identifier supplied to the constructor.
      * @param pAbort
      * The PAbort Cause supplied to the constructor.  */
    public ProviderAbortIndEvent(java.lang.Object source,
            int dialogueId, int pAbort) {
        super(source);
        setDialogueId(dialogueId);
        setPAbort(pAbort);
    }
    /** Sets the Quality of Service parameter of the ProviderAbort
      * indication primitive.
      * @param qualityOfService
      * The new Quality Of Service value.  */
    public void setQualityOfService(byte qualityOfService) {
        m_qualityOfService = qualityOfService;
        m_qualityOfServicePresent = true;
    }
    /** Sets the Provider Abort (pAbort) cause of the ProviderAbort
      * indication primitive. The PAbort parameter contains information
      * indicating the reason that the TCAP layer aborted a dialogue.
      * @param pAbort
      * One of the following: <ul>
      * <li>P_ABORT_UNRCGNZ_MSG_TYPE
      * <li>P_ABORT_UNRECOGNIZED_TRANSACTION_ID
      * <li>P_ABORT_BADLY_FORMATTED_TRANSACTION_PORTION
      * <li>P_ABORT_INCORRECT_TRANSACTION_PORTION
      * <li>P_ABORT_RESOURCE_LIMIT
      * <li>P_ABORT_ABNORMAL_DIALOGUE
      * <li>P_ABORT_UNRECOG_DIALOGUE_PORTION_ID(ANSI ONLY)
      * <li>P_ABORT_BADLY_STRUCTURED_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_MISSING_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_INCONSISTENT_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_PERMISSION_TO_RELEASE_PROBLEM(ANSI ONLY) </ul> */
    public void setPAbort(int pAbort) {
        m_pAbort = pAbort;
        m_pAbortPresent = true;
    }
    /** Indicates if the Quality of Service parameter is present in this
      * Event.
      * @return
      * True if Quality of Service has been set, false otherwise.  */
    public boolean isQualityOfServicePresent() {
        return m_qualityOfServicePresent;
    }
    /** Gets the Quality of Service parameter of the ProviderAbort
      * indication primitive. Quality of Service is an SCCP parameter
      * that is required from the application.
      * @return
      * The Quality of Service parameter of the ProviderAbortEvent.
      * @exception ParameterNotSetException
      * This exception is thrown if this parameter has not yet been set.  */
    public byte getQualityOfService()
        throws ParameterNotSetException {
        if (m_qualityOfServicePresent)
            return m_qualityOfService;
        throw new ParameterNotSetException("Quality of Service: not set.");
    }
    /** Gets the Provider Abort (pAbort) parameter of the ProviderAbort
      * indication primitive. The PAbort parameter contains information
      * indicating the reason that the TCAP layer aborted a dialogue.
      * @return
      * One of the following: <ul>
      * <li>P_ABORT_UNRCGNZ_MSG_TYPE
      * <li>P_ABORT_UNRECOGNIZED_TRANSACTION_ID
      * <li>P_ABORT_BADLY_FORMATTED_TRANSACTION_PORTION
      * <li>P_ABORT_INCORRECT_TRANSACTION_PORTION
      * <li>P_ABORT_RESOURCE_LIMIT
      * <li>P_ABORT_ABNORMAL_DIALOGUE
      * <li>P_ABORT_UNRECOG_DIALOGUE_PORTION_ID(ANSI ONLY)
      * <li>P_ABORT_BADLY_STRUCTURED_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_MISSING_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_INCONSISTENT_DIALOGUE_PORTION(ANSI ONLY)
      * <li>P_ABORT_PERMISSION_TO_RELEASE_PROBLEM(ANSI ONLY) </ul>
      * @exception MandatoryParameterNotSetException
      * This exception is thrown if this JAIN Mandatory parameter has
      * not been set.  */
    public int getPAbort()
        throws MandatoryParameterNotSetException {
        if (m_pAbortPresent)
            return m_pAbort;
        throw new MandatoryParameterNotSetException("PAbort: not set.");
    }
    /** This method returns the type of this primitive.
      * @return
      * The Primitive Type of the Event.  */
    public int getPrimitiveType() {
        return jain.protocol.ss7.tcap.TcapConstants.PRIMITIVE_PROVIDER_ABORT;
    }
    /** Clears all previously set parameters.  */
    public void clearAllParameters() {
        m_dialoguePortionPresent = false;
        m_dialogueIdPresent = false;
        m_qualityOfServicePresent = false;
        m_pAbortPresent = false;
    }
    /** java.lang.String representation of class ProviderAbortIndEvent.
      * @return
      * java.lang.String provides description of class ProviderAbortIndEvent.  */
    public java.lang.String toString() {
        StringBuffer b = new StringBuffer(512);
        b.append("\n\nProviderAbortIndEvent");
        b.append(super.toString());
        b.append("\n\tm_qualityOfService = " + m_qualityOfService);
        b.append("\n\tm_pAbort = " + m_pAbort);
        b.append("\n\tm_qualityOfServicePresent = " + m_qualityOfServicePresent);
        b.append("\n\tm_pAbortPresent = " + m_pAbortPresent);
        return b.toString();
    }
    /** The Quality of Service parameter of the ProviderAbort indication
      * dialogue primitive.
      * @serial m_qualityOfService
      * - a default serializable field.  */
    private byte m_qualityOfService = 0;
    /** The PAbort parameter of the ProviderAbort indication dialogue
      * primitive.
      * @serial m_pAbort
      * - a default serializable field.  */
    private int m_pAbort = 0;
    /** Whether Quality of Service is present.
      * @serial m_qualityOfServicePresent
      * - a default serializable field.  */
    private boolean m_qualityOfServicePresent = false;
    /** Whether PAbort is present.
      * @serial m_pAbortPresent
      * - a default serializable field.  */
    private boolean m_pAbortPresent = false;
}

// vim: sw=4 et tw=72 com=srO\:/**,mb\:*,ex\:*/,srO\:/*,mb\:*,ex\:*/,b\:TRANS,\://,b\:#,\:%,\:XCOMM,n\:>,fb\:-
