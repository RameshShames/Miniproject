package com.example.miniproject;

public class Global {
    private static Global instance;
    static String name;
     static  String email;
private Global(){}

    public  String getName() {
        return Global.name;
    }

    public void setName(String name) {
        Global.name = name;
    }

    public  String getEmail() {
        return Global.email;
    }

    public void setEmail(String email) {
        Global.email = email;
    }
    public  static synchronized Global getInstance(){
    if(instance==null){
        instance=new Global();
    }
    return instance;
    }
}
