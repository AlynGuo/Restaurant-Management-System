/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oorestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class SupahClassss {
    
    //Lists of meals
    public double ChickenWings;
    public double MushroomSoup;
    public double MeatBalls;
    public double LimeChicken;
    public double MegaBurger;
    
    //Lists of Drinkssss
    public double MilkShake;
    public double Smoothie;
    public double MangoShake;
    public double MilkTea;
    public double StrawberryJuice;
    
    public double Meals;
    public double Drinks;
    public double TotalOfMealsDrinks;
    
    public double AllTotalCost;
    
    public double getAmount(){
        Meals = ChickenWings + MushroomSoup + MeatBalls + LimeChicken + MegaBurger;
        Drinks = MilkShake + Smoothie + MangoShake + MilkTea + StrawberryJuice;
        TotalOfMealsDrinks = Meals + Drinks;
        AllTotalCost = TotalOfMealsDrinks;
        
        return AllTotalCost;
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management Systems", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //***********************************PRESYOOOOOO**************************************************//
    
     //Lists of meals
    public double price_ChickenWings = 30.00;
    public double price_MushroomSoup = 25.00;
    public double price_MeatBalls = 30.25;
    public double price_LimeChicken = 50.05;
    public double price_MegaBurger = 60.25;
    
    //Lists of Drinkssss
    public double price_MilkShake = 40.50;
    public double price_Smoothie = 45.20;
    public double price_MangoShake = 60.50;
    public double price_MilkTea = 40.00;
    public double price_StrawberryJuice = 65.25;
    
    //******************************************DAGDAG******************************************************//
    
    public double SanTaxMo = 00.75;
    
    public double getTax(double Amount){
        double taxHoy = Amount - (Amount * SanTaxMo);
        return taxHoy;
    }
    
    //*******************************************************************************************************//
}
