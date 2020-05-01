public class Car {

    private String marca;
    private int ano;
    private String matricula;
    private String modelo;
    private String cor;

    public Car(String marca, int ano, String matricula, String modelo, String cor) throws CarNotValidatedException{
        if(ano <= 0 || marca.equals("") || matricula.equals("") || modelo.equals("") || cor.equals(""))
            throw new CarNotValidatedException();
        this.marca = marca;
        this.ano = ano;
        this.matricula = matricula;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void novacor(String cor){
        this.cor=cor;
        System.out.println("Pareces novo!!");
    }
}