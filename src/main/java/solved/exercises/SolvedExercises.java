package solved.exercises;

import javax.swing.*;

public class SolvedExercises {
    public void ExerciseOneAndTwo() {
        var valueOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the first value: "));
        var valueTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the second value: "));

        if (valueOne > valueTwo) {
            JOptionPane.showMessageDialog(null,"The first value (" + valueOne + ") is greater than the second value (" + valueTwo + ").");
        } else if (valueOne < valueTwo) {
            JOptionPane.showMessageDialog(null,"The first value (" + valueOne + ") is less than the second value (" + valueTwo + ").");
        } else {
            JOptionPane.showMessageDialog(null,"The two values are the same.");
        } 
    }

    public void ExerciseThree() {
        var radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle: "));
        var area = Math.PI * Math.pow(radius, 2);
        area = (double) Math.round(area * 100) / 100;

        JOptionPane.showMessageDialog(null,"The area of the circle is: " + area);
    }

    public void ExerciseFour() {
        final double VAT = 0.21;
        var price = Double.parseDouble(JOptionPane.showInputDialog("Enter the price of the product: ")); 
        var priceWithVAT = price + (price * VAT);
    
        JOptionPane.showMessageDialog(null,"The price with VAT is: " + priceWithVAT);
    }

    public void ExerciseFive() {
        var num = 1;
        var pairs = new int[50];
        var counterP = 0;
        var odd = new int[50];
        var counterO = 0;

        while (num <= 100) {
            if (num % 2 == 0) {
                pairs[counterP] = num;
                counterP++;
            } else {
                odd[counterO] = num;
                counterO++;
            }
            num++;
        }

        System.out.println("Numbers pairs: ");
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i]);
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
    }

    public void ExerciseSix() {
        var pairs = new int[50];
        var counterP = 0;
        var odd = new int[50];
        var counterO = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pairs[counterP] = i;
                counterP++;
            } else {
                odd[counterO] = i;
                counterO++;
            }
        }

        System.out.println("Numbers pairs: ");
        for (int i = 0; i < pairs.length; i++) {
            System.out.println(pairs[i]);
        }

        System.out.println("Odd numbers: ");
        for (int i = 0; i < odd.length; i++) {
            System.out.println(odd[i]);
        }
    }
}
