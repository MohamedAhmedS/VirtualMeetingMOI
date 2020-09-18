package virtual.meeting.moi.interfaces;

import virtual.meeting.moi.models.Contact;
import virtual.meeting.moi.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    User getUserMe();

    ArrayList<Contact> getLocalContacts();

}
