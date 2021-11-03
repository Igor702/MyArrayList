package com.company;


public class Main {

    public static void main(String[] args) {

        String str = "one";
        String str1 = "two";
        String str2 = "three";
        String str3 = "four";
        String str4 = "five";
	    ArrayList arr = new ArrayList(6);

	    arr.add(str);
	    arr.add(str1);
	    arr.add(str2);
	    arr.add(str3);
	    arr.add(str4);

	    arr.remove(str2);





	    for (int i = 0;i< arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
