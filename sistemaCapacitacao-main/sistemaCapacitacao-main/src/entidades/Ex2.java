package entidades;

public class Ex2 {
    private String name;
    private double grossSalary;
    private double tax;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
    public double netSalary(){
        return getGrossSalary() - getTax();
    }
    public void increaseSalary(double porcentagem){
        System.out.println("Dados atualizados: "+getName()+ (netSalary() + getGrossSalary()*(porcentagem/100)));

    }
}
