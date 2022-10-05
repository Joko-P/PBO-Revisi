package PBO_4_Kelas_Inheritence;
public class Employee extends Person {
    private String department, title;

    public Employee(String id, String name, String address, String department, String title) {
        super(id, name, address);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
    
    public void getData() {
        System.out.println("\nID Karyawan : " + super.getId());
        System.out.println("Nama Karyawan : " + super.getName());
        System.out.println("Alamat : " + super.getAddress());
        System.out.println("Department : " + this.getDepartment());
        System.out.println("Job Title : " + this.getTitle());
    }
}
