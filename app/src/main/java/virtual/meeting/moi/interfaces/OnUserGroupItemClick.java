package virtual.meeting.moi.interfaces;

import android.view.View;

import virtual.meeting.moi.models.Group;
import virtual.meeting.moi.models.User;


public interface OnUserGroupItemClick {
    void OnUserClick(User user, int position, View userImage);
    void OnGroupClick(Group group, int position, View userImage);
}
