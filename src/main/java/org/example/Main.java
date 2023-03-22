package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1.soru
        System.out.println("datastructureisUnique(\"tree\") =>" + Methods.datastructureisUnique("tree"));
        System.out.println("datastructureisUnique(\"home\") =>" + Methods.datastructureisUnique("home"));
        //System.out.println("isUnique(\"\") =>" +Methods.datastructureisUnique(null));

        //2.soru
        System.out.println("isUnique(\"tree\") =>" + Methods.isUnique("tree"));
        System.out.println("isUnique(\"home\") =>" + Methods.isUnique("home"));
        //System.out.println("isUnique(null) =>" +Methods.isUnique(null));

        //3.soru
        System.out.print("4+7 =");
        Methods.total(4, 7);
    }


}