package com.company.Exceptions;

public class ExceptionDay extends ArrayIndexOutOfBoundsException{

    public ExceptionDay(int index){// в джаве мы можем сами создать ошибки. Тут я создаю ошибку сам)) И в случае если такого дня не существует, то он ее выдаст
        super("дня с номером " + index + " не существует");
        System.out.println("дня с номером " + index + " не существует");

    }
}
