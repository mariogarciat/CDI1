/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.cdi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiantelis
 */
public class DefaultItemDao implements ItemDAO{

    @Override
    public List<Item> fetchItems() {
        List<Item> results = new ArrayList<Item>();
        results.add(new Item(12,4));
        results.add(new Item(16,36));
        results.add(new Item(42,52));
        results.add(new Item(37,24));
        results.add(new Item(2,14));
        results.add(new Item(5,41));
        return results;
    }
    
}
