/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.liferay.blade.samples.jndiservicebuilder.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.blade.samples.jndiservicebuilder.model.Region;
import com.liferay.blade.samples.jndiservicebuilder.model.RegionModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Region service. Represents a row in the &quot;region&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link RegionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link RegionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegionImpl
 * @see Region
 * @see RegionModel
 * @generated
 */
@ProviderType
public class RegionModelImpl extends BaseModelImpl<Region>
	implements RegionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a region model instance should use the {@link Region} interface instead.
	 */
	public static final String TABLE_NAME = "region";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.BIGINT },
			{ "name", Types.VARCHAR }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE = "create table region (id LONG not null primary key,name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table region";
	public static final String ORDER_BY_JPQL = " ORDER BY region.regionId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY region.id ASC";
	public static final String DATA_SOURCE = "extDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.blade.samples.servicebuilder.service.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.blade.samples.jndiservicebuilder.model.Region"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.blade.samples.servicebuilder.service.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.blade.samples.jndiservicebuilder.model.Region"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.blade.samples.servicebuilder.service.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.blade.samples.jndiservicebuilder.model.Region"));

	public RegionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _regionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setRegionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _regionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Region.class;
	}

	@Override
	public String getModelClassName() {
		return Region.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("regionId", getRegionId());
		attributes.put("regionName", getRegionName());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long regionId = (Long)attributes.get("regionId");

		if (regionId != null) {
			setRegionId(regionId);
		}

		String regionName = (String)attributes.get("regionName");

		if (regionName != null) {
			setRegionName(regionName);
		}
	}

	@Override
	public long getRegionId() {
		return _regionId;
	}

	@Override
	public void setRegionId(long regionId) {
		_regionId = regionId;
	}

	@Override
	public String getRegionName() {
		if (_regionName == null) {
			return "";
		}
		else {
			return _regionName;
		}
	}

	@Override
	public void setRegionName(String regionName) {
		_regionName = regionName;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Region.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Region toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Region)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		RegionImpl regionImpl = new RegionImpl();

		regionImpl.setRegionId(getRegionId());
		regionImpl.setRegionName(getRegionName());

		regionImpl.resetOriginalValues();

		return regionImpl;
	}

	@Override
	public int compareTo(Region region) {
		long primaryKey = region.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Region)) {
			return false;
		}

		Region region = (Region)obj;

		long primaryKey = region.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Region> toCacheModel() {
		RegionCacheModel regionCacheModel = new RegionCacheModel();

		regionCacheModel.regionId = getRegionId();

		regionCacheModel.regionName = getRegionName();

		String regionName = regionCacheModel.regionName;

		if ((regionName != null) && (regionName.length() == 0)) {
			regionCacheModel.regionName = null;
		}

		return regionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{regionId=");
		sb.append(getRegionId());
		sb.append(", regionName=");
		sb.append(getRegionName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.liferay.blade.samples.jndiservicebuilder.model.Region");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>regionId</column-name><column-value><![CDATA[");
		sb.append(getRegionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regionName</column-name><column-value><![CDATA[");
		sb.append(getRegionName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Region.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Region.class
		};
	private long _regionId;
	private String _regionName;
	private Region _escapedModel;
}