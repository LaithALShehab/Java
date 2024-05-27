/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.store;

/**
 *
 * @author USER
 */
public class Sale {
    int idCustomer,idItem,Quan;
    String nameItem;

    public Sale(int idCustomer, int idItem, int Quan, String nameItem) {
        this.idCustomer = idCustomer;
        this.idItem = idItem;
        this.Quan = Quan;
        this.nameItem = nameItem;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuan() {
        return Quan;
    }

    public void setQuan(int Quan) {
        this.Quan = Quan;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }
    
    
}
