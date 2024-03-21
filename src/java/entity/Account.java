/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Account {
    private int uID;
    private String user, pass;
    private int isPost;
    private int isAdmin;
            
    public Account() {
    }

    public Account(int uID, String user, String pass, int isPost, int isAdmin) {
        this.uID = uID;
        this.user = user;
        this.pass = pass;
        this.isPost = isPost;
        this.isAdmin = isAdmin;
    }

    public int getuID() {
        return uID;
    }

    public void setuID(int uID) {
        this.uID = uID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getIsPost() {
        return isPost;
    }

    public void setIsPost(int isPost) {
        this.isPost = isPost;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "uID=" + uID + ", user=" + user + ", pass=" + pass + ", isPost=" + isPost + ", isAdmin=" + isAdmin + '}';
    }

    
    
    
    
}
