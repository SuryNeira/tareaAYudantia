/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Pokemon {
    private int idPokemon;
    private String nombrePokemon;
    private Tipo_Pokemon tipoPokemon;
    private ArrayList<Habilidad> ataques;
    private int vida;
    private int nivel;

    public Pokemon(int idPokemon, String nombrePokemon, Tipo_Pokemon tipoPokemon, ArrayList<Habilidad> ataques, int vida, int nivel) {
        this.idPokemon = idPokemon;
        this.nombrePokemon = nombrePokemon;
        this.tipoPokemon = tipoPokemon;
        this.ataques = ataques;
        this.vida = vida;
        this.nivel = nivel;
    }

    public Pokemon() {
    }
    
    public int getIdPokemon() {
        return idPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public Tipo_Pokemon getTipoPokemon() {
        return tipoPokemon;
    }

    public ArrayList<Habilidad> getAtaques() {
        return ataques;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public void setTipoPokemon(Tipo_Pokemon tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public void setAtaques(ArrayList<Habilidad> ataques) {
        this.ataques = ataques;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    
}
