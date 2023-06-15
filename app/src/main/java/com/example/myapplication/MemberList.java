package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class MemberList {
    ArrayList<MemberDTO> list = new ArrayList<>();

    public void addMember(MemberDTO member) {
        list.add(member);
    }

    public void removeMember(MemberDTO member) {
        list.remove(member);
    }

    public MemberDTO getMember(int index) {
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }
}

