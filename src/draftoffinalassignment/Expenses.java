/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package draftoffinalassignment;

import java.text.SimpleDateFormat;

/**
 *
 * @author shann
 */
public class Expenses {
   private double totalExpenses;
   private double addedExpenses; 
   //delete should be a method 

   public Expenses(double totalExpenses, double addedExpenses, String expenseCategory, String timeOfPurchase) {
      this.totalExpenses = totalExpenses;
      this.addedExpenses = addedExpenses;
      this.expenseCategory = expenseCategory;
      this.timeOfPurchase = timeOfPurchase;
   }
   
   private String expenseCategory; 
   private String timeOfPurchase; 

   public double getTotalExpenses() {
      return totalExpenses;
   }

   public void setTotalExpenses(double totalExpenses) {
      this.totalExpenses = totalExpenses;
   }

   public double getAddedExpenses() {
      return addedExpenses;
   }

   public void setAddedExpenses(double addedExpenses) {
      this.addedExpenses = addedExpenses;
   }

   public String getExpenseCategory() {
      return expenseCategory;
   }

   public void setExpenseCategory(String expenseCategory) {
      this.expenseCategory = expenseCategory;
   }

   public SimpleDateFormat getTimeOfPurchase() {
      return timeOfPurchase;
   }

   public void setTimeOfPurchase(SimpleDateFormat timeOfPurchase) {
      this.timeOfPurchase = timeOfPurchase;
   }
   
}
