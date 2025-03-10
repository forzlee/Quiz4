package quiz4a;


// (1.1) เขียน Java Docs
/*
 * 
 */
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

     // (1.2)
     /*สร้างobjectของคลาส Employee กำหนดค่า employeeId, name, และ salary ผ่าน constructor หาก salary น้อยกว่าหรือเท่ากับ 0 ก็จะตั้งค่าให้เป็น 0 แทน
      * 
      */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    /*เมธอด calculateSalary() จะคืนค่าเงินเดือนที่ถูกกำหนดให้ตัวแปร salary เมื่อมีการสร้าง object ของ Employee
     * 
     */
    public double calculateSalary() {
        return salary;
    }

    // (1.4) 
    /* เมธอดสำหรับแสดงข้อมูลลงพนักงงานและรับค่าออก
     * 
     */
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5) 
     /* GetterและSetterสำหรับการเข้าถึงข้อมูลและรับข้อมูลออกกลับเป็นชื่อ
     * 
     */
    
    public String getName() {
        return name;
    }
}