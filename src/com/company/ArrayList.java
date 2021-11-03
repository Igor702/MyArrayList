package com.company;

import javax.management.ObjectName;

public class ArrayList  {

    private Object[] arrayList;

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    private int size;
    private int numberOfObjects;

    ArrayList(){
        size = 4;
        arrayList = new Object[size];

    }

    ArrayList(int capacity){
        arrayList = new Object[capacity];
        size = capacity;
    }

    void add(Object o){

        copy();
        if (numberOfObjects!=0){
            arrayList[numberOfObjects] = o;
        }else {
            arrayList[0] = o;
        }
        numberOfObjects++;
    }
    void add(int index, Object o){
        if (numberOfObjects==size){
            copy();
        }
        shiftRight(index);
        arrayList[index] = o;
        numberOfObjects++;

    }

    private void copy(){
        Object[] newArray = new  Object[size+(size/2)];
        for (int i = 0;i<size;i++){
            newArray[i] = arrayList[i];
        }
        arrayList = newArray;
        size = size+(size/2);
    }
    private void shiftRight(int index){
        for (int i = numberOfObjects;i>index-1;i--){
            arrayList[i+1] = arrayList[i];
        }

    }


    Object get(int index){
        if (arrayList[index]!=null){
            return arrayList[index];
        }else {
            return "invalid index";
        }
    }

    int size(){
        return numberOfObjects;
    }

    boolean isEmpty(){
        if (numberOfObjects!=0){
            return false;
        }else {
            return true;
        }
    }
//we compare only links!!!!
    boolean isIn(Object o){
        for (int i = 0;i<numberOfObjects;i++){
            if (arrayList[i]==o){
                return true;
                }
            }
        return false;
        }

//must change -1 to another option!!!!!
        int find(Object o){
        for (int i = 0;i<numberOfObjects;i++){
            if (arrayList[i]==o){
                return i;
            }
        }
        return -1;
        }

        void remove(Object o){
        int value = find(o);
        arrayList[value] = null;
        shiftLeft(value);
        numberOfObjects--;


        }
        private void shiftLeft(int value){
        for (int i = value;i<numberOfObjects;i++){
            arrayList[value] = arrayList[value+1];
        }
        }
    }



