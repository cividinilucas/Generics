package services;

import java.util.ArrayList;
import java.util.List;


public class PrintService<Type> {

    private List<Type> list = new ArrayList<>();

    public void addValue(Type value){
        list.add(value);
    }

    public Type first(){
        if(list.isEmpty()){
            throw new IllegalStateException("Empty list");
        }
        return list.get(0);
    }

    public void print(){
        System.out.println("[");
        if(!list.isEmpty()){
            System.out.println(list.get(0));
        }
        for(int i =0; i<= list.size(); i++){
            System.out.println(", " + list.get(i));
        }
        System.out.println("]");
    }
}
