/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.restapp;

/**
 *
 * @author prod
 */
public class RestMain {

    public static int number = 0;
    public static int total = 0;
    public static int output = 0;
    public static void main(String[] args) {
        output = Logic(20);
        System.out.println(output);
    }

    public static int Logic(int number) {
        total = number + 10;
        return total;
    }
}
