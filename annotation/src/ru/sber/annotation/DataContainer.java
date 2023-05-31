package ru.sber.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class DataContainer {

    private String description;

    private int priority;

    private double time;

}
