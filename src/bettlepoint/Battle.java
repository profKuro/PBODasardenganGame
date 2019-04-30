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
public class Battle {
     public static void main (String[] args){
         
         //membuat objek hero
         Hero hero = new Hero();
         

         //mengisi attribut hero
         hero.name = "Hayabusa";
         hero.damage = 190;
         
         //mengisi attribut Monster
         hero.nameMonster = "Lord";
         hero.healtPoint = 100;

         //menjalankan method
         hero.doAttack();
         
         
         if(hero.monsterDead()){
             System.out.println("Monster Dimusnahkan!!!");
         }


     }
    
     
     
     
}
