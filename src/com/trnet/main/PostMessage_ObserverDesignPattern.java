package com.trnet.main;

import com.trnet.Controller.CrimeInfo;
import com.trnet.Controller.InformedMember;
import com.trnet.Interface.Member;

public class PostMessage_ObserverDesignPattern {

    public static void main(String[] args) {
        //create subject
        CrimeInfo information = new CrimeInfo();

        //create observers
        Member member1 = new InformedMember("Mother");
        Member member2 = new InformedMember("Father");

        information.addMember(member1);
        information.addMember(member2);

        member1.setInformation(information);
        member2.setInformation(information);

        System.out.println("*************************************************");
        System.out.println("Running update function before posting the message");
        System.out.println();
        member1.update();
        member2.update();
        System.out.println("*************************************************");

        information.postMessage("Your child is arrested for grabbing");

        System.out.println("*************************************************");
        System.out.println("Running update function after posting the message");
        System.out.println();
        member1.update();
        member2.update();
        System.out.println("*************************************************");

    }

}
