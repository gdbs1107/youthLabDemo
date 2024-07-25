package com.example.youthlabdemo.apiPayLoad.exception.handler;


import com.example.youthlabdemo.apiPayLoad.code.BaseErrorCode;
import com.example.youthlabdemo.apiPayLoad.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode){
        super(errorCode);
    }
}
