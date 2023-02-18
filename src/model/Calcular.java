package model;

import java.util.Random;

public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {

        Random rand = new Random();
        
        this.operacao = rand.nextInt(4);
        this.dificuldade = dificuldade;

        switch(dificuldade){
            case 1: 
                this.valor1 = rand.nextInt(10);
                this.valor2 = rand.nextInt(10);
                break;
            case 2: 
                this.valor1 = rand.nextInt(100);
                this.valor2 = rand.nextInt(100);
                break;
            case 3: 
                this.valor1 = rand.nextInt(1000);
                this.valor2 = rand.nextInt(1000);
                break;
            case 4: 
                this.valor1 = rand.nextInt(10000);
                this.valor2 = rand.nextInt(10000);
                break;
            default: 
                System.out.println("Dificuldade Inválida!");
                break;
        }
    }

    public int getDificuldade() {
        return dificuldade;
    }
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public int getOperacao() {
        return operacao;
    }
    public int getResultado() {
        return resultado;
    }

    public boolean somar(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean acerto = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            acerto = true;
        }else{
            System.out.println("Resposta errada!");
            System.out.println(this.getValor1() +" + "+ this.getValor2()+ " = " + this.getResultado());
        }
        return acerto;
    }

    public boolean subtrair(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean acerto = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            acerto = true;
        }else{
            System.out.println("Resposta errada!");
            System.out.println(this.getValor1() +" - "+ this.getValor2()+ " = " + this.getResultado());
        }
        return acerto;
    }

    public boolean multiplicar(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean acerto = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            acerto = true;
        }else{
            System.out.println("Resposta errada!");
            System.out.println(this.getValor1() +" * "+ this.getValor2()+ " = " + this.getResultado());
        }
        return acerto;
    }

    public boolean dividir(int resposta){
        this.resultado = this.getValor1() / this.getValor2();
        boolean acerto = false;

        if(resposta == this.getResultado()){
            System.out.println("Resposta correta!");
            acerto = true;
        }else{
            System.out.println("Resposta errada!");
            System.out.println(this.getValor1() +" / "+ this.getValor2()+ " = " + this.getResultado());
        }
        return acerto;
    }

    public String toString(){
        String op;

        switch(this.getOperacao()){
            case 0:
                op = "Somar";
                break;
            case 1:
                op = "Subtrair";
                break;
            case 2:
                op = "Multiplicar";
                break;
            case 3:
                op = "Dividir";
                break;
            default:
                op = "Operação Desconhecida!";
                break;
        }
        return "Dificuldade: "+ this.getDificuldade() +"\nValor 1: "+ this.getValor1() + "\nValor 2: " + this.getValor2() + "\nOperação: "+ op;
    }
}
