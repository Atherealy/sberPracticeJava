package ru.sber.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
public @interface DayWeek {
    int dayWeek() default 0;
}