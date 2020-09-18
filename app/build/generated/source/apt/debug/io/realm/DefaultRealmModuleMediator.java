package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(15);
        modelClasses.add(virtual.meeting.moi.models.Attachment.class);
        modelClasses.add(virtual.meeting.moi.models.AttachmentList.class);
        modelClasses.add(virtual.meeting.moi.models.Chat.class);
        modelClasses.add(virtual.meeting.moi.models.Group.class);
        modelClasses.add(virtual.meeting.moi.models.LogCall.class);
        modelClasses.add(virtual.meeting.moi.models.Message.class);
        modelClasses.add(virtual.meeting.moi.models.MessageNew.class);
        modelClasses.add(virtual.meeting.moi.models.MyString.class);
        modelClasses.add(virtual.meeting.moi.models.solochat.class);
        modelClasses.add(virtual.meeting.moi.models.Status.class);
        modelClasses.add(virtual.meeting.moi.models.StatusImage.class);
        modelClasses.add(virtual.meeting.moi.models.StatusImageList.class);
        modelClasses.add(virtual.meeting.moi.models.StatusImageNew.class);
        modelClasses.add(virtual.meeting.moi.models.StatusNew.class);
        modelClasses.add(virtual.meeting.moi.models.User.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(15);
        infoMap.put(virtual.meeting.moi.models.Attachment.class, io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.AttachmentList.class, io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.Chat.class, io.realm.virtual_meeting_moi_models_ChatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.Group.class, io.realm.virtual_meeting_moi_models_GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.LogCall.class, io.realm.virtual_meeting_moi_models_LogCallRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.Message.class, io.realm.virtual_meeting_moi_models_MessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.MessageNew.class, io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.MyString.class, io.realm.virtual_meeting_moi_models_MyStringRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.solochat.class, io.realm.virtual_meeting_moi_models_solochatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.Status.class, io.realm.virtual_meeting_moi_models_StatusRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.StatusImage.class, io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.StatusImageList.class, io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.StatusImageNew.class, io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.StatusNew.class, io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(virtual.meeting.moi.models.User.class, io.realm.virtual_meeting_moi_models_UserRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            return io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            return io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            return io.realm.virtual_meeting_moi_models_ChatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            return io.realm.virtual_meeting_moi_models_GroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            return io.realm.virtual_meeting_moi_models_LogCallRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            return io.realm.virtual_meeting_moi_models_MessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            return io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            return io.realm.virtual_meeting_moi_models_MyStringRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            return io.realm.virtual_meeting_moi_models_solochatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            return io.realm.virtual_meeting_moi_models_StatusRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            return io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            return io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            return io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            return io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            return io.realm.virtual_meeting_moi_models_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            return "Attachment";
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            return "AttachmentList";
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            return "Chat";
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            return "Group";
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            return "LogCall";
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            return "Message";
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            return "MessageNew";
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            return "MyString";
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            return "solochat";
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            return "Status";
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            return "StatusImage";
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            return "StatusImageList";
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            return "StatusImageNew";
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            return "StatusNew";
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            return "User";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_AttachmentRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_ChatRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_GroupRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_LogCallRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_MessageRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_MessageNewRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_MyStringRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_solochatRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_StatusRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_StatusImageRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_StatusNewRealmProxy());
            }
            if (clazz.equals(virtual.meeting.moi.models.User.class)) {
                return clazz.cast(new io.realm.virtual_meeting_moi_models_UserRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            virtual_meeting_moi_models_AttachmentRealmProxy.AttachmentColumnInfo columnInfo = (virtual_meeting_moi_models_AttachmentRealmProxy.AttachmentColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Attachment.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.Attachment) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            virtual_meeting_moi_models_AttachmentListRealmProxy.AttachmentListColumnInfo columnInfo = (virtual_meeting_moi_models_AttachmentListRealmProxy.AttachmentListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.AttachmentList.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.AttachmentList) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            virtual_meeting_moi_models_ChatRealmProxy.ChatColumnInfo columnInfo = (virtual_meeting_moi_models_ChatRealmProxy.ChatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Chat.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_ChatRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.Chat) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            virtual_meeting_moi_models_GroupRealmProxy.GroupColumnInfo columnInfo = (virtual_meeting_moi_models_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Group.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_GroupRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.Group) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            virtual_meeting_moi_models_LogCallRealmProxy.LogCallColumnInfo columnInfo = (virtual_meeting_moi_models_LogCallRealmProxy.LogCallColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.LogCall.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_LogCallRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.LogCall) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            virtual_meeting_moi_models_MessageRealmProxy.MessageColumnInfo columnInfo = (virtual_meeting_moi_models_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Message.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.Message) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            virtual_meeting_moi_models_MessageNewRealmProxy.MessageNewColumnInfo columnInfo = (virtual_meeting_moi_models_MessageNewRealmProxy.MessageNewColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.MessageNew.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.MessageNew) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            virtual_meeting_moi_models_MyStringRealmProxy.MyStringColumnInfo columnInfo = (virtual_meeting_moi_models_MyStringRealmProxy.MyStringColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.MyString.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_MyStringRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.MyString) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            virtual_meeting_moi_models_solochatRealmProxy.solochatColumnInfo columnInfo = (virtual_meeting_moi_models_solochatRealmProxy.solochatColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.solochat.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_solochatRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.solochat) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            virtual_meeting_moi_models_StatusRealmProxy.StatusColumnInfo columnInfo = (virtual_meeting_moi_models_StatusRealmProxy.StatusColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.Status.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.Status) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            virtual_meeting_moi_models_StatusImageRealmProxy.StatusImageColumnInfo columnInfo = (virtual_meeting_moi_models_StatusImageRealmProxy.StatusImageColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImage.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.StatusImage) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            virtual_meeting_moi_models_StatusImageListRealmProxy.StatusImageListColumnInfo columnInfo = (virtual_meeting_moi_models_StatusImageListRealmProxy.StatusImageListColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageList.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.StatusImageList) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            virtual_meeting_moi_models_StatusImageNewRealmProxy.StatusImageNewColumnInfo columnInfo = (virtual_meeting_moi_models_StatusImageNewRealmProxy.StatusImageNewColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusImageNew.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.StatusImageNew) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            virtual_meeting_moi_models_StatusNewRealmProxy.StatusNewColumnInfo columnInfo = (virtual_meeting_moi_models_StatusNewRealmProxy.StatusNewColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.StatusNew.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.StatusNew) obj, update, cache, flags));
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            virtual_meeting_moi_models_UserRealmProxy.UserColumnInfo columnInfo = (virtual_meeting_moi_models_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(virtual.meeting.moi.models.User.class);
            return clazz.cast(io.realm.virtual_meeting_moi_models_UserRealmProxy.copyOrUpdate(realm, columnInfo, (virtual.meeting.moi.models.User) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insert(realm, (virtual.meeting.moi.models.Attachment) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insert(realm, (virtual.meeting.moi.models.AttachmentList) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            io.realm.virtual_meeting_moi_models_ChatRealmProxy.insert(realm, (virtual.meeting.moi.models.Chat) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            io.realm.virtual_meeting_moi_models_GroupRealmProxy.insert(realm, (virtual.meeting.moi.models.Group) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insert(realm, (virtual.meeting.moi.models.LogCall) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            io.realm.virtual_meeting_moi_models_MessageRealmProxy.insert(realm, (virtual.meeting.moi.models.Message) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insert(realm, (virtual.meeting.moi.models.MessageNew) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insert(realm, (virtual.meeting.moi.models.MyString) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            io.realm.virtual_meeting_moi_models_solochatRealmProxy.insert(realm, (virtual.meeting.moi.models.solochat) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            io.realm.virtual_meeting_moi_models_StatusRealmProxy.insert(realm, (virtual.meeting.moi.models.Status) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImage) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImageList) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImageNew) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusNew) object, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            io.realm.virtual_meeting_moi_models_UserRealmProxy.insert(realm, (virtual.meeting.moi.models.User) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
                io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insert(realm, (virtual.meeting.moi.models.Attachment) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
                io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insert(realm, (virtual.meeting.moi.models.AttachmentList) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
                io.realm.virtual_meeting_moi_models_ChatRealmProxy.insert(realm, (virtual.meeting.moi.models.Chat) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
                io.realm.virtual_meeting_moi_models_GroupRealmProxy.insert(realm, (virtual.meeting.moi.models.Group) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
                io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insert(realm, (virtual.meeting.moi.models.LogCall) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
                io.realm.virtual_meeting_moi_models_MessageRealmProxy.insert(realm, (virtual.meeting.moi.models.Message) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
                io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insert(realm, (virtual.meeting.moi.models.MessageNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
                io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insert(realm, (virtual.meeting.moi.models.MyString) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
                io.realm.virtual_meeting_moi_models_solochatRealmProxy.insert(realm, (virtual.meeting.moi.models.solochat) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
                io.realm.virtual_meeting_moi_models_StatusRealmProxy.insert(realm, (virtual.meeting.moi.models.Status) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImage) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImageList) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusImageNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
                io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insert(realm, (virtual.meeting.moi.models.StatusNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
                io.realm.virtual_meeting_moi_models_UserRealmProxy.insert(realm, (virtual.meeting.moi.models.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
                    io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
                    io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
                    io.realm.virtual_meeting_moi_models_ChatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
                    io.realm.virtual_meeting_moi_models_GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
                    io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
                    io.realm.virtual_meeting_moi_models_MessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
                    io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
                    io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
                    io.realm.virtual_meeting_moi_models_solochatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
                    io.realm.virtual_meeting_moi_models_StatusRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
                    io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
                    io.realm.virtual_meeting_moi_models_UserRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Attachment) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.AttachmentList) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            io.realm.virtual_meeting_moi_models_ChatRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Chat) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            io.realm.virtual_meeting_moi_models_GroupRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Group) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.LogCall) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            io.realm.virtual_meeting_moi_models_MessageRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Message) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.MessageNew) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.MyString) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            io.realm.virtual_meeting_moi_models_solochatRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.solochat) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            io.realm.virtual_meeting_moi_models_StatusRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Status) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImage) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImageList) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImageNew) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusNew) obj, cache);
        } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            io.realm.virtual_meeting_moi_models_UserRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.User) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
                io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Attachment) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
                io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.AttachmentList) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
                io.realm.virtual_meeting_moi_models_ChatRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Chat) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
                io.realm.virtual_meeting_moi_models_GroupRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Group) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
                io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.LogCall) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
                io.realm.virtual_meeting_moi_models_MessageRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Message) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
                io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.MessageNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
                io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.MyString) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
                io.realm.virtual_meeting_moi_models_solochatRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.solochat) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
                io.realm.virtual_meeting_moi_models_StatusRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.Status) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImage) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImageList) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
                io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusImageNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
                io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.StatusNew) object, cache);
            } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
                io.realm.virtual_meeting_moi_models_UserRealmProxy.insertOrUpdate(realm, (virtual.meeting.moi.models.User) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
                    io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
                    io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
                    io.realm.virtual_meeting_moi_models_ChatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
                    io.realm.virtual_meeting_moi_models_GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
                    io.realm.virtual_meeting_moi_models_LogCallRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
                    io.realm.virtual_meeting_moi_models_MessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
                    io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
                    io.realm.virtual_meeting_moi_models_MyStringRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
                    io.realm.virtual_meeting_moi_models_solochatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
                    io.realm.virtual_meeting_moi_models_StatusRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
                    io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
                    io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(virtual.meeting.moi.models.User.class)) {
                    io.realm.virtual_meeting_moi_models_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_ChatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_LogCallRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MyStringRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_solochatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_ChatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_LogCallRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MyStringRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_solochatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(virtual.meeting.moi.models.Attachment.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentRealmProxy.createDetachedCopy((virtual.meeting.moi.models.Attachment) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.AttachmentList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_AttachmentListRealmProxy.createDetachedCopy((virtual.meeting.moi.models.AttachmentList) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.Chat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_ChatRealmProxy.createDetachedCopy((virtual.meeting.moi.models.Chat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.Group.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_GroupRealmProxy.createDetachedCopy((virtual.meeting.moi.models.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.LogCall.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_LogCallRealmProxy.createDetachedCopy((virtual.meeting.moi.models.LogCall) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.Message.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageRealmProxy.createDetachedCopy((virtual.meeting.moi.models.Message) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.MessageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MessageNewRealmProxy.createDetachedCopy((virtual.meeting.moi.models.MessageNew) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.MyString.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_MyStringRealmProxy.createDetachedCopy((virtual.meeting.moi.models.MyString) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.solochat.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_solochatRealmProxy.createDetachedCopy((virtual.meeting.moi.models.solochat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.Status.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusRealmProxy.createDetachedCopy((virtual.meeting.moi.models.Status) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImage.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageRealmProxy.createDetachedCopy((virtual.meeting.moi.models.StatusImage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageList.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageListRealmProxy.createDetachedCopy((virtual.meeting.moi.models.StatusImageList) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusImageNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusImageNewRealmProxy.createDetachedCopy((virtual.meeting.moi.models.StatusImageNew) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.StatusNew.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_StatusNewRealmProxy.createDetachedCopy((virtual.meeting.moi.models.StatusNew) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(virtual.meeting.moi.models.User.class)) {
            return clazz.cast(io.realm.virtual_meeting_moi_models_UserRealmProxy.createDetachedCopy((virtual.meeting.moi.models.User) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
