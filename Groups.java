public class Groups {
    private String groupName;
    private String[] groupMembers;
    
    public Groups(String groupName) {
        this.groupName = groupName;
    }
    
    public String getGroupName() {
        return groupName;
    }
    
    public String[] getGroupMembers() {
        return groupMembers;
    }
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public void setGroupMembers(String[] groupMembers) {
        this.groupMembers = groupMembers;
    }
    
    public void addGroupMember(String member) {
        String[] temp = new String[groupMembers.length + 1];
        for (int i = 0; i < groupMembers.length; i++) {
            temp[i] = groupMembers[i];
        }
        temp[groupMembers.length] = member;
        groupMembers = temp;
    }
    
    public void removeGroupMember(String member) {
        String[] temp = new String[groupMembers.length - 1];
        int j = 0;
        for (int i = 0; i < groupMembers.length; i++) {
            if (!groupMembers[i].equals(member)) {
                temp[j] = groupMembers[i];
                j++;
            }
        }
        groupMembers = temp;
    }
    
    public String toString() {
        String output = "";
        output += "Group Name: " + groupName + "\n";
        output += "Group Members: ";
        for (int i = 0; i < groupMembers.length; i++) {
            output += groupMembers[i] + ", ";
        }
        return output;
    }
    
}
