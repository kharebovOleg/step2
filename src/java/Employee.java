package src.java;

public class Employee {
    private String post;
    private String name;
    private String sirname;
    private String email;


    public Employee(String post, String name, String sirname, String email) {
        this.post = post;
        this.name = name;
        this.sirname = sirname;
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSirname() {
        return sirname;
    }

    public void setSirname(String sirname) {
        this.sirname = sirname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "должность='" + post + '\'' +
                ", имя='" + name + '\'' +
                ", фамилия='" + sirname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
