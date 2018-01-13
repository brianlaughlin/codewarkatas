package kata.generics;

import java.util.ArrayList;

public class GenericFun {

    private Object t;



    public void doSomething(){
        Object t = new ArrayList<String>();




    }


    public Object getT() {
        return t;
    }

    public void setT(Object t) {
        this.t = t;
    }

}
