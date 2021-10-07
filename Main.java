/*
* Unit2-Assignmet.java
* This calculates and displays the percent of the time taken in each task.
* Jumana Amr
* 27-9-2021
* ICS3U
*/
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
  public static void main(String[] args) {
    double design;
    double code;
    double testing;
    double debugging;
    double sum = 0;
    double percentd;
    double percentc;
    double percentt;
    double percentde;
    double hour;
    double percentday;
    NumberFormat percent = NumberFormat.getPercentInstance();
    percent.setMinimumFractionDigits(2);
    Scanner input = new Scanner(System.in);
    System.out.print("Design: ");
    design = input.nextDouble();
    System.out.print("Code: ");
    code = input.nextDouble();
    System.out.print("Testing: ");
    testing = input.nextDouble();
    System.out.print("Debugging: ");
    debugging = input.nextDouble();
    System.out.println("Time taken for each task in %");
    sum += design+code+testing+debugging;
    percentd = design/sum;
    percentc = code/sum;
    percentt = testing/sum;
    percentde = debugging/sum;
    System.out.format("%-10s %20s","Designing",(percent.format(percentd))+("\n"));
    System.out.format("%-10s %20s","Code",(percent.format(percentc))+("\n"));
    System.out.format("%-10s %20s","Testing",(percent.format(percentt))+("\n"));
    System.out.format("%-10s %20s","Debugging",(percent.format(percentde))+("\n"));
    hour = sum/60;
    percentday = hour/24;
    System.out.println("You have spent: "+(percent.format(percentday))+(" % of the day"));
  }
}