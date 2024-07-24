package com.example.youthlabdemo.apiPayLoad.exception.handler;

import com.example.study.apiPayload.code.BaseErrorCode;
import com.example.study.apiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode code) {
        super(code);
    }
}
