/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi3;

import java.util.ArrayList;

/**
 *
 * @author Lilian
 */
public class teste {
    
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = DAO.listar();
        for (Cliente cliente: clientes) {
            System.out.println(cliente.getNome());
        }
    }
    
}
