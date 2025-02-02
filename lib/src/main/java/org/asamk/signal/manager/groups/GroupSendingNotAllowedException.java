package org.asamk.signal.manager.groups;

public class GroupSendingNotAllowedException extends Exception {

    public GroupSendingNotAllowedException(GroupId groupId, String groupName) {
        super("User is not allowed to send message to group: " + groupName + " (" + groupId.toBase64() + ")");
    }
}
