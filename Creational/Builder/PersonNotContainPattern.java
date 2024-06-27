public class PersonNotContainPattern {

    private String identityNumber;
    private String name;
    private String surname;
    private Integer age;
    private Integer gender;

    public PersonNotContainPattern() {

    }

    public PersonNotContainPattern(String identityNumber, String name, String surname, Integer age, Integer gender) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
    
}