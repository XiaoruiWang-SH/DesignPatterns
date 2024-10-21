package org.example;

import org.example.abstractFactory.*;
import org.example.adapter.FahrenheitTemperature;
import org.example.adapter.TemperatureAdapter;
import org.example.bridge.*;
import org.example.builder.NFBuilder;
import org.example.builder.NutritionFacts;
import org.example.command.CommandManager;
import org.example.command.Document;
import org.example.command.LineDeletion;
import org.example.command.LineInsertion;
import org.example.composite.Button;
import org.example.composite.Pane;
import org.example.composite.Textfield;
import org.example.composite.Window;
import org.example.singleton.Singleton;
import org.example.strategy.*;

import java.net.CookieManager;

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


        // Composite pattern
        Button btn = new Button();
        Textfield textfield = new Textfield();

        Pane pane = new Pane();
        pane.add(btn);
        pane.add(textfield);

        Button button2 = new Button();

        Window window = new Window();
        window.add(pane);
        window.add(button2);
        window.resize();
        window.draw();

        // Command
        Document document = new Document();
        CommandManager commandManager = new CommandManager();
        LineInsertion lineInsertion1 = new LineInsertion(document, 1, "Hello");
        commandManager.execute(lineInsertion1);
        LineInsertion lineInsertion2 = new LineInsertion(document, 2, "Ray");
        commandManager.execute(lineInsertion2);
        LineDeletion lineDeletion2 = new LineDeletion(document, 2);
        commandManager.execute(lineDeletion2);
        commandManager.undo();

        // Observer
        org.example.observer.Button btn1 = new org.example.observer.Button();
        org.example.observer.Window window1 = new org.example.observer.Window();
        btn1.register(window1);
        btn1.onClick();

        // Strategy
        Check table3 = new Check(new LunchPricer());
        table3.charge(new Steak(10));
        table3.charge(new Wine(15));
        double table3_lunchPrice = table3.total();
        System.out.println(String.format("table3's lunch price is %f", table3_lunchPrice));

        table3.use(new DinnerPricer());
        table3.charge(new Wine(15));
        double table3_dinnerPrice = table3.total();
        System.out.println(String.format("table3's dinner price is %f", table3_dinnerPrice));





    }
}