/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author aschwartz
 */
import java.util.ArrayList;
public class numbers {
   private int number1 = 50;
   private int number2 = 100;
   private ArrayList<Integer> list;

   public numbers() {
       list = new ArrayList<Integer>();
       list.add(number1);
       list.add(number2);
   }

   public ArrayList<Integer> getList() {
       return list;
   }
}
