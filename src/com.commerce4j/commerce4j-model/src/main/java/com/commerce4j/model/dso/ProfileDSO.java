/**
 * Copyright 2010 Commerce4J.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.commerce4j.model.dso;


/**
 * Profile Data Service Object, the business layer that manage 
 * all the category operations.
 * 
 * @author carlos.quijano
 * @version $Revision$ $Date$
 */
public interface ProfileDSO {
	
	/**
	 * New user registration.
	 * 
	 * @param userName The user name credential, must be unique!.
	 * @param userPass The user password.
	 * @param emailAddress The user email address, must be valid!.
	 * @param firstName The user firstname.
	 * @param lastName The user lastname.
	 * @param cellPhone The user cell phone number.
	 * @param countryId The user country primary key.
	 * @return The generated user primary key.
	 */
	public Long registerUser(
			String userName,
			String userPass,
			String emailAddress,
			String firstName,
			String lastName,
			String cellPhone,
			Integer countryId
	);

        /**
         * Update the user generated unique id.
         *
         * @param userId the user id to update.
         * @param guid the user unique id to update.
         */
        public void updateGUID(Long userId, String guid);

        /**
         * Check if user is already registered or not by it's username.
         *
         * @param userName The username to check.
         * @return <code>true</code> If exists, <code>false</code> otherwise.
         */
	public boolean isUserValid(String userName);

        /**
         * Check if email address is already registered or not.
         * 
         * @param eMail The email to validate
         * @return <code>true</code> If exists, <code>false</code> otherwise.
         */
	public boolean isEmailValid(String eMail);
	
}
