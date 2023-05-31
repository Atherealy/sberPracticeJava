package ru.sber.annotation;

import lombok.NonNull;

@DayWeek(dayWeek = 2)
public class WithAnnotationClass extends BaseClass {
    @Plan(hours = 13, priority = -1, description = "Возвращает текст с аннотацией")
    @Plan(hours = 17)
    @Plan(hours = 23, priority = 1)
    public void setData(@NonNull String description) {

        this.container.setDescription(description);

    }
}
