/*
MotorPH Payroll System
Team Repository: MotorPH-Payroll-G32

IMPORTANT:
Each member ONLY edits the method assigned to them.
=====================================================================
>>>Paki code na lang yung bawat parts natin sa ilalim guys, nilagyan ko
na ng pangalan base sa naka assign per member, thanks!<<<
=====================================================================
*/

public class MotorPHPayroll {
    
    //wag aalisin guys, ito na gamitin nating VARIABLES
    static double totalRegularHours;
    static double overtimeHours;
    static double lateHours;
    static double absenceHours;

    static double hourlyRate;
    static double grossWage;
    static double netWage;
    public static void main(String[] args) {
    // ===============================
    // TEST DATA (temporary values pwede palitan for testing)
    // ===============================
    totalRegularHours = 160;
    overtimeHours = 10;
    hourlyRate = 100;

    // run the payroll computation
    calculateGrossWage();

    // show result
    displayPayroll();
        
    }

    // ============================================
    // Assigned: Ehric Jason Esmores
    // Task: Employee Information Overview
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void loadEmployees() {

        // >>> WRITE YOUR CODE HERE <<<
        
        
    }

    // ============================================
    // Assigned: Daisy Rose Sabuero
    // Task: Read Attendance Records
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void loadAttendance() {

        // >>> WRITE YOUR CODE HERE <<<
        
        
    }

    // ============================================
    // Assigned: Daisy Rose Sabuero
    // Task: Compute Employee Working Hours
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void computeHours() {

        // >>> WRITE YOUR CODE HERE <<<
        
        
    }

    // ============================================
    // Assigned: Elefes Ramones Capulong
    // Task: Calculate Employee Gross Wage
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void calculateGrossWage() {

        // calculate pay for regular working hours
        double regularPay = totalRegularHours * hourlyRate;

        // calculate pay for overtime hours (1.25 overtime rate)
        double overtimePay = overtimeHours * hourlyRate * 1.25;

        // add regular pay and overtime pay to get gross wage
        grossWage = regularPay + overtimePay;
        
        
    }

    // ============================================
    // Assigned: Crysquei Aiko Abella
    // Task: Calculate Employee Net Wage
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void calculateNetSalary() {

        // >>> WRITE YOUR CODE HERE <<<
        
        
    }

    // ============================================
    // Assigned: Ehric Jason Esmores
    // Task: Display Payroll Summary
    // PLACE YOUR CODE BELOW
    // ============================================
    public static void displayPayroll() {
        // Lagyan lang ng "//" sa umpisa ng line para gawing comment for testing
        System.out.println("----- Payroll Summary -----");
        System.out.println("Regular Hours: " + totalRegularHours);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Gross Wage: " + grossWage);
    }
}