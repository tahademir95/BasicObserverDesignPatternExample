package com.trnet.Controller;

import com.trnet.Interface.Member;
import com.trnet.Interface.Crime;

import java.util.ArrayList;
import java.util.List;

public class CrimeInfo implements Crime {

    private List<Member> memberList;
    private String message;

    public CrimeInfo(){
        this.memberList =new ArrayList<>();
    }

    @Override
    public void addMember(Member mem) {
        if(mem == null) throw new NullPointerException("No Member Now");
        if(!memberList.contains(mem)) memberList.add(mem);
    }

    @Override
    public void deleteMember(Member mem) {
        memberList.remove(mem);
    }

    @Override
    public void notifyMembers() {
        List<Member> tempMemberList = null;

        tempMemberList = new ArrayList<>(this.memberList);

        for (Member mem : tempMemberList) {
            mem.update();
        }
    }

    @Override
    public Object getUpdate(Member mem) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Posted message is : " + "'" + msg + "'");
        System.out.println();

        this.message=msg;

        notifyMembers();
    }

}