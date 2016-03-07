package com.mkyoung.common;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by 79Paton on 05/03/2016.
 */

@ManagedBean
@ApplicationScoped
public class UpdateMap implements Serializable {

    private int number;

    public int getNumber() {
        return number;
    }

    public void increment() {
        number++;
    }
}

