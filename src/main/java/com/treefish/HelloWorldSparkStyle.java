/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treefish;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;


/**
 *
 * @author Treefish
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args){
        Spark.get("/", new Route(){
            @Override
            public Object handle(final Request req, final Response res) {
              return  "Hello World from spark! Reload on Save!!!";
            }         
        });
    }
}  

