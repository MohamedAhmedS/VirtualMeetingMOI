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
public class virtual_meeting_moi_models_StatusRealmProxy extends virtual.meeting.moi.models.Status
    implements RealmObjectProxy, virtual_meeting_moi_models_StatusRealmProxyInterface {

    static final class StatusColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long statusImagesIndex;
        long lastMessageIndex;
        long myIdIndex;
        long userIdIndex;
        long groupIdIndex;
        long timeUpdatedIndex;
        long userIndex;
        long groupIndex;
        long readIndex;

        StatusColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Status");
            this.statusImagesIndex = addColumnDetails("statusImages", "statusImages", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.myIdIndex = addColumnDetails("myId", "myId", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.groupIdIndex = addColumnDetails("groupId", "groupId", objectSchemaInfo);
            this.timeUpdatedIndex = addColumnDetails("timeUpdated", "timeUpdated", objectSchemaInfo);
            this.userIndex = addColumnDetails("user", "user", objectSchemaInfo);
            this.groupIndex = addColumnDetails("group", "group", objectSchemaInfo);
            this.readIndex = addColumnDetails("read", "read", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        StatusColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusColumnInfo src = (StatusColumnInfo) rawSrc;
            final StatusColumnInfo dst = (StatusColumnInfo) rawDst;
            dst.statusImagesIndex = src.statusImagesIndex;
            dst.lastMessageIndex = src.lastMessageIndex;
            dst.myIdIndex = src.myIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.groupIdIndex = src.groupIdIndex;
            dst.timeUpdatedIndex = src.timeUpdatedIndex;
            dst.userIndex = src.userIndex;
            dst.groupIndex = src.groupIndex;
            dst.readIndex = src.readIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusColumnInfo columnInfo;
    private ProxyState<virtual.meeting.moi.models.Status> proxyState;
    private RealmList<virtual.meeting.moi.models.StatusImage> statusImagesRealmList;

    virtual_meeting_moi_models_StatusRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<virtual.meeting.moi.models.Status>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public RealmList<virtual.meeting.moi.models.StatusImage> realmGet$statusImages() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (statusImagesRealmList != null) {
            return statusImagesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.statusImagesIndex);
            statusImagesRealmList = new RealmList<virtual.meeting.moi.models.StatusImage>(virtual.meeting.moi.models.StatusImage.class, osList, proxyState.getRealm$realm());
            return statusImagesRealmList;
        }
    }

    @Override
    public void realmSet$statusImages(RealmList<virtual.meeting.moi.models.StatusImage> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("statusImages")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<virtual.meeting.moi.models.StatusImage> original = value;
                value = new RealmList<virtual.meeting.moi.models.StatusImage>();
                for (virtual.meeting.moi.models.StatusImage item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.statusImagesIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                virtual.meeting.moi.models.StatusImage linkedObject = value.get(i);
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
                virtual.meeting.moi.models.StatusImage linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastMessageIndex);
    }

    @Override
    public void realmSet$lastMessage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastMessageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastMessageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastMessageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastMessageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$myId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.myIdIndex);
    }

    @Override
    public void realmSet$myId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.myIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.myIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.myIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.myIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$groupId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.groupIdIndex);
    }

    @Override
    public void realmSet$groupId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.groupIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.groupIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.groupIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.groupIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeUpdated() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeUpdatedIndex);
    }

    @Override
    public void realmSet$timeUpdated(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeUpdatedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeUpdatedIndex, value);
    }

    @Override
    public virtual.meeting.moi.models.User realmGet$user() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.userIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(virtual.meeting.moi.models.User.class, proxyState.getRow$realm().getLink(columnInfo.userIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$user(virtual.meeting.moi.models.User value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("user")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.userIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.userIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.userIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.userIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public virtual.meeting.moi.models.Group realmGet$group() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.groupIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(virtual.meeting.moi.models.Group.class, proxyState.getRow$realm().getLink(columnInfo.groupIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$group(virtual.meeting.moi.models.Group value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("group")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.groupIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.groupIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.groupIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.groupIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readIndex);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Status", 9, 0);
        builder.addPersistedLinkProperty("statusImages", RealmFieldType.LIST, "StatusImage");
        builder.addPersistedProperty("lastMessage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("groupId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeUpdated", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedLinkProperty("group", RealmFieldType.OBJECT, "Group");
        builder.addPersistedProperty("read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Status";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Status";
    }

    @SuppressWarnings("cast")
    public static virtual.meeting.moi.models.Status createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        if (json.has("statusImages")) {
            excludeFields.add("statusImages");
        }
        if (json.has("user")) {
            excludeFields.add("user");
        }
        if (json.has("group")) {
            excludeFields.add("group");
        }
        virtual.meeting.moi.models.Status obj = realm.createObjectInternal(virtual.meeting.moi.models.Status.class, true, excludeFields);

        final virtual_meeting_moi_models_StatusRealmProxyInterface objProxy = (virtual_meeting_moi_models_StatusRealmProxyInterface) obj;
        if (json.has("statusImages")) {
            if (json.isNull("statusImages")) {
                objProxy.realmSet$statusImages(null);
            } else {
                objProxy.realmGet$statusImages().clear();
                JSONArray array = json.getJSONArray("statusImages");
                for (int i = 0; i < array.length(); i++) {
                    virtual.meeting.moi.models.StatusImage item = virtual_meeting_moi_models_StatusImageRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$statusImages().add(item);
                }
            }
        }
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                objProxy.realmSet$lastMessage((String) json.getString("lastMessage"));
            }
        }
        if (json.has("myId")) {
            if (json.isNull("myId")) {
                objProxy.realmSet$myId(null);
            } else {
                objProxy.realmSet$myId((String) json.getString("myId"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("groupId")) {
            if (json.isNull("groupId")) {
                objProxy.realmSet$groupId(null);
            } else {
                objProxy.realmSet$groupId((String) json.getString("groupId"));
            }
        }
        if (json.has("timeUpdated")) {
            if (json.isNull("timeUpdated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
            } else {
                objProxy.realmSet$timeUpdated((long) json.getLong("timeUpdated"));
            }
        }
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                virtual.meeting.moi.models.User userObj = virtual_meeting_moi_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("group")) {
            if (json.isNull("group")) {
                objProxy.realmSet$group(null);
            } else {
                virtual.meeting.moi.models.Group groupObj = virtual_meeting_moi_models_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("group"), update);
                objProxy.realmSet$group(groupObj);
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static virtual.meeting.moi.models.Status createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final virtual.meeting.moi.models.Status obj = new virtual.meeting.moi.models.Status();
        final virtual_meeting_moi_models_StatusRealmProxyInterface objProxy = (virtual_meeting_moi_models_StatusRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("statusImages")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$statusImages(null);
                } else {
                    objProxy.realmSet$statusImages(new RealmList<virtual.meeting.moi.models.StatusImage>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        virtual.meeting.moi.models.StatusImage item = virtual_meeting_moi_models_StatusImageRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$statusImages().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("lastMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastMessage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                }
            } else if (name.equals("myId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myId(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("groupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$groupId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$groupId(null);
                }
            } else if (name.equals("timeUpdated")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeUpdated((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
                }
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    virtual.meeting.moi.models.User userObj = virtual_meeting_moi_models_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("group")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$group(null);
                } else {
                    virtual.meeting.moi.models.Group groupObj = virtual_meeting_moi_models_GroupRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$group(groupObj);
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static virtual_meeting_moi_models_StatusRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class), false, Collections.<String>emptyList());
        io.realm.virtual_meeting_moi_models_StatusRealmProxy obj = new io.realm.virtual_meeting_moi_models_StatusRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static virtual.meeting.moi.models.Status copyOrUpdate(Realm realm, StatusColumnInfo columnInfo, virtual.meeting.moi.models.Status object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (virtual.meeting.moi.models.Status) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static virtual.meeting.moi.models.Status copy(Realm realm, StatusColumnInfo columnInfo, virtual.meeting.moi.models.Status newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (virtual.meeting.moi.models.Status) cachedRealmObject;
        }

        virtual_meeting_moi_models_StatusRealmProxyInterface realmObjectSource = (virtual_meeting_moi_models_StatusRealmProxyInterface) newObject;

        Table table = realm.getTable(virtual.meeting.moi.models.Status.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.lastMessageIndex, realmObjectSource.realmGet$lastMessage());
        builder.addString(columnInfo.myIdIndex, realmObjectSource.realmGet$myId());
        builder.addString(columnInfo.userIdIndex, realmObjectSource.realmGet$userId());
        builder.addString(columnInfo.groupIdIndex, realmObjectSource.realmGet$groupId());
        builder.addInteger(columnInfo.timeUpdatedIndex, realmObjectSource.realmGet$timeUpdated());
        builder.addBoolean(columnInfo.readIndex, realmObjectSource.realmGet$read());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.virtual_meeting_moi_models_StatusRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<virtual.meeting.moi.models.StatusImage> statusImagesList = realmObjectSource.realmGet$statusImages();
        if (statusImagesList != null) {
            RealmList<virtual.meeting.moi.models.StatusImage> statusImagesRealmList = realmObjectCopy.realmGet$statusImages();
            statusImagesRealmList.clear();
            for (int i = 0; i < statusImagesList.size(); i++) {
                virtual.meeting.moi.models.StatusImage statusImagesItem = statusImagesList.get(i);
                virtual.meeting.moi.models.StatusImage cachestatusImages = (virtual.meeting.moi.models.StatusImage) cache.get(statusImagesItem);
                if (cachestatusImages != null) {
                    statusImagesRealmList.add(cachestatusImages);
                } else {
                    statusImagesRealmList.add(virtual_meeting_moi_models_StatusImageRealmProxy.copyOrUpdate(realm, (virtual_meeting_moi_models_StatusImageRealmProxy.StatusImageColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImage.class), statusImagesItem, update, cache, flags));
                }
            }
        }

        virtual.meeting.moi.models.User userObj = realmObjectSource.realmGet$user();
        if (userObj == null) {
            realmObjectCopy.realmSet$user(null);
        } else {
            virtual.meeting.moi.models.User cacheuser = (virtual.meeting.moi.models.User) cache.get(userObj);
            if (cacheuser != null) {
                realmObjectCopy.realmSet$user(cacheuser);
            } else {
                realmObjectCopy.realmSet$user(virtual_meeting_moi_models_UserRealmProxy.copyOrUpdate(realm, (virtual_meeting_moi_models_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.User.class), userObj, update, cache, flags));
            }
        }

        virtual.meeting.moi.models.Group groupObj = realmObjectSource.realmGet$group();
        if (groupObj == null) {
            realmObjectCopy.realmSet$group(null);
        } else {
            virtual.meeting.moi.models.Group cachegroup = (virtual.meeting.moi.models.Group) cache.get(groupObj);
            if (cachegroup != null) {
                realmObjectCopy.realmSet$group(cachegroup);
            } else {
                realmObjectCopy.realmSet$group(virtual_meeting_moi_models_GroupRealmProxy.copyOrUpdate(realm, (virtual_meeting_moi_models_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class), groupObj, update, cache, flags));
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, virtual.meeting.moi.models.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        RealmList<virtual.meeting.moi.models.StatusImage> statusImagesList = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$statusImages();
        if (statusImagesList != null) {
            OsList statusImagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.statusImagesIndex);
            for (virtual.meeting.moi.models.StatusImage statusImagesItem : statusImagesList) {
                Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                if (cacheItemIndexstatusImages == null) {
                    cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insert(realm, statusImagesItem, cache);
                }
                statusImagesOsList.addRow(cacheItemIndexstatusImages);
            }
        }
        String realmGet$lastMessage = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        }
        String realmGet$myId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        }
        String realmGet$userId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$groupId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$timeUpdated(), false);

        virtual.meeting.moi.models.User userObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = virtual_meeting_moi_models_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        }

        virtual.meeting.moi.models.Group groupObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = virtual_meeting_moi_models_GroupRealmProxy.insert(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$read(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class);
        virtual.meeting.moi.models.Status object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            RealmList<virtual.meeting.moi.models.StatusImage> statusImagesList = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$statusImages();
            if (statusImagesList != null) {
                OsList statusImagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.statusImagesIndex);
                for (virtual.meeting.moi.models.StatusImage statusImagesItem : statusImagesList) {
                    Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                    if (cacheItemIndexstatusImages == null) {
                        cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insert(realm, statusImagesItem, cache);
                    }
                    statusImagesOsList.addRow(cacheItemIndexstatusImages);
                }
            }
            String realmGet$lastMessage = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            }
            String realmGet$myId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            }
            String realmGet$userId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            String realmGet$groupId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$groupId();
            if (realmGet$groupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$timeUpdated(), false);

            virtual.meeting.moi.models.User userObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = virtual_meeting_moi_models_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userIndex, rowIndex, cacheuser, false);
            }

            virtual.meeting.moi.models.Group groupObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = virtual_meeting_moi_models_GroupRealmProxy.insert(realm, groupObj, cache);
                }
                table.setLink(columnInfo.groupIndex, rowIndex, cachegroup, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$read(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, virtual.meeting.moi.models.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(virtual.meeting.moi.models.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        OsList statusImagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.statusImagesIndex);
        RealmList<virtual.meeting.moi.models.StatusImage> statusImagesList = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$statusImages();
        if (statusImagesList != null && statusImagesList.size() == statusImagesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = statusImagesList.size();
            for (int i = 0; i < objects; i++) {
                virtual.meeting.moi.models.StatusImage statusImagesItem = statusImagesList.get(i);
                Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                if (cacheItemIndexstatusImages == null) {
                    cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, statusImagesItem, cache);
                }
                statusImagesOsList.setRow(i, cacheItemIndexstatusImages);
            }
        } else {
            statusImagesOsList.removeAll();
            if (statusImagesList != null) {
                for (virtual.meeting.moi.models.StatusImage statusImagesItem : statusImagesList) {
                    Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                    if (cacheItemIndexstatusImages == null) {
                        cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, statusImagesItem, cache);
                    }
                    statusImagesOsList.addRow(cacheItemIndexstatusImages);
                }
            }
        }

        String realmGet$lastMessage = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
        }
        String realmGet$myId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
        }
        String realmGet$userId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$groupId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$timeUpdated(), false);

        virtual.meeting.moi.models.User userObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = virtual_meeting_moi_models_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
        }

        virtual.meeting.moi.models.Group groupObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = virtual_meeting_moi_models_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.groupIndex, rowIndex);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$read(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(virtual.meeting.moi.models.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class);
        virtual.meeting.moi.models.Status object = null;
        while (objects.hasNext()) {
            object = (virtual.meeting.moi.models.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            OsList statusImagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.statusImagesIndex);
            RealmList<virtual.meeting.moi.models.StatusImage> statusImagesList = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$statusImages();
            if (statusImagesList != null && statusImagesList.size() == statusImagesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = statusImagesList.size();
                for (int i = 0; i < objectCount; i++) {
                    virtual.meeting.moi.models.StatusImage statusImagesItem = statusImagesList.get(i);
                    Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                    if (cacheItemIndexstatusImages == null) {
                        cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, statusImagesItem, cache);
                    }
                    statusImagesOsList.setRow(i, cacheItemIndexstatusImages);
                }
            } else {
                statusImagesOsList.removeAll();
                if (statusImagesList != null) {
                    for (virtual.meeting.moi.models.StatusImage statusImagesItem : statusImagesList) {
                        Long cacheItemIndexstatusImages = cache.get(statusImagesItem);
                        if (cacheItemIndexstatusImages == null) {
                            cacheItemIndexstatusImages = virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, statusImagesItem, cache);
                        }
                        statusImagesOsList.addRow(cacheItemIndexstatusImages);
                    }
                }
            }

            String realmGet$lastMessage = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
            }
            String realmGet$myId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
            }
            String realmGet$userId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$groupId = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$groupId();
            if (realmGet$groupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$timeUpdated(), false);

            virtual.meeting.moi.models.User userObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = virtual_meeting_moi_models_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
            }

            virtual.meeting.moi.models.Group groupObj = ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = virtual_meeting_moi_models_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.groupIndex, rowIndex);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((virtual_meeting_moi_models_StatusRealmProxyInterface) object).realmGet$read(), false);
        }
    }

    public static virtual.meeting.moi.models.Status createDetachedCopy(virtual.meeting.moi.models.Status realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        virtual.meeting.moi.models.Status unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new virtual.meeting.moi.models.Status();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (virtual.meeting.moi.models.Status) cachedObject.object;
            }
            unmanagedObject = (virtual.meeting.moi.models.Status) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        virtual_meeting_moi_models_StatusRealmProxyInterface unmanagedCopy = (virtual_meeting_moi_models_StatusRealmProxyInterface) unmanagedObject;
        virtual_meeting_moi_models_StatusRealmProxyInterface realmSource = (virtual_meeting_moi_models_StatusRealmProxyInterface) realmObject;

        // Deep copy of statusImages
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$statusImages(null);
        } else {
            RealmList<virtual.meeting.moi.models.StatusImage> managedstatusImagesList = realmSource.realmGet$statusImages();
            RealmList<virtual.meeting.moi.models.StatusImage> unmanagedstatusImagesList = new RealmList<virtual.meeting.moi.models.StatusImage>();
            unmanagedCopy.realmSet$statusImages(unmanagedstatusImagesList);
            int nextDepth = currentDepth + 1;
            int size = managedstatusImagesList.size();
            for (int i = 0; i < size; i++) {
                virtual.meeting.moi.models.StatusImage item = virtual_meeting_moi_models_StatusImageRealmProxy.createDetachedCopy(managedstatusImagesList.get(i), nextDepth, maxDepth, cache);
                unmanagedstatusImagesList.add(item);
            }
        }
        unmanagedCopy.realmSet$lastMessage(realmSource.realmGet$lastMessage());
        unmanagedCopy.realmSet$myId(realmSource.realmGet$myId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$groupId(realmSource.realmGet$groupId());
        unmanagedCopy.realmSet$timeUpdated(realmSource.realmGet$timeUpdated());

        // Deep copy of user
        unmanagedCopy.realmSet$user(virtual_meeting_moi_models_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));

        // Deep copy of group
        unmanagedCopy.realmSet$group(virtual_meeting_moi_models_GroupRealmProxy.createDetachedCopy(realmSource.realmGet$group(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Status = proxy[");
        stringBuilder.append("{statusImages:");
        stringBuilder.append("RealmList<StatusImage>[").append(realmGet$statusImages().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastMessage:");
        stringBuilder.append(realmGet$lastMessage() != null ? realmGet$lastMessage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myId:");
        stringBuilder.append(realmGet$myId() != null ? realmGet$myId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{groupId:");
        stringBuilder.append(realmGet$groupId() != null ? realmGet$groupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeUpdated:");
        stringBuilder.append(realmGet$timeUpdated());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? "User" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{group:");
        stringBuilder.append(realmGet$group() != null ? "Group" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{read:");
        stringBuilder.append(realmGet$read());
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
        virtual_meeting_moi_models_StatusRealmProxy aStatus = (virtual_meeting_moi_models_StatusRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aStatus.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aStatus.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aStatus.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
