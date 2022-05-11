package com.zhuravel.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Engine implements Serializable {

    private int id;
    private String model;
    private int power;
}
