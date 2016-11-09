/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.cdi;

import java.util.List;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author estudiantelis
 */
@Named
@RequestScoped
public class ItemProcessor {
    @Inject private ItemDAO itemdao;
    @Inject private ItemValidator itemValidator;
    
    public void execute(){
        List<Item> items = itemdao.fetchItems();
        for(Item item : items){
            System.out.println("Item= " + item + " valid=" + itemValidator.isValid(item));
        }
        /*List<Item> items = itemdao.fetchItems();
        items.forEach((item) -> {
            System.out.println("Item encontrado " + item);
        });*/
    }
}
