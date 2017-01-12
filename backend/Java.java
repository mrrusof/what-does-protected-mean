package backend;

import main.*;
import frontend.*;
import other.*;

public class Java extends Cpp {

    protected String f = "Java";

    protected void m(String l, String t) {
        System.out.println("m: Loc " + l + ", decl in Java, ref type " + t + ", instance of " + this.getClass().getSimpleName());
    }

    public void accessProtectedMethods() {
        String className = this.getClass().getSimpleName();

        // protected method m declared in Java

        new Java().m(className, "Java");
        new Groovy().m(className, "Groovy");
        ((Java) new Groovy()).m(className, "Java");
        new Javascript().m(className, "Javascript");
        ((Java) new Javascript()).m(className, "Java");
        new AsmJs().m(className, "AsmJs");
        ((Javascript) new AsmJs()).m(className, "Javascript");
        ((Java) new AsmJs()).m(className, "Java");
        new JSFuck().m(className, "JSFuck");
        ((Javascript) new JSFuck()).m(className, "Javascript");
        ((Java) new JSFuck()).m(className, "Java");

        // protected method m declared in TypeScript

        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new TypeScript().m(className, "TypeScript");
        ((Javascript) new TypeScript()).m(className, "Javascript");
        ((Java) new TypeScript()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new AtScript().m(className, "AtScript");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new AtScript()).m(className, "TypeScript");
        ((Javascript) new AtScript()).m(className, "Javascript");
        ((Java) new AtScript()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new Dart().m(className, "Dart");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new Dart()).m(className, "TypeScript");
        ((Javascript) new Dart()).m(className, "Javascript");
        ((Java) new Dart()).m(className, "Java");

        // protected method m declared in Flow

        // *** Compile error for following line: `m(String,String) has protected access in Flow`
        // new Flow().m(className, "Flow");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((Dart) new Flow()).m(className, "Dart");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new Flow()).m(className, "TypeScript");
        ((Javascript) new Flow()).m(className, "Javascript");
        ((Java) new Flow()).m(className, "Java");
    }

    public void accessProtectedFields() {
        String className = this.getClass().getSimpleName();

        // protected field f declared in Java

        Main.printFieldAccess(className, new Java().f, "Java", "Java");
        Main.printFieldAccess(className, new Groovy().f, "Groovy", "Groovy");
        Main.printFieldAccess(className, ((Java) new Groovy()).f, "Java", "Groovy");
        Main.printFieldAccess(className, new Javascript().f, "Javascript", "Javascript");
        Main.printFieldAccess(className, ((Java) new Javascript()).f, "Java", "Javascript");
        Main.printFieldAccess(className, new AsmJs().f, "AsmJs", "AsmJs");
        Main.printFieldAccess(className, ((Javascript) new AsmJs()).f, "Javascript", "AsmJs");
        Main.printFieldAccess(className, ((Java) new AsmJs()).f, "Java", "AsmJs");
        Main.printFieldAccess(className, new JSFuck().f, "JSFuck", "JSFuck");
        Main.printFieldAccess(className, ((Javascript) new JSFuck()).f, "Javascript", "JSFuck");
        Main.printFieldAccess(className, ((Java) new JSFuck()).f, "Java", "JSFuck");

        // protected field f declared in TypeScript

        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new TypeScript().f, "TypeScript", "TypeScript");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Javascript) new TypeScript()).f, "Javascript", "TypeScript");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Java) new TypeScript()).f, "Java", "TypeScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new AtScript().f, "AtScript", "AtScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new AtScript()).f, "TypeScript", "AtScript");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Javascript) new AtScript()).f, "Javascript", "AtScript");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Java) new AtScript()).f, "Java", "AtScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new Dart().f, "Dart", "Dart");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new Dart()).f, "TypeScript", "Dart");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Javascript) new Dart()).f, "Javascript", "Dart");
        // *** Does not access field declared in TypeScript but the one declared in Java.
        Main.printFieldAccess(className, ((Java) new Dart()).f, "Java", "Dart");

        // protected field f declared in Flow

        // *** Compile error for following line: `f has protected access in Flow`
        // Main.printFieldAccess(className, new Flow().f, "Flow", "Flow");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((Dart) new Flow()).f, "Dart", "Flow");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new Flow()).f, "TypeScript", "Flow");
        // *** Does not access field declared in Flow but the one declared in Java.
        Main.printFieldAccess(className, ((Javascript) new Flow()).f, "Javascript", "Flow");
        // *** Does not access field declared in Flow but the one declared in Java.
        Main.printFieldAccess(className, ((Java) new Flow()).f, "Java", "Flow");
    }

}
