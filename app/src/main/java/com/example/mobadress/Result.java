package com.example.mobadress;

import java.util.stream.Stream;

import kotlin.jvm.internal.SerializedIr;

public class Result {
    public static String Locality;
    public static String Street;
    public static String House;

    public static String GetLocality() {return  Locality;}
    public static   String GetStreet() {return Street;}
    public static String GetHouse() {return House;}

    public static void SetLocality(String locality) {Locality = locality;}

    public static void SetStreet(String street) {Street = street;}
    public static  void  SetHouse(String house) {House = house;}
}
