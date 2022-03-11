package com.meli;

import java.lang.Math;

public class Pessoa {
    private String nome;
    private int idade;
    private String ID;
    private float peso;
    private float altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String ID) {
        this.nome = nome;
        this.idade = idade;
        this.ID = ID;
    }

    public Pessoa(int idade, float peso, float altura, String... args) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;

        this.nome = args[0];
        this.ID = args[1];
    }

    private int calcularIMC() {
        double IMC = peso/Math.pow(altura, 2);
        if (IMC >= 20.0 && IMC <= 25)
            return 0;

        return IMC < 20 ? -1 : 1;
    }

    public String classificacaoIMC() {
        switch (calcularIMC()){
            case 0:
                return "Peso Saudável";
            case 1:
                return "Sobrepeso";
            case -1:
                return "Abaixo do peso";
            default:
                return "Error";
        }
    }

    public boolean ehMaiorIdade() {
        return idade >= 18;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", ID='" + ID + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
