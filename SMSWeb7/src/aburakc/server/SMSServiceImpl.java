/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package aburakc.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import aburakc.client.SMSService;
import aburakc.shared.db.Message;
import aburakc.shared.db.Person;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class SMSServiceImpl extends RemoteServiceServlet implements SMSService {
	public static final EntityManager entityManager() {
		return EMF.get().createEntityManager();
	}

	@Override
	public void sendSMS(Person person, String strMessage) {
		Message message = new Message();
		message.setPerson(person);
		message.setMessage(strMessage);
		message.setIncoming(Boolean.FALSE);
		
		sendSMS(message);
	}

	@Override
	public void sendSMS(Message message) {
		//send sms
		
		//save sms 
		MessageDAO messageDAO = new MessageDAO();
		messageDAO.saveMessage(message);
	}
}
