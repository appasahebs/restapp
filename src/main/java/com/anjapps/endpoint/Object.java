/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anjapps.endpoint;

/**
 *
 * @author appsawan
 */
public class Object {
    public final int id;
    public final String title;
    public final String link;
    public final String desc;

    public Object(int id, String title,String link, String desc){
        this.id=id;
        this.title =title;
        this.link=link;
        this.desc=desc;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public String getLink(){
        return this.link;
    }

    public String getDec(){
        return this.desc;
    }
}
