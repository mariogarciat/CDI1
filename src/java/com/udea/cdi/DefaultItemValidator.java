/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.cdi;

import javax.enterprise.inject.Alternative;

/**
 *
 * @author estudiantelis
 */
@Alternative
public class DefaultItemValidator implements ItemValidator{

    @Override
    public boolean isValid(Item item) {
        return item.getValue() < item.getLimit();
    }
    
}
