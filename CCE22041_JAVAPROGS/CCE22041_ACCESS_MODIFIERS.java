// Abstract class with protected and final members
abstract class University {
    protected String universityName = "National University";  // protected
    final int establishedYear = 1950;                         // final

    public void showUniversityInfo() {
        System.out.println("University: " + universityName);
        System.out.println("Established in: " + establishedYear);
    }

    // Abstract method to be implemented by subclass
    abstract void showDepartmentInfo();
}

// Subclass demonstrating public, private, protected, and static
class Department extends University {
    public String departmentName;                   // public
    private int departmentCode;                     // private
    protected static int totalDepartments = 0;      // static & protected

    // Constructor
    public Department(String deptName, int deptCode) {
        this.departmentName = deptName;
        this.departmentCode = deptCode;
        totalDepartments++;  // static variable updated
    }

    // Overriding abstract method
    @Override
    void showDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
    }

    // Static method to show total departments
    public static void showTotalDepartments() {
        System.out.println("Total Departments: " + totalDepartments);
    }
}

// Main class with default (package-private) access
class UniversitySystem {
    public static void main(String[] args) {
        Department d1 = new Department("Computer Science", 101);
        Department d2 = new Department("Mechanical Engineering", 102);

        d1.showUniversityInfo();
        d1.showDepartmentInfo();

        System.out.println();

        d2.showUniversityInfo();
        d2.showDepartmentInfo();

        // Static method call
        Department.showTotalDepartments();
    }
}
