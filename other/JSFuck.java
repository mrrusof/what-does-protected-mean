package other;

import main.*;
import backend.*;
import frontend.*;

public class JSFuck extends Javascript {

    public void accessProtectedMethods() {
        String className = this.getClass().getSimpleName();

        // protected method m declared in Java

        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // new Java().m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // new Groovy().m(className, "Groovy");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new Groovy()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // new Javascript().m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new Javascript()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // new AsmJs().m(className, "AsmJs");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new AsmJs()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new AsmJs()).m(className, "Java");
        new JSFuck().m(className, "JSFuck");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new JSFuck()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new JSFuck()).m(className, "Java");

        // protected method m declared in TypeScript

        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new TypeScript().m(className, "TypeScript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new TypeScript()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new TypeScript()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new AtScript().m(className, "AtScript");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new AtScript()).m(className, "TypeScript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new AtScript()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new AtScript()).m(className, "Java");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // new Dart().m(className, "Dart");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new Dart()).m(className, "TypeScript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new Dart()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new Dart()).m(className, "Java");

        // protected method m declared in Flow

        new Flow().m(className, "Flow");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((Dart) new Flow()).m(className, "Dart");
        // *** Compile error for following line: `m(String,String) has protected access in TypeScript`
        // ((TypeScript) new Flow()).m(className, "TypeScript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Javascript) new Flow()).m(className, "Javascript");
        // *** Compile error for following line: `m(String,String) has protected access in Java`
        // ((Java) new Flow()).m(className, "Java");
    }

    public void accessProtectedFields() {
        String className = this.getClass().getSimpleName();

        // protected field f declared in Java

        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, new Java().f, "Java", "Java");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, new Groovy().f, "Groovy", "Groovy");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new Groovy()).f, "Java", "Groovy");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, new Javascript().f, "Javascript", "Javascript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new Javascript()).f, "Java", "Javascript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, new AsmJs().f, "AsmJs", "AsmJs");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new AsmJs()).f, "Javascript", "AsmJs");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new AsmJs()).f, "Java", "AsmJs");
        Main.printFieldAccess(className, new JSFuck().f, "JSFuck", "JSFuck");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new JSFuck()).f, "Javascript", "JSFuck");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new JSFuck()).f, "Java", "JSFuck");

        // protected field f declared in TypeScript

        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new TypeScript().f, "TypeScript", "TypeScript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new TypeScript()).f, "Javascript", "TypeScript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new TypeScript()).f, "Java", "TypeScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new AtScript().f, "AtScript", "AtScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new AtScript()).f, "TypeScript", "AtScript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new AtScript()).f, "Javascript", "AtScript");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new AtScript()).f, "Java", "AtScript");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, new Dart().f, "Dart", "Dart");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new Dart()).f, "TypeScript", "Dart");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new Dart()).f, "Javascript", "Dart");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new Dart()).f, "Java", "Dart");

        // protected field f declared in Flow

        // *** Compile error for following line: `f has protected access in Flow`
        // Main.printFieldAccess(className, new Flow().f, "Flow", "Flow");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((Dart) new Flow()).f, "Dart", "Flow");
        // *** Compile error for following line: `f has protected access in TypeScript`
        // Main.printFieldAccess(className, ((TypeScript) new Flow()).f, "TypeScript", "Flow");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Javascript) new Flow()).f, "Javascript", "Flow");
        // *** Compile error for following line: `f has protected access in Java`
        // Main.printFieldAccess(className, ((Java) new Flow()).f, "Java", "Flow");
    }

}
