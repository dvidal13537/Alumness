package com.company;

public class Alumne {

    private String nom;
    private int edat;
    private int identificador;
    private int [] notes;



    public Alumne(String nom, int edat, int identificador, int [] notes) {
        this.nom = nom;
        this.edat = edat;
        this.identificador = identificador;
        this.notes = notes;
    }

    public Alumne(){}

    public double mitjanaNotes() {
        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        return total / (double)notes.length;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public int getIdentificador() {
        return identificador;
    }

    public int[] getNotes() {
        return notes;
    }
}
