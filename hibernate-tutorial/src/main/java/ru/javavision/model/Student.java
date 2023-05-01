package ru.javavision.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Author : Pavel Ravvich.
 * Created : 26/11/2017.
 */
@Data
public class Student implements Serializable {

    private int id;

    private String name;

    private List<Teacher> teachers;

}
