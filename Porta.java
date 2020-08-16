/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Bissoto
 */
public class Porta {

    private String cor;
    private boolean aberta = false;
    private double altura;
    private double largura;
    double altera;

    public void pintar(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public boolean isAberta() {
        return aberta;
    }
        void abre(){
        this.aberta = true ;
    }
    void fecha(){
        this.aberta = false;
    }
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
 public double getAlerta() {
        return altera;
    }

    public void setAltera(double altera) {
        this.altera = altera;
    }
     public void altera(double valor){
        this.altura += valor;
        this.largura += valor;
    }
}
