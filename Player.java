/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
/**
 *
 * @author me
 */
public class Player {
    public string name;
    public int id;

    public Player(string name, int id) {
        this.name = name;
        this.id =id;

    }
 

    public string getName()
{return name;
}
public void setName(string newname)
{this.name=newname;
}
    public string getId()
{return Id;
}
public void setId(string newId)
{this.Id=newId;
}

}
