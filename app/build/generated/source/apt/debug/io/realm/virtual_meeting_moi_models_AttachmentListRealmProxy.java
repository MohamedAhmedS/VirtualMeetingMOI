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
public class virtual_meeting_moi_models_AttachmentListRealmProxy extends virtual.meeting.moi.models.AttachmentList
    implements RealmObjectProxy, virtual_meeting_moi_models_AttachmentListRealmProxyInterface {

    static final class AttachmentListColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long nameIndex;
        long dataIndex;
        long urlListIndex;
        long bytesCountIndex;

        AttachmentListColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AttachmentList");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.urlListIndex = addColumnDetails("urlList", "urlList", objectSchemaInfo);
            this.bytesCountIndex = addColumnDetails("bytesCount", "bytesCount", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        AttachmentListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AttachmentListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AttachmentListColumnInfo src = (AttachmentListColumnInfo) rawSrc;
            final AttachmentListColumnInfo dst = (AttachmentListColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.dataIndex = src.dataIndex;
            dst.urlListIndex = src.urlListIndex;
            dst.bytesCountIndex = src.bytesCountIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AttachmentListColumnInfo columnInfo;
    private ProxyState<virtual.meeting.moi.models.AttachmentList> proxyState;
    private RealmList<virtual.meeting.moi.models.StatusImageList> urlListRealmList;

    virtual_meeting_moi_models_AttachmentListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AttachmentListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<virtual.meeting.moi.models.AttachmentList>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataIndex);
    }

    @Override
    public void realmSet$data(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataIndex, value);
    }

    @Override
    public RealmList<virtual.meeting.moi.models.StatusImageList> realmGet$urlList() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (urlListRealmList != null) {
            return urlListRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.urlListIndex);
            urlListRealmList = new RealmList<virtual.meeting.moi.models.StatusImageList>(virtual.meeting.moi.models.StatusImageList.class, osList, proxyState.getRealm$realm());
            return urlListRealmList;
        }
    }

    @Override
    public void realmSet$urlList(RealmList<virtual.meeting.moi.models.StatusImageList> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("urlList")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<virtual.meeting.moi.models.StatusImageList> original = value;
                value = new RealmList<virtual.meeting.moi.models.StatusImageList>();
                for (virtual.meeting.moi.models.StatusImageList item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.urlListIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                virtual.meeting.moi.models.StatusImageList linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                virtual.meeting.moi.models.StatusImageList linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$bytesCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.bytesCountIndex);
    }

    @Override
    public void realmSet$bytesCount(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.bytesCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.bytesCountIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AttachmentList", 4, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("data", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("urlList", RealmFieldType.LIST, "StatusImageList");
        builder.addPersistedProperty("bytesCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttachmentListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AttachmentListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AttachmentList";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AttachmentList";
    }

    @SuppressWarnings("cast")
    public static virtual.meeting.moi.models.AttachmentList createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("urlList")) {
            excludeFields.add("urlList");
        }
        virtual.meeting.moi.models.AttachmentList obj = realm.createObjectInternal(virtual.meeting.moi.models.AttachmentList.class, true, excludeFields);

        final virtual_meeting_moi_models_AttachmentListRealmProxyInterface objProxy = (virtual_meeting_moi_models_AttachmentListRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                objProxy.realmSet$data((String) json.getString("data"));
            }
        }
        if (json.has("urlList")) {
            if (json.isNull("urlList")) {
                objProxy.realmSet$urlList(null);
            } else {
                objProxy.realmGet$urlList().clear();
                JSONArray array = json.getJSONArray("urlList");
                for (int i = 0; i < array.length(); i++) {
                    virtual.meeting.moi.models.StatusImageList item = virtual_meeting_moi_models_StatusImageListRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$urlList().add(item);
                }
            }
        }
        if (json.has("bytesCount")) {
            if (json.isNull("bytesCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
            } else {
                objProxy.realmSet$bytesCount((long) json.getLong("bytesCount"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static virtual.meeting.moi.models.AttachmentList createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final virtual.meeting.moi.models.AttachmentList obj = new virtual.meeting.moi.models.AttachmentList();
        final virtual_meeting_moi_models_AttachmentListRealmProxyInterface objProxy = (virtual_meeting_moi_models_AttachmentListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$data((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                }
            } else if (name.equals("urlList")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$urlList(null);
                } else {
                    objProxy.realmSet$urlList(new RealmList<virtual.meeting.moi.models.StatusImageList>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        virtual.meeting.moi.models.StatusImageList item = virtual_meeting_moi_models_StatusImageListRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$urlList().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("bytesCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bytesCount((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static virtual_meeting_moi_models_AttachmentListRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class), false, Collections.<String>emptyList());
        io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy obj = new io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static virtual.meeting.moi.models.AttachmentList copyOrUpdate(Realm realm, AttachmentListColumnInfo columnInfo, virtual.meeting.moi.models.AttachmentList object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (virtual.meeting.moi.models.AttachmentList) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static virtual.meeting.moi.models.AttachmentList copy(Realm realm, AttachmentListColumnInfo columnInfo, virtual.meeting.moi.models.AttachmentList newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.AttachmentList) cachedRealmObject;
        }

        virtual_meeting_moi_models_AttachmentListRealmProxyInterface realmObjectSource = (virtual_meeting_moi_models_AttachmentListRealmProxyInterface) newObject;

        Table table = realm.getTable(virtual.meeting.moi.models.AttachmentList.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.dataIndex, realmObjectSource.realmGet$data());
        builder.addInteger(columnInfo.bytesCountIndex, realmObjectSource.realmGet$bytesCount());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<virtual.meeting.moi.models.StatusImageList> urlListList = realmObjectSource.realmGet$urlList();
        if (urlListList != null) {
            RealmList<virtual.meeting.moi.models.StatusImageList> urlListRealmList = realmObjectCopy.realmGet$urlList();
            urlListRealmList.clear();
            for (int i = 0; i < urlListList.size(); i++) {
                virtual.meeting.moi.models.StatusImageList urlListItem = urlListList.get(i);
                virtual.meeting.moi.models.StatusImageList cacheurlList = (virtual.meeting.moi.models.StatusImageList) cache.get(urlListItem);
                if (cacheurlList != null) {
                    urlListRealmList.add(cacheurlList);
                } else {
                    urlListRealmList.add(virtual_meeting_moi_models_StatusImageListRealmProxy.copyOrUpdate(realm, (virtual_meeting_moi_models_StatusImageListRealmProxy.StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class), urlListItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, virtual.meeting.moi.models.AttachmentList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$data = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        }

        RealmList<virtual.meeting.moi.models.StatusImageList> urlListList = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
        if (urlListList != null) {
            OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
            for (virtual.meeting.moi.models.StatusImageList urlListItem : urlListList) {
                Long cacheItemIndexurlList = cache.get(urlListItem);
                if (cacheItemIndexurlList == null) {
                    cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insert(realm, urlListItem, cache);
                }
                urlListOsList.addRow(cacheItemIndexurlList);
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class);
        virtual.meeting.moi.models.AttachmentList object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.AttachmentList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$data = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            }

            RealmList<virtual.meeting.moi.models.StatusImageList> urlListList = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
            if (urlListList != null) {
                OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
                for (virtual.meeting.moi.models.StatusImageList urlListItem : urlListList) {
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insert(realm, urlListItem, cache);
                    }
                    urlListOsList.addRow(cacheItemIndexurlList);
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, virtual.meeting.moi.models.AttachmentList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$data = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
        }

        OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
        RealmList<virtual.meeting.moi.models.StatusImageList> urlListList = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
        if (urlListList != null && urlListList.size() == urlListOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = urlListList.size();
            for (int i = 0; i < objects; i++) {
                virtual.meeting.moi.models.StatusImageList urlListItem = urlListList.get(i);
                Long cacheItemIndexurlList = cache.get(urlListItem);
                if (cacheItemIndexurlList == null) {
                    cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                }
                urlListOsList.setRow(i, cacheItemIndexurlList);
            }
        } else {
            urlListOsList.removeAll();
            if (urlListList != null) {
                for (virtual.meeting.moi.models.StatusImageList urlListItem : urlListList) {
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                    }
                    urlListOsList.addRow(cacheItemIndexurlList);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class);
        virtual.meeting.moi.models.AttachmentList object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.AttachmentList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$data = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
            }

            OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
            RealmList<virtual.meeting.moi.models.StatusImageList> urlListList = ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
            if (urlListList != null && urlListList.size() == urlListOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = urlListList.size();
                for (int i = 0; i < objectCount; i++) {
                    virtual.meeting.moi.models.StatusImageList urlListItem = urlListList.get(i);
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                    }
                    urlListOsList.setRow(i, cacheItemIndexurlList);
                }
            } else {
                urlListOsList.removeAll();
                if (urlListList != null) {
                    for (virtual.meeting.moi.models.StatusImageList urlListItem : urlListList) {
                        Long cacheItemIndexurlList = cache.get(urlListItem);
                        if (cacheItemIndexurlList == null) {
                            cacheItemIndexurlList = virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                        }
                        urlListOsList.addRow(cacheItemIndexurlList);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((virtual_meeting_moi_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static virtual.meeting.moi.models.AttachmentList createDetachedCopy(virtual.meeting.moi.models.AttachmentList realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        virtual.meeting.moi.models.AttachmentList unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new virtual.meeting.moi.models.AttachmentList();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (virtual.meeting.moi.models.AttachmentList) cachedObject.object;
            }
            unmanagedObject = (virtual.meeting.moi.models.AttachmentList) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        virtual_meeting_moi_models_AttachmentListRealmProxyInterface unmanagedCopy = (virtual_meeting_moi_models_AttachmentListRealmProxyInterface) unmanagedObject;
        virtual_meeting_moi_models_AttachmentListRealmProxyInterface realmSource = (virtual_meeting_moi_models_AttachmentListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$data(realmSource.realmGet$data());

        // Deep copy of urlList
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$urlList(null);
        } else {
            RealmList<virtual.meeting.moi.models.StatusImageList> managedurlListList = realmSource.realmGet$urlList();
            RealmList<virtual.meeting.moi.models.StatusImageList> unmanagedurlListList = new RealmList<virtual.meeting.moi.models.StatusImageList>();
            unmanagedCopy.realmSet$urlList(unmanagedurlListList);
            int nextDepth = currentDepth + 1;
            int size = managedurlListList.size();
            for (int i = 0; i < size; i++) {
                virtual.meeting.moi.models.StatusImageList item = virtual_meeting_moi_models_StatusImageListRealmProxy.createDetachedCopy(managedurlListList.get(i), nextDepth, maxDepth, cache);
                unmanagedurlListList.add(item);
            }
        }
        unmanagedCopy.realmSet$bytesCount(realmSource.realmGet$bytesCount());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AttachmentList = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? realmGet$data() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urlList:");
        stringBuilder.append("RealmList<StatusImageList>[").append(realmGet$urlList().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bytesCount:");
        stringBuilder.append(realmGet$bytesCount());
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
        virtual_meeting_moi_models_AttachmentListRealmProxy aAttachmentList = (virtual_meeting_moi_models_AttachmentListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttachmentList.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachmentList.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttachmentList.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
