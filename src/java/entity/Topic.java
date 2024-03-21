/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class Topic {
    private int topID;
    private String topName;

    public Topic() {
    }

    public Topic(int topID, String topName) {
        this.topID = topID;
        this.topName = topName;
    }

    public int getTopID() {
        return topID;
    }

    public void setTopID(int topID) {
        this.topID = topID;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    @Override
    public String toString() {
        return "Topic{" + "topID=" + topID + ", topName=" + topName + '}';
    }
    
}
