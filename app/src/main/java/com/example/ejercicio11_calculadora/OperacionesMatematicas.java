package com.example.ejercicio11_calculadora;

public class OperacionesMatematicas {

    private Double numero1;
    private  Double numero2;

    public OperacionesMatematicas(Double num1, Double num2){
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public Double getNum1() {
        return numero1;
    }

    public void setNum1(Double num1) {
        this.numero1 = num1;
    }

    public Double getNum2() {
        return numero2;
    }

    public void setNum2(Double num2) {
        this.numero2 = num2;
    }

    public Double sumar(){
        return this.numero1 + this.numero2;
    }

    public Double restar(){
        return this.numero1 - this.numero2;
    }

    public Double multiplicar(){
        return this.numero1 * this.numero2;
    }

    public Double dividir(){
        return this.numero1 / this.numero2;
    }
}
