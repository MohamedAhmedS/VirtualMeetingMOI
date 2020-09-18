package io.realm;


public interface virtual_meeting_moi_models_ChatRealmProxyInterface {
    public RealmList<virtual.meeting.moi.models.Message> realmGet$messages();
    public void realmSet$messages(RealmList<virtual.meeting.moi.models.Message> value);
    public String realmGet$lastMessage();
    public void realmSet$lastMessage(String value);
    public String realmGet$myId();
    public void realmSet$myId(String value);
    public String realmGet$userId();
    public void realmSet$userId(String value);
    public String realmGet$groupId();
    public void realmSet$groupId(String value);
    public long realmGet$timeUpdated();
    public void realmSet$timeUpdated(long value);
    public virtual.meeting.moi.models.User realmGet$user();
    public void realmSet$user(virtual.meeting.moi.models.User value);
    public virtual.meeting.moi.models.Group realmGet$group();
    public void realmSet$group(virtual.meeting.moi.models.Group value);
    public boolean realmGet$read();
    public void realmSet$read(boolean value);
}
