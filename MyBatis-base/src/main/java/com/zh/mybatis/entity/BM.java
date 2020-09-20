package com.zh.mybatis.entity;
/*jjjjj*/
public class BM {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
