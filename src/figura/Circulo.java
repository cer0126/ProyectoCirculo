package figura;

public class Circulo {
    
    //Creo las variables
    private double centrox;
    private double centroy;
    private double radio;
    
    public Circulo() {
    }
    
    //Creamos la clase
    public Circulo(double centrox, double centroy, double radio){
        this.centrox = centrox;
        this.centroy = centroy;
        this.radio = radio;
    }
    
    //Todos estos son los metodos get y set de las variables:
    public double getCentrox() {
        return centrox;
    }
    
    public void setCentrox(double centrox){
        this.centrox = centrox;
    }
    
    public double getCentroy(){
        return centroy;
    }
   
    public void setCentroy(double centroy) {
        this.centroy = centroy;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public void setRadio(double radio){
        this.radio =radio;
    }
    
    @Override
    public String toString(){
        return "Circulo(" + "centrox=" + centrox + ", centroy=" + centroy + ",radio=" + radio + ')';
    }
    
    public double perimetroCirculo(){
        return 2 * Math.PI * this.radio;
    }
    
    public double areaCirculo(){
        return Math.PI * Math.pow(this.radio,2);
    }
    
    public void moverCirculo (double deltax, double deltay){
        this.centrox = this.centrox + deltax;
        this.centroy = this.centroy + deltay;
    }
    
    public void escalaCirculo(double s){
        this.radio = this.radio * s;
    }
}
