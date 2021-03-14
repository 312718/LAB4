package com.company.Exceptions;

import java.io.IOException;

public class waitException extends InterruptedException {

    public waitException(String name){
        super(name + " устал ждать и поломал код)))");
    }

}
