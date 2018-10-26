package edu.mum.fpp.lab3.model;

import java.util.Arrays;

public class MyStringList {

    private String[] myStringList;
    private int size;

    public MyStringList() {
        size = 0;
        myStringList = new String[2];
    }

    public void add(String s) {
        if(size >= myStringList.length)
            resize();
        myStringList[size] = s;
        size++;
    }

    public String get(int i){
        return myStringList[i];
    }

    public boolean find(String s){
        for(String currentString : myStringList){
            if(currentString.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(String s){
        boolean result = find(s);
        if (result){
            System.out.println("removing....");
            size--;
            for(int index = 0; index <= myStringList.length; index++){
                if(myStringList[index].equals(s)){
                    myStringList[index] = null;
                    break;
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        for(int index = 0; index < size; index++){
            if(myStringList[index].equals(null)){

            }
        }
        return "MyStringList{" +
                "myStringList=" + Arrays.toString(myStringList) +
                '}';
    }

    public int size(){
        return size;
    }

    private void resize(){
        System.out.println("Resizing...");
        int newSize = size*2;
        String[] myStringListCloned = new String[newSize];
        System.arraycopy(myStringList,0, myStringListCloned, 0, size());
        myStringList = myStringListCloned;
    }
}
