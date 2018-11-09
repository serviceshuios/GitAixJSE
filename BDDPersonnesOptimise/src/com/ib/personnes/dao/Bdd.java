/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ib.personnes.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adminl
 */
public class Bdd {
    //pilote:type de Driver==>aller ds propriete de connection ds Service
   private static final String pilote = "com.mysql.jdbc.Driver";
   //le nom du Driver==>reprendre nom ds propriete de connection ds Service
    private static final String url = "http://localhost:3306/personnes/";
    //login et password du Database User
    private static final String utilisateur = "root";
    private static final String password = "";

    public static Connection seConnecter() {
        Connection cnx = null;
        try {
            Class.forName(pilote);
            cnx = DriverManager.getConnection(url, utilisateur, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }

    public static void seDeconnecter(Connection cnx) {

        try {
            cnx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Bdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
