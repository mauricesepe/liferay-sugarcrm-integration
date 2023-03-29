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

package com.liferay.object.storage.sugarcrm.internal.web.cache;

import com.liferay.object.storage.sugarcrm.configuration.SugarcrmConfiguration;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.kernel.webcache.WebCacheItem;

/**
 * @author Maurice Sepe
 */
public class SugarcrmAccessTokenWebCacheItem implements WebCacheItem {

	public static JSONObject get(SugarcrmConfiguration sugarcrmConfiguration) {

		/* TODO: Add implementation */

		return null;
	}

	public SugarcrmAccessTokenWebCacheItem(
		SugarcrmConfiguration sugarcrmConfiguration) {

		_sugarcrmConfiguration = sugarcrmConfiguration;
	}

	@Override
	public JSONObject convert(String key) {
		/* TODO: Add implementation */

		return null;
	}

	@Override
	public long getRefreshTime() {
		return _REFRESH_TIME;
	}

	private static final long _REFRESH_TIME = Time.MINUTE * 45;

	private final SugarcrmConfiguration _sugarcrmConfiguration;

}