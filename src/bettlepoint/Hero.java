/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettlepoint;

/**
 *
 * @author Kuro
 */


public class Hero {
    
    //definisi atribut
    String name;
    int damage;
    
    String nameMonster;
    int healtPoint;
    
    int sisaHP;
    
    //definisi method attack monster
    void doAttack(){
        System.out.println(name + "is Attack Monster : " + nameMonster);
        System.out.println("Attack Point :" + damage);
        System.out.println(nameMonster +" dengan HP :" + healtPoint);
        System.out.println("-----------------------------------");
        sisaHP = healtPoint - damage;
        System.out.println("Sisa HP Monster :" +sisaHP);
    }
    
    // definisi method apabila healtpoint monster 0
    boolean monsterDead(){
        if(sisaHP <= 0) return true;
        return false;
    }
    
    
}
