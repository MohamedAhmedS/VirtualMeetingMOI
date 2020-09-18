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
public class virtual_meeting_moi_models_GroupRealmProxy extends virtual.meeting.moi.models.Group
    implements RealmObjectProxy, virtual_meeting_moi_models_GroupRealmProxyInterface {

    static final class GroupColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long nameIndex;
        long statusIndex;
        long imageIndex;
        long adminIndex;
        long userIdsIndex;
        long grpExitUserIdsIndex;
        long dateIndex;

        GroupColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Group");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.adminIndex = addColumnDetails("admin", "admin", objectSchemaInfo);
            this.userIdsIndex = addColumnDetails("userIds", "userIds", objectSchemaInfo);
            this.grpExitUserIdsIndex = addColumnDetails("grpExitUserIds", "grpExitUserIds", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        GroupColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupColumnInfo src = (GroupColumnInfo) rawSrc;
            final GroupColumnInfo dst = (GroupColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.statusIndex = src.statusIndex;
            dst.imageIndex = src.imageIndex;
            dst.adminIndex = src.adminIndex;
            dst.userIdsIndex = src.userIdsIndex;
            dst.grpExitUserIdsIndex = src.grpExitUserIdsIndex;
            dst.dateIndex = src.dateIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupColumnInfo columnInfo;
    private ProxyState<virtual.meeting.moi.models.Group> proxyState;
    private RealmList<String> userIdsRealmList;
    private RealmList<String> grpExitUserIdsRealmList;

    virtual_meeting_moi_models_GroupRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<virtual.meeting.moi.models.Group>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idIndex, value);
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
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageIndex);
    }

    @Override
    public void realmSet$image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$admin() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.adminIndex);
    }

    @Override
    public void realmSet$admin(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.adminIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.adminIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.adminIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.adminIndex, value);
    }

    @Override
    public RealmList<String> realmGet$userIds() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (userIdsRealmList != null) {
            return userIdsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.userIdsIndex, RealmFieldType.STRING_LIST);
            userIdsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return userIdsRealmList;
        }
    }

    @Override
    public void realmSet$userIds(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("userIds")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.userIdsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    public RealmList<String> realmGet$grpExitUserIds() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (grpExitUserIdsRealmList != null) {
            return grpExitUserIdsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.grpExitUserIdsIndex, RealmFieldType.STRING_LIST);
            grpExitUserIdsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return grpExitUserIdsRealmList;
        }
    }

    @Override
    public void realmSet$grpExitUserIds(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("grpExitUserIds")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.grpExitUserIdsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Group", 8, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("admin", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedValueListProperty("userIds", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        builder.addPersistedValueListProperty("grpExitUserIds", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Group";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Group";
    }

    @SuppressWarnings("cast")
    public static virtual.meeting.moi.models.Group createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("userIds")) {
            excludeFields.add("userIds");
        }
        if (json.has("grpExitUserIds")) {
            excludeFields.add("grpExitUserIds");
        }
        virtual.meeting.moi.models.Group obj = realm.createObjectInternal(virtual.meeting.moi.models.Group.class, true, excludeFields);

        final virtual_meeting_moi_models_GroupRealmProxyInterface objProxy = (virtual_meeting_moi_models_GroupRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("image")) {
            if (json.isNull("image")) {
                objProxy.realmSet$image(null);
            } else {
                objProxy.realmSet$image((String) json.getString("image"));
            }
        }
        if (json.has("admin")) {
            if (json.isNull("admin")) {
                objProxy.realmSet$admin(null);
            } else {
                objProxy.realmSet$admin((String) json.getString("admin"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$userIds(), json, "userIds");
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$grpExitUserIds(), json, "grpExitUserIds");
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static virtual.meeting.moi.models.Group createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final virtual.meeting.moi.models.Group obj = new virtual.meeting.moi.models.Group();
        final virtual_meeting_moi_models_GroupRealmProxyInterface objProxy = (virtual_meeting_moi_models_GroupRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$image(null);
                }
            } else if (name.equals("admin")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$admin((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$admin(null);
                }
            } else if (name.equals("userIds")) {
                objProxy.realmSet$userIds(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("grpExitUserIds")) {
                objProxy.realmSet$grpExitUserIds(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static virtual_meeting_moi_models_GroupRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class), false, Collections.<String>emptyList());
        io.realm.virtual_meeting_moi_models_GroupRealmProxy obj = new io.realm.virtual_meeting_moi_models_GroupRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static virtual.meeting.moi.models.Group copyOrUpdate(Realm realm, GroupColumnInfo columnInfo, virtual.meeting.moi.models.Group object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (virtual.meeting.moi.models.Group) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static virtual.meeting.moi.models.Group copy(Realm realm, GroupColumnInfo columnInfo, virtual.meeting.moi.models.Group newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.Group) cachedRealmObject;
        }

        virtual_meeting_moi_models_GroupRealmProxyInterface realmObjectSource = (virtual_meeting_moi_models_GroupRealmProxyInterface) newObject;

        Table table = realm.getTable(virtual.meeting.moi.models.Group.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addString(columnInfo.nameIndex, realmObjectSource.realmGet$name());
        builder.addString(columnInfo.statusIndex, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.imageIndex, realmObjectSource.realmGet$image());
        builder.addString(columnInfo.adminIndex, realmObjectSource.realmGet$admin());
        builder.addStringList(columnInfo.userIdsIndex, realmObjectSource.realmGet$userIds());
        builder.addStringList(columnInfo.grpExitUserIdsIndex, realmObjectSource.realmGet$grpExitUserIds());
        builder.addInteger(columnInfo.dateIndex, realmObjectSource.realmGet$date());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.virtual_meeting_moi_models_GroupRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, virtual.meeting.moi.models.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$name = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$status = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$image = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        }
        String realmGet$admin = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$admin();
        if (realmGet$admin != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.adminIndex, rowIndex, realmGet$admin, false);
        }

        RealmList<java.lang.String> userIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$userIds();
        if (userIdsList != null) {
            OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
            for (java.lang.String userIdsItem : userIdsList) {
                if (userIdsItem == null) {
                    userIdsOsList.addNull();
                } else {
                    userIdsOsList.addString(userIdsItem);
                }
            }
        }

        RealmList<java.lang.String> grpExitUserIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$grpExitUserIds();
        if (grpExitUserIdsList != null) {
            OsList grpExitUserIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.grpExitUserIdsIndex);
            for (java.lang.String grpExitUserIdsItem : grpExitUserIdsList) {
                if (grpExitUserIdsItem == null) {
                    grpExitUserIdsOsList.addNull();
                } else {
                    grpExitUserIdsOsList.addString(grpExitUserIdsItem);
                }
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$date(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class);
        virtual.meeting.moi.models.Group object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            String realmGet$name = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$status = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$image = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            }
            String realmGet$admin = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$admin();
            if (realmGet$admin != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.adminIndex, rowIndex, realmGet$admin, false);
            }

            RealmList<java.lang.String> userIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$userIds();
            if (userIdsList != null) {
                OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
                for (java.lang.String userIdsItem : userIdsList) {
                    if (userIdsItem == null) {
                        userIdsOsList.addNull();
                    } else {
                        userIdsOsList.addString(userIdsItem);
                    }
                }
            }

            RealmList<java.lang.String> grpExitUserIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$grpExitUserIds();
            if (grpExitUserIdsList != null) {
                OsList grpExitUserIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.grpExitUserIdsIndex);
                for (java.lang.String grpExitUserIdsItem : grpExitUserIdsList) {
                    if (grpExitUserIdsItem == null) {
                        grpExitUserIdsOsList.addNull();
                    } else {
                        grpExitUserIdsOsList.addString(grpExitUserIdsItem);
                    }
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$date(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, virtual.meeting.moi.models.Group object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$status = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$image = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
        }
        String realmGet$admin = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$admin();
        if (realmGet$admin != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.adminIndex, rowIndex, realmGet$admin, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.adminIndex, rowIndex, false);
        }

        OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
        userIdsOsList.removeAll();
        RealmList<java.lang.String> userIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$userIds();
        if (userIdsList != null) {
            for (java.lang.String userIdsItem : userIdsList) {
                if (userIdsItem == null) {
                    userIdsOsList.addNull();
                } else {
                    userIdsOsList.addString(userIdsItem);
                }
            }
        }


        OsList grpExitUserIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.grpExitUserIdsIndex);
        grpExitUserIdsOsList.removeAll();
        RealmList<java.lang.String> grpExitUserIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$grpExitUserIds();
        if (grpExitUserIdsList != null) {
            for (java.lang.String grpExitUserIdsItem : grpExitUserIdsList) {
                if (grpExitUserIdsItem == null) {
                    grpExitUserIdsOsList.addNull();
                } else {
                    grpExitUserIdsOsList.addString(grpExitUserIdsItem);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$date(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.Group.class);
        long tableNativePtr = table.getNativePtr();
        GroupColumnInfo columnInfo = (GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class);
        virtual.meeting.moi.models.Group object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.Group) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$name = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$status = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$image = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
            }
            String realmGet$admin = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$admin();
            if (realmGet$admin != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.adminIndex, rowIndex, realmGet$admin, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.adminIndex, rowIndex, false);
            }

            OsList userIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.userIdsIndex);
            userIdsOsList.removeAll();
            RealmList<java.lang.String> userIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$userIds();
            if (userIdsList != null) {
                for (java.lang.String userIdsItem : userIdsList) {
                    if (userIdsItem == null) {
                        userIdsOsList.addNull();
                    } else {
                        userIdsOsList.addString(userIdsItem);
                    }
                }
            }


            OsList grpExitUserIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.grpExitUserIdsIndex);
            grpExitUserIdsOsList.removeAll();
            RealmList<java.lang.String> grpExitUserIdsList = ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$grpExitUserIds();
            if (grpExitUserIdsList != null) {
                for (java.lang.String grpExitUserIdsItem : grpExitUserIdsList) {
                    if (grpExitUserIdsItem == null) {
                        grpExitUserIdsOsList.addNull();
                    } else {
                        grpExitUserIdsOsList.addString(grpExitUserIdsItem);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((virtual_meeting_moi_models_GroupRealmProxyInterface) object).realmGet$date(), false);
        }
    }

    public static virtual.meeting.moi.models.Group createDetachedCopy(virtual.meeting.moi.models.Group realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        virtual.meeting.moi.models.Group unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new virtual.meeting.moi.models.Group();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (virtual.meeting.moi.models.Group) cachedObject.object;
            }
            unmanagedObject = (virtual.meeting.moi.models.Group) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        virtual_meeting_moi_models_GroupRealmProxyInterface unmanagedCopy = (virtual_meeting_moi_models_GroupRealmProxyInterface) unmanagedObject;
        virtual_meeting_moi_models_GroupRealmProxyInterface realmSource = (virtual_meeting_moi_models_GroupRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$image(realmSource.realmGet$image());
        unmanagedCopy.realmSet$admin(realmSource.realmGet$admin());

        unmanagedCopy.realmSet$userIds(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$userIds().addAll(realmSource.realmGet$userIds());

        unmanagedCopy.realmSet$grpExitUserIds(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$grpExitUserIds().addAll(realmSource.realmGet$grpExitUserIds());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Group = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{image:");
        stringBuilder.append(realmGet$image() != null ? realmGet$image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{admin:");
        stringBuilder.append(realmGet$admin() != null ? realmGet$admin() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userIds:");
        stringBuilder.append("RealmList<String>[").append(realmGet$userIds().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{grpExitUserIds:");
        stringBuilder.append("RealmList<String>[").append(realmGet$grpExitUserIds().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
