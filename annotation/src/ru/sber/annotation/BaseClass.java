package ru.sber.annotation;

@DayWeek(dayWeek = 1)

public abstract class BaseClass {
    protected DataContainer container;
    public abstract void setData(String description);
}
