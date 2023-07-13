package com.bootcamp.springmvc.service;

import org.springframework.stereotype.Service;

@Service("miServioCompleto")
public class MiServioCompleto implements  IService{
    @Override
    public String operacion() {
        return "Ejecutando tarea desde mi servicio completo";
    }
}
