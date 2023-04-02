import java.util.Scanner;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter your Salary"));
        System.out.println("NAME is " + name + " and  AGE is " + age + " and Earns " + salary);
    }
}