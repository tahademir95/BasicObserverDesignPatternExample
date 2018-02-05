package com.trnet.Interface;

public interface Crime {

    //methods to addMember and deleteMember observers
    public void addMember(Member mem);
    public void deleteMember(Member mem);

    //method to notify members of change
    public void notifyMembers();

    //method to get updates from crime information
    public Object getUpdate(Member mem);

}
