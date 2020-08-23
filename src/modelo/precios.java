/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class precios {
    
    private double motoxhora;
    private double autoxhora;

    public precios(double motoxhora, double autoxhora) {
        this.motoxhora = motoxhora;
        this.autoxhora = autoxhora;
    }

    public precios() {
         this.motoxhora = 120;
        this.autoxhora=150;
    }
    

    public double getMotoxhora() {
        return motoxhora;
    }

    public void setMotoxhora(double motoxhora) {
        this.motoxhora = motoxhora;
    }

    public double getAutoxhora() {
        return autoxhora;
    }

    public void setAutoxhora(double autoxhora) {
        this.autoxhora = autoxhora;
    }
    
    
    
}
