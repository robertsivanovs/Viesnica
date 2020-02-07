package Classes;

/**
 *
 * @author RR
 */
public class Client extends User {
    
    private String personalCode;
    private Date birthday;
    private String country;
    private String documentCode;
    private String phone;

    public Client(int id, String name, String surename) {
        super(id, name, surename);
    }
    
    public Client(String personalCode, Date birthday, String country, String documentCode, String phone, int id, String name, String surename) {
        super(id, name, surename);
        this.personalCode = personalCode;
        this.birthday = birthday;
        this.country = country;
        this.documentCode = documentCode;
        this.phone = phone;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString()+ ", personalCode=" + personalCode + ", birthday=" + birthday + ", country=" + country + ", documentCode=" + documentCode + ", phone=" + phone + '}';
    }
}
