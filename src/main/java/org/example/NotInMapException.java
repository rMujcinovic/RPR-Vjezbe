package org.example;

public class NotInMapException extends Exception{

    private String message;
    public NotInMapException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

}
