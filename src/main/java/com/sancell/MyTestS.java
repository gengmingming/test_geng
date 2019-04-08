package com.sancell;

public class MyTestS {

    private static MyTestS ourInstance = new MyTestS();

    public static MyTestS getInstance() {

        return ourInstance;
    }

    private MyTestS() {

    }

    public static void setOurInstance(MyTestS ourInstance) {

        MyTestS.ourInstance = ourInstance;
    }

    public static MyTestS getOurInstance() {

        return ourInstance;
    }

}
