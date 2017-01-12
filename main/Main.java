package main;

import backend.*;
import frontend.*;
import other.*;

public class Main {

    public static void main(String[] args) {

        // access protected methods from package backend
        new Cpp().accessProtectedMethods();
        new Java().accessProtectedMethods(); // can access same methods as Cpp
        new Groovy().accessProtectedMethods(); // can access same methods as Cpp
        new Ruby().accessProtectedMethods(); // can access same methods as Cpp

        // access protected fields from package backend
        new Cpp().accessProtectedFields();
        new Java().accessProtectedFields(); // can access same fields as Cpp
        new Groovy().accessProtectedFields(); // can access same fields as Cpp
        new Ruby().accessProtectedFields(); // can access same fields as Cpp

        // access protected methods from package frontend
        new Javascript().accessProtectedMethods();
        new AsmJs().accessProtectedMethods();
        new TypeScript().accessProtectedMethods();
        new AtScript().accessProtectedMethods();
        new Php().accessProtectedMethods();

        // access protected fields from package frontend
        new Javascript().accessProtectedFields();
        new AsmJs().accessProtectedFields();
        new TypeScript().accessProtectedFields();
        new AtScript().accessProtectedFields();
        new Php().accessProtectedFields();

        // access protected methods from package other
        new JSFuck().accessProtectedMethods();
        new Flow().accessProtectedMethods();

        // access protected fields from package other
        new JSFuck().accessProtectedFields();
        new Flow().accessProtectedFields();
    }

    public static void printFieldAccess(String loc, String decl, String ref, String obj) {
        System.out.println("f: Loc " + loc + ", decl in " + decl + ", ref type " + ref + ", instance of " + obj);
    }
}
