package quiz4a;

// 2.1 
/*Manager สืบทอดจาก Employee (ใช้ extends Employee)Manager สืบทอดจาก Employee (ใช้ extends Employee)
     * 
     */
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2 
    /* Managere เป็น Subclass ของ Employee ใช้ Subper เพื่อเรียก Constructor ของ Employee
     * มีตัวแปรเพิ่มคือ departmetn และ bonus ใช้ this.department = department; และ this.bonus = bonus; เพื่อกำหนดค่าให้ตัวแปรของManager
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3 
    /* เมธอด displayDetails() ใช้สำหรับแสดงรายละเอียดของพนักงาน โดยสร้าง Array details ที่เก็บข้อมูล เช่น รหัสผ่าน ชื่อ เงินเดือน แผนก และโบนัส จากนั้นใช้ลูป for-each เพื่อพิมพ์ข้อมูลทั้งหมดออก
     * 
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4 
    //
    /*เมธอดนี้ใช้แสดงรายละเอียดของพนักงาน ถ้า condition เป็น"full"พิมพ์ข้อมูลทั้งหมด
     * ถ้สเป็นค่าอื่น พิมพ์เฉพาะ Employee ID และ name ใช้ string Array (details[]) เพื่อเก็บข้อมูล และใช้ loop เพื่อพิมพ์ข้อมูลออกมา ใช้ equalsIgnoreCase เพื่อเปรียบเทียบ string แบบไม่จำเป็นต้องตัวพิมพ์เล็กหรือใหญ่
     */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
