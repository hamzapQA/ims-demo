package com.qa.controller;

import java.util.List;

/**
 * Create, Read, Update and Delete controller.
 * This takes in inputs for each action to be sent to the service class
 */
public interface CrudController<T> {
    
    List<T> readAll();
     
    T create();
     
    T update();
     
    void delete();

}
