package ru.sber.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;

@Repeatable(Plans.class)
@Target(ElementType.METHOD)

public @interface Plan {
    int hours() default 0;
    int priority() default 0;
    String description() default "";
}
