package Classes;

/**
 *
 * @author RR
 */
public class Admin extends User{
    private String role;

    public Admin(int id, String name, String surename) {
        super(id, name, surename);
    }
    
    public Admin(String role, int id, String name, String surename) {
        super(id, name, surename);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + " role=" + role + '}';
    }
    
    
    
}
