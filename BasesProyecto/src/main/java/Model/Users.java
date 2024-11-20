
package Model;

import java.sql.Date;

/**
 *
 * @author wendy_6rrub
 */
public class Users {
    
    int id;
    String nameUser;
    String lastname1;
    String lastname2;
    String role;
    String username;
    String tel1;
    String tel2;
    String email;
    String pass;
    String province;
    String canton;
    String district;
    String gender;
    Date birthdate;
    int age;
    

    public Users() {
    }

    public Users(int id, String nameUser, String lastname1, String lastname2, String role, String username, String tel1, String tel2, String email, String pass, String province, String canton, String district, String gender, Date birthdate, int age) {
        this.id = id;
        this.nameUser = nameUser;
        this.lastname1 = lastname1;
        this.lastname2 = lastname2;
        this.role = role;
        this.username = username;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.email = email;
        this.pass = pass;
        this.province = province;
        this.canton = canton;
        this.district = district;
        this.gender = gender;
        this.birthdate = birthdate;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastname1() {
        return lastname1;
    }

    public void setLastname1(String lastname1) {
        this.lastname1 = lastname1;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}