/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.thiago.service.impl;

import com.thiago.model.Entry;
import com.thiago.model.impl.EntryImpl;
import com.thiago.service.base.EntryServiceBaseImpl;

/**
 * The implementation of the entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.thiago.service.EntryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Thiago Morais
 * @see com.thiago.service.base.EntryServiceBaseImpl
 * @see com.thiago.service.EntryServiceUtil
 */
public class EntryServiceImpl extends EntryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.thiago.service.EntryServiceUtil} to access the entry remote service.
	 */
	
	
	
	public Entry tretaLouca(){
		Entry entry = new EntryImpl();
		entry.setName("Thiago");
		entry.setEmail("araujodemorais.t@gmail.com");
		entry.setMessage("WS JSON com liferay, toma!!!!");
		return entry;
	}
}