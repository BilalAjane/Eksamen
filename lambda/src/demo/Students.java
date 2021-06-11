package demo;

public class Students {

    String name;
    String email;
    String group;
    public Students(String line) {
        String[] split = line.split(",");
        name = split[0];
        email = split[1];
        group = split[2];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
