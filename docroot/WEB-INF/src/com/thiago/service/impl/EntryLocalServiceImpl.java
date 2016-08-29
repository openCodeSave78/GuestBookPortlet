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

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.thiago.model.Entry;
import com.thiago.service.EntryLocalServiceUtil;
import com.thiago.service.base.EntryLocalServiceBaseImpl;

/**
 * The implementation of the entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.thiago.service.EntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Thiago Morais
 * @see com.thiago.service.base.EntryLocalServiceBaseImpl
 * @see com.thiago.service.EntryLocalServiceUtil
 */
public class EntryLocalServiceImpl extends EntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.thiago.service.EntryLocalServiceUtil} to access the entry local service.
	 */
	@Override
	public Entry addEntry(Entry entry) throws SystemException {
		if(entry != null && entry.getEntryId() == 0){
			entry.setEntryId(CounterLocalServiceUtil.increment(Entry.class.getName()));
		}
		return super.addEntry(entry);
	}
	
	public boolean validateEntry(Entry entry){
		return true;
	}
	
}