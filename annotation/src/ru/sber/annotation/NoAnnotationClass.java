package ru.sber.annotation;

import lombok.NonNull;

public class NoAnnotationClass extends BaseClass {
    @Plan(hours = 9, priority = -1, description = "Возвращает текст c аннотацией")
    @Plan(hours = 13)
    @Plan(hours = 21, priority = 1)
    public void setData(@NonNull String description) {

        this.container.setDescription(description);

    }
}