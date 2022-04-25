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
}
