package Classes;

/**
 *
 * @author RR
 */
public abstract class User {
    private int id;
    private String name;
    private String surename;

    public User(int id, String name, String surename) {
        this.id = id;
        this.name = name;
        this.surename = surename;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", surename=" + surename + '}';
    }
    
}
