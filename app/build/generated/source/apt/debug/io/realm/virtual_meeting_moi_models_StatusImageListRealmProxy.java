package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class virtual_meeting_moi_models_StatusImageListRealmProxy extends virtual.meeting.moi.models.StatusImageList
    implements RealmObjectProxy, virtual_meeting_moi_models_StatusImageListRealmProxyInterface {

    static final class StatusImageListColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long urlIndex;
        long uploadTimeIndex;
        long expiryIndex;

        StatusImageListColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("StatusImageList");
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.uploadTimeIndex = addColumnDetails("uploadTime", "uploadTime", objectSchemaInfo);
            this.expiryIndex = addColumnDetails("expiry", "expiry", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StatusImageListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusImageListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusImageListColumnInfo src = (StatusImageListColumnInfo) rawSrc;
            final StatusImageListColumnInfo dst = (StatusImageListColumnInfo) rawDst;
            dst.urlIndex = src.urlIndex;
            dst.uploadTimeIndex = src.uploadTimeIndex;
            dst.expiryIndex = src.expiryIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusImageListColumnInfo columnInfo;
    private ProxyState<virtual.meeting.moi.models.StatusImageList> proxyState;

    virtual_meeting_moi_models_StatusImageListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusImageListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<virtual.meeting.moi.models.StatusImageList>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$uploadTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.uploadTimeIndex);
    }

    @Override
    public void realmSet$uploadTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.uploadTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.uploadTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$expiry() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.expiryIndex);
    }

    @Override
    public void realmSet$expiry(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.expiryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.expiryIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("StatusImageList", 3, 0);
        builder.addPersistedProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("uploadTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("expiry", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusImageListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusImageListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "StatusImageList";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "StatusImageList";
    }

    @SuppressWarnings("cast")
    public static virtual.meeting.moi.models.StatusImageList createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        virtual.meeting.moi.models.StatusImageList obj = realm.createObjectInternal(virtual.meeting.moi.models.StatusImageList.class, true, excludeFields);

        final virtual_meeting_moi_models_StatusImageListRealmProxyInterface objProxy = (virtual_meeting_moi_models_StatusImageListRealmProxyInterface) obj;
        if (json.has("url")) {
            if (json.isNull("url")) {
                objProxy.realmSet$url(null);
            } else {
                objProxy.realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("uploadTime")) {
            if (json.isNull("uploadTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uploadTime' to null.");
            } else {
                objProxy.realmSet$uploadTime((long) json.getLong("uploadTime"));
            }
        }
        if (json.has("expiry")) {
            if (json.isNull("expiry")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'expiry' to null.");
            } else {
                objProxy.realmSet$expiry((boolean) json.getBoolean("expiry"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static virtual.meeting.moi.models.StatusImageList createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final virtual.meeting.moi.models.StatusImageList obj = new virtual.meeting.moi.models.StatusImageList();
        final virtual_meeting_moi_models_StatusImageListRealmProxyInterface objProxy = (virtual_meeting_moi_models_StatusImageListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("url")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$url((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$url(null);
                }
            } else if (name.equals("uploadTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uploadTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'uploadTime' to null.");
                }
            } else if (name.equals("expiry")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$expiry((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'expiry' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static virtual_meeting_moi_models_StatusImageListRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class), false, Collections.<String>emptyList());
        io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy obj = new io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static virtual.meeting.moi.models.StatusImageList copyOrUpdate(Realm realm, StatusImageListColumnInfo columnInfo, virtual.meeting.moi.models.StatusImageList object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.StatusImageList) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static virtual.meeting.moi.models.StatusImageList copy(Realm realm, StatusImageListColumnInfo columnInfo, virtual.meeting.moi.models.StatusImageList newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.StatusImageList) cachedRealmObject;
        }

        virtual_meeting_moi_models_StatusImageListRealmProxyInterface realmObjectSource = (virtual_meeting_moi_models_StatusImageListRealmProxyInterface) newObject;

        Table table = realm.getTable(virtual.meeting.moi.models.StatusImageList.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.urlIndex, realmObjectSource.realmGet$url());
        builder.addInteger(columnInfo.uploadTimeIndex, realmObjectSource.realmGet$uploadTime());
        builder.addBoolean(columnInfo.expiryIndex, realmObjectSource.realmGet$expiry());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, virtual.meeting.moi.models.StatusImageList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class);
        virtual.meeting.moi.models.StatusImageList object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.StatusImageList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, virtual.meeting.moi.models.StatusImageList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class);
        virtual.meeting.moi.models.StatusImageList object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.StatusImageList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((virtual_meeting_moi_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        }
    }

    public static virtual.meeting.moi.models.StatusImageList createDetachedCopy(virtual.meeting.moi.models.StatusImageList realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        virtual.meeting.moi.models.StatusImageList unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new virtual.meeting.moi.models.StatusImageList();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (virtual.meeting.moi.models.StatusImageList) cachedObject.object;
            }
            unmanagedObject = (virtual.meeting.moi.models.StatusImageList) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        virtual_meeting_moi_models_StatusImageListRealmProxyInterface unmanagedCopy = (virtual_meeting_moi_models_StatusImageListRealmProxyInterface) unmanagedObject;
        virtual_meeting_moi_models_StatusImageListRealmProxyInterface realmSource = (virtual_meeting_moi_models_StatusImageListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$uploadTime(realmSource.realmGet$uploadTime());
        unmanagedCopy.realmSet$expiry(realmSource.realmGet$expiry());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("StatusImageList = proxy[");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{uploadTime:");
        stringBuilder.append(realmGet$uploadTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{expiry:");
        stringBuilder.append(realmGet$expiry());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        virtual_meeting_moi_models_StatusImageListRealmProxy aStatusImageList = (virtual_meeting_moi_models_StatusImageListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aStatusImageList.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aStatusImageList.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aStatusImageList.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
