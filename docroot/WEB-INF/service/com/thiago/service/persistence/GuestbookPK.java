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

package com.thiago.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Thiago Morais
 * @generated
 */
public class GuestbookPK implements Comparable<GuestbookPK>, Serializable {
	public long guestbookId;
	public int userId;

	public GuestbookPK() {
	}

	public GuestbookPK(long guestbookId, int userId) {
		this.guestbookId = guestbookId;
		this.userId = userId;
	}

	public long getGuestbookId() {
		return guestbookId;
	}

	public void setGuestbookId(long guestbookId) {
		this.guestbookId = guestbookId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public int compareTo(GuestbookPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (guestbookId < pk.guestbookId) {
			value = -1;
		}
		else if (guestbookId > pk.guestbookId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (userId < pk.userId) {
			value = -1;
		}
		else if (userId > pk.userId) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GuestbookPK)) {
			return false;
		}

		GuestbookPK pk = (GuestbookPK)obj;

		if ((guestbookId == pk.guestbookId) && (userId == pk.userId)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (String.valueOf(guestbookId) + String.valueOf(userId)).hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("guestbookId");
		sb.append(StringPool.EQUAL);
		sb.append(guestbookId);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("userId");
		sb.append(StringPool.EQUAL);
		sb.append(userId);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}