package org.example;

import org.example.abstractFactory.*;
import org.example.adapter.FahrenheitTemperature;
import org.example.adapter.TemperatureAdapter;
import org.example.bridge.*;
import org.example.builder.NFBuilder;
import org.example.builder.NutritionFacts;
import org.example.singleton.Singleton;

public class Main {
    public static void main(String[] args) {

        // Abstract factory pattern
        {
            GUIFactory factory = GUIFactory.factory(OSType.Windows);
            GUIButton btn = factory.newButton();
            btn.click();
        }

        {
            GUIFactory factory = GUIFactory.factory(OSType.OSX);
            GUIButton btn = factory.newButton();
            btn.click();
        }


        /*
        NestedClass nc = new NestedClass();
        NestedClass.SubClass ns = nc.new SubClass();
        ns.testAccess();
         */


        // Singleton pattern
        Singleton s = Singleton.instance();
        s.printMe();

//        Singleton s = Singleton.INSTANCE;
//        int age = s.age();
//        System.out.println("age is " + age);
//        s.printMe();

        // Builder pattern
        NutritionFacts facts = new NFBuilder(100).carbs(34).proteins(33).fat(33).fact();
        facts.printMe();


        // Adapter design pattern
        FahrenheitTemperature f = new FahrenheitTemperature();
        TemperatureAdapter adapter = new TemperatureAdapter(f);

        adapter.setUnit("C");
        adapter.temperature();


        // Bridge pattern

        UnixSystem unixSystem = new UnixSystem();
        JVMSystem jvmSystem = new JVMSystem();
        OSXSystem osxSystem = new OSXSystem();

        PreemptiveScheduler unixSystemPreemptive = new PreemptiveScheduler(unixSystem);
        PreemptiveScheduler jvmSystemPreemptive = new PreemptiveScheduler(jvmSystem);
        PreemptiveScheduler osxSystemPreemptive = new PreemptiveScheduler(osxSystem);

        CooperativeScheduler unixSystemCooperative = new CooperativeScheduler(unixSystem);
        CooperativeScheduler jvmSystemCooperative = new CooperativeScheduler(jvmSystem);
        CooperativeScheduler osxSystemmCooperative = new CooperativeScheduler(osxSystem);

        RoundrobinScheduler unixSystemRoundrobin = new RoundrobinScheduler(unixSystem);
        RoundrobinScheduler jvmSystemRoundrobin = new RoundrobinScheduler(jvmSystem);
        RoundrobinScheduler osxSystemRoundrobin = new RoundrobinScheduler(osxSystem);


        Task task = new Task(1);
        unixSystemPreemptive.run(task);
        jvmSystemPreemptive.run(task);
        osxSystemPreemptive.run(task);

        unixSystemCooperative.run(task);
        jvmSystemCooperative.run(task);
        osxSystemmCooperative.run(task);

        unixSystemRoundrobin.run(task);
        jvmSystemRoundrobin.run(task);
        osxSystemRoundrobin.run(task);







    }
}