package Programa;

public class Pessoa {

    public static int counter = 1;
    private String name;
    private String cpf;
    private String email;

    public Pessoa (String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        counter += 1;
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

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(String name, String cpf, String email) {
        return "\nName: " + getName() +
                "\nCPF: " + getCpf() +
                "\nEmail: " + getEmail();
    }

}
