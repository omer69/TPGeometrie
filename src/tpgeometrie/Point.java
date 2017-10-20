/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpgeometrie;

/**
 *
 * @author csnd2349
 */
public class Point {
    private double x;
    private double y;
    private String nom;
    private int numero;

    public Point(double x, double y, String nom, int numero) {
        this.x = x;
        this.y = y;
        this.nom = nom;
        this.numero = numero;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + ", nom=" + nom + ", numero=" + numero + '}';
    }
    
    
    
    
    
    
}
