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
public class virtual_meeting_moi_models_solochatRealmProxy extends virtual.meeting.moi.models.solochat
    implements RealmObjectProxy, virtual_meeting_moi_models_solochatRealmProxyInterface {

    static final class solochatColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long phoneNoIndex;
        long timeStampIndex;

        solochatColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("solochat");
            this.phoneNoIndex = addColumnDetails("phoneNo", "phoneNo", objectSchemaInfo);
            this.timeStampIndex = addColumnDetails("timeStamp", "timeStamp", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        solochatColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new solochatColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final solochatColumnInfo src = (solochatColumnInfo) rawSrc;
            final solochatColumnInfo dst = (solochatColumnInfo) rawDst;
            dst.phoneNoIndex = src.phoneNoIndex;
            dst.timeStampIndex = src.timeStampIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private solochatColumnInfo columnInfo;
    private ProxyState<virtual.meeting.moi.models.solochat> proxyState;

    virtual_meeting_moi_models_solochatRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (solochatColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<virtual.meeting.moi.models.solochat>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phoneNo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneNoIndex);
    }

    @Override
    public void realmSet$phoneNo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneNoIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneNoIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneNoIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneNoIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeStamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeStampIndex);
    }

    @Override
    public void realmSet$timeStamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeStampIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeStampIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("solochat", 2, 0);
        builder.addPersistedProperty("phoneNo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeStamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static solochatColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new solochatColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "solochat";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "solochat";
    }

    @SuppressWarnings("cast")
    public static virtual.meeting.moi.models.solochat createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        virtual.meeting.moi.models.solochat obj = realm.createObjectInternal(virtual.meeting.moi.models.solochat.class, true, excludeFields);

        final virtual_meeting_moi_models_solochatRealmProxyInterface objProxy = (virtual_meeting_moi_models_solochatRealmProxyInterface) obj;
        if (json.has("phoneNo")) {
            if (json.isNull("phoneNo")) {
                objProxy.realmSet$phoneNo(null);
            } else {
                objProxy.realmSet$phoneNo((String) json.getString("phoneNo"));
            }
        }
        if (json.has("timeStamp")) {
            if (json.isNull("timeStamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
            } else {
                objProxy.realmSet$timeStamp((long) json.getLong("timeStamp"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static virtual.meeting.moi.models.solochat createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final virtual.meeting.moi.models.solochat obj = new virtual.meeting.moi.models.solochat();
        final virtual_meeting_moi_models_solochatRealmProxyInterface objProxy = (virtual_meeting_moi_models_solochatRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("phoneNo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNo(null);
                }
            } else if (name.equals("timeStamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeStamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeStamp' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static virtual_meeting_moi_models_solochatRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class), false, Collections.<String>emptyList());
        io.realm.virtual_meeting_moi_models_solochatRealmProxy obj = new io.realm.virtual_meeting_moi_models_solochatRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static virtual.meeting.moi.models.solochat copyOrUpdate(Realm realm, solochatColumnInfo columnInfo, virtual.meeting.moi.models.solochat object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (virtual.meeting.moi.models.solochat) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static virtual.meeting.moi.models.solochat copy(Realm realm, solochatColumnInfo columnInfo, virtual.meeting.moi.models.solochat newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.solochat) cachedRealmObject;
        }

        virtual_meeting_moi_models_solochatRealmProxyInterface realmObjectSource = (virtual_meeting_moi_models_solochatRealmProxyInterface) newObject;

        Table table = realm.getTable(virtual.meeting.moi.models.solochat.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.phoneNoIndex, realmObjectSource.realmGet$phoneNo());
        builder.addInteger(columnInfo.timeStampIndex, realmObjectSource.realmGet$timeStamp());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.virtual_meeting_moi_models_solochatRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, virtual.meeting.moi.models.solochat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.solochat.class);
        long tableNativePtr = table.getNativePtr();
        solochatColumnInfo columnInfo = (solochatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$phoneNo = ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$phoneNo();
        if (realmGet$phoneNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, realmGet$phoneNo, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampIndex, rowIndex, ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$timeStamp(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.solochat.class);
        long tableNativePtr = table.getNativePtr();
        solochatColumnInfo columnInfo = (solochatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class);
        virtual.meeting.moi.models.solochat object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.solochat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$phoneNo = ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$phoneNo();
            if (realmGet$phoneNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, realmGet$phoneNo, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampIndex, rowIndex, ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$timeStamp(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, virtual.meeting.moi.models.solochat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.solochat.class);
        long tableNativePtr = table.getNativePtr();
        solochatColumnInfo columnInfo = (solochatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$phoneNo = ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$phoneNo();
        if (realmGet$phoneNo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, realmGet$phoneNo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeStampIndex, rowIndex, ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$timeStamp(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.solochat.class);
        long tableNativePtr = table.getNativePtr();
        solochatColumnInfo columnInfo = (solochatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class);
        virtual.meeting.moi.models.solochat object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.solochat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$phoneNo = ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$phoneNo();
            if (realmGet$phoneNo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, realmGet$phoneNo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNoIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeStampIndex, rowIndex, ((virtual_meeting_moi_models_solochatRealmProxyInterface) object).realmGet$timeStamp(), false);
        }
    }

    public static virtual.meeting.moi.models.solochat createDetachedCopy(virtual.meeting.moi.models.solochat realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        virtual.meeting.moi.models.solochat unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new virtual.meeting.moi.models.solochat();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (virtual.meeting.moi.models.solochat) cachedObject.object;
            }
            unmanagedObject = (virtual.meeting.moi.models.solochat) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        virtual_meeting_moi_models_solochatRealmProxyInterface unmanagedCopy = (virtual_meeting_moi_models_solochatRealmProxyInterface) unmanagedObject;
        virtual_meeting_moi_models_solochatRealmProxyInterface realmSource = (virtual_meeting_moi_models_solochatRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$phoneNo(realmSource.realmGet$phoneNo());
        unmanagedCopy.realmSet$timeStamp(realmSource.realmGet$timeStamp());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("solochat = proxy[");
        stringBuilder.append("{phoneNo:");
        stringBuilder.append(realmGet$phoneNo() != null ? realmGet$phoneNo() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeStamp:");
        stringBuilder.append(realmGet$timeStamp());
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
        virtual_meeting_moi_models_solochatRealmProxy asolochat = (virtual_meeting_moi_models_solochatRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = asolochat.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = asolochat.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != asolochat.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
