package com.trnet.Controller;

import com.trnet.Interface.Member;
import com.trnet.Interface.Crime;

public class InformedMember implements Member {

    private String name;
    private Crime information;

    public InformedMember(String name){
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) information.getUpdate(this);

        if(msg == null){
            System.out.println(name+", No new message");
        }
        else
            System.out.println(name+", got message : "+msg);
    }

    @Override
    public void setInformation(Crime info) {
        this.information = info;
    }

}