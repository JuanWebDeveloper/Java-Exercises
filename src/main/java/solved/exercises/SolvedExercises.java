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
}
