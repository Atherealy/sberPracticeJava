package ru.sber.Reflection;
import ru.sber.annotation.*;



public class Demo {
    public static void main(String[] args) throws Exception{
        BaseClass Class = Reflection.construct(2, "");
        System.err.println(Class);

        DataContainer container = Reflection.extract(Class);
        container.getPriority();
        container.getDescription();

        Reflection.applyChanges(Class);

        container = Reflection.extract(Class);
        container.getPriority();
        container.setDescription("С обычной аннотацией");
    }
    }