package com.trnet.Interface;

public interface Member {

    //method to update the members, used by crime info
    public void update();

    //attach with crime information to informed members
    public void setInformation(Crime info);

}
