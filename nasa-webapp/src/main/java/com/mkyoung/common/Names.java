package com.mkyoung.common;

import java.io.Serializable;

/**
 * Created by 79Paton on 27/03/2016.
 *
 */

public class Names implements Serializable {

    private static final long serialVersionUID = 20111020L;
    private String names;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
