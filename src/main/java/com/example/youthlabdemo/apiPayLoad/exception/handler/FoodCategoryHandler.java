package com.example.youthlabdemo.apiPayLoad.exception.handler;


import com.example.youthlabdemo.apiPayLoad.code.BaseErrorCode;
import com.example.youthlabdemo.apiPayLoad.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode code) {
        super(code);
    }
}
