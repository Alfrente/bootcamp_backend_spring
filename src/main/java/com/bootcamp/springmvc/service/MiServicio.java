package com.bootcamp.springmvc.service;

import org.springframework.stereotype.Service;

@Service("miServicio")
public class MiServicio implements IService{
    public String operacion(){
        return "Ejecutando algún proceso";
    }
}
