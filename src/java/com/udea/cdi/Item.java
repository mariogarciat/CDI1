/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.cdi;

/**
 *
 * @author estudiantelis
 */
public class Item {
    private int value;
    private int limit;

    public Item(int value, int limit) {
        this.value = value;
        this.limit = limit;
    }

    @Override
    public String toString() {
        if(this.getValue()>this.getLimit()){
            return super.toString() + String.format("[Valor = %d , Limite = %d]",value,limit);
        }else{
            return "Alerta items agotados valor actual = " + this.getValue() + " Limite = "+ this.getLimit();
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    
}
