package ru.sber.Reflection;

import lombok.NonNull;
import ru.sber.annotation.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Reflection {

    private Reflection() {
    }

    private static final List<Class<? extends BaseClass>> reflectionChoices = List.of(
            NoAnnotationClass.class,
            WithAnnotationClass.class
    );

    private static Class<? extends BaseClass> findClassByAnnotation(int dayOfTheWeek) {
        for (Class<? extends BaseClass> clas : reflectionChoices) {
            if (clas.getAnnotation(DayWeek.class).dayWeek() == dayOfTheWeek) {
                return clas;
            }
        }

        return null;
    }


    public static BaseClass construct(int dayWeek, String description) throws Exception {
        Class<? extends BaseClass> clasMetadata = findClassByAnnotation(dayWeek);

        Objects.requireNonNull(clasMetadata);

        BaseClass instance = clasMetadata.getConstructor().newInstance();
        Method setter = clasMetadata.getMethod("setData", String.class);
        setter.invoke(instance, description);

        return instance;
    }

    public static void applyChanges(@NonNull BaseClass instance) throws Exception {
        Method setter = instance.getClass().getMethod("setData", String.class);
        Plan[] Plans = setter.getAnnotationsByType(Plan.class);

        Arrays.sort(Plans, Comparator.comparingInt(Plan::priority));

        for (Plan schedule : Plans) {
            setter.invoke(instance, schedule.description());
        }
    }

    public static DataContainer extract(@NonNull BaseClass instance) throws Exception {
        Field containerField = BaseClass.class.getDeclaredField("container");

        containerField.setAccessible(true);
        return (DataContainer) containerField.get(instance);
    }
}
