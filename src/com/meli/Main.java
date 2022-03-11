package com.meli;

public class Main {

    public static void main(String[] args) {
	    Pessoa pessoa1 = new Pessoa();
	    Pessoa pessoa2 = new Pessoa("Mark", 22, "231231");
	    Pessoa pessoa3 = new Pessoa(25, 73.2F, 1.75F, "Peter", "5342343");

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa3.getNome());
    }
}
