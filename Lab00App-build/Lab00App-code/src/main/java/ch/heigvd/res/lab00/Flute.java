/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author Karim
 */
public class Flute implements IInstrument{

    private String color;
    private int soundVolume;
    
    @Override
    public String play() {
        return "tut";
    }

    @Override
    public int getSoundVolume() {
        return 10;
    }

    @Override
    public String getColor() {
        return "brown";
    }
    
}
