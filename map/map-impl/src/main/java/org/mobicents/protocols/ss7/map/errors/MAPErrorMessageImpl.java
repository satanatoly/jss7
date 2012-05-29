/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.protocols.ss7.map.errors;

import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessage;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageAbsentSubscriber;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageAbsentSubscriberSM;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageCallBarred;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageExtensionContainer;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageFacilityNotSup;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageParameterless;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessagePositionMethodFailure;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageSMDeliveryFailure;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageSubscriberBusyForMtSms;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageSystemFailure;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageUnauthorizedLCSClient;
import org.mobicents.protocols.ss7.map.api.errors.MAPErrorMessageUnknownSubscriber;
import org.mobicents.protocols.ss7.map.primitives.MAPAsnPrimitive;

/**
 * Base class of MAP ReturnError messages
 * 
 * @author sergey vetyutnev
 * 
 */
public abstract class MAPErrorMessageImpl implements MAPErrorMessage, MAPAsnPrimitive {
	
	protected Long errorCode;
	
	
	protected MAPErrorMessageImpl(Long errorCode) {
		this.errorCode = errorCode;
	}
	
	public Long getErrorCode() {
		return errorCode;
	}

	
	public boolean isEmParameterless() {
		return false;
	}

	public boolean isEmExtensionContainer() {
		return false;
	}

	public boolean isEmFacilityNotSup() {
		return false;
	}

	public boolean isEmSMDeliveryFailure() {
		return false;
	}

	public boolean isEmSystemFailure() {
		return false;
	}

	public boolean isEmUnknownSubscriber() {
		return false;
	}

	public boolean isEmAbsentSubscriberSM() {
		return false;
	}

	public boolean isEmAbsentSubscriber() {
		return false;
	}

	public boolean isEmSubscriberBusyForMtSms() {
		return false;
	}

	public boolean isEmCallBarred() {
		return false;
	}

	public boolean isEmUnauthorizedLCSClient() {
		return false;
	}

	public boolean isEmPositionMethodFailure() {
		return false;
	}

	
	public MAPErrorMessageParameterless getEmParameterless() {
		return null;
	}

	public MAPErrorMessageExtensionContainer getEmExtensionContainer() {
		return null;
	}

	public MAPErrorMessageFacilityNotSup getEmFacilityNotSup() {
		return null;
	}

	public MAPErrorMessageSMDeliveryFailure getEmSMDeliveryFailure() {
		return null;
	}

	public MAPErrorMessageSystemFailure getEmSystemFailure() {
		return null;
	}

	public MAPErrorMessageUnknownSubscriber getEmUnknownSubscriber() {
		return null;
	}

	public MAPErrorMessageAbsentSubscriberSM getEmAbsentSubscriberSM() {
		return null;
	}

	public MAPErrorMessageAbsentSubscriber getEmAbsentSubscriber() {
		return null;
	}

	public MAPErrorMessageSubscriberBusyForMtSms getEmSubscriberBusyForMtSms() {
		return null;
	}

	public MAPErrorMessageCallBarred getEmCallBarred() {
		return null;
	}

	public MAPErrorMessageUnauthorizedLCSClient getEmUnauthorizedLCSClient() {
		return null;
	}

	public MAPErrorMessagePositionMethodFailure getEmPositionMethodFailure() {
		return null;
	}

}
