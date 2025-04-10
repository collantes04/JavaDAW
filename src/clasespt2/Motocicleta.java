package clasespt2;

public class Motocicleta {
    private int cv;
    private int velocidadMax;
    private String matricula;
    private int numeroMatricula;

    public Motocicleta(int cv, int velocidadMax, String matricula, int numeroMatricula){
        this.cv = cv;
        this.velocidadMax = velocidadMax;
        this.matricula = matricula;
        this.numeroMatricula = numeroMatricula;

    }

    public Motocicleta(){
        this(0, 0, "", 0);
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String matricula(){
        return getNumeroMatricula() + getMatricula(); 
    }

    public void mostrarMatricula(){
        System.out.println(matricula());
    }


    @Override
    public String toString() {
        return "Motocicleta [cv=" + cv + ", velocidadMax=" + velocidadMax + ", matricula=" + matricula
                + ", numeroMatricula=" + numeroMatricula + "]";
    }

    public static void main(String[] args) {
        Motocicleta moto1 = new Motocicleta(100, 203, "AAA", 123);

        Motocicleta moto2 = new Motocicleta();
        moto2.setCv(200);
        moto2.setMatricula("BBB");
        moto2.setNumeroMatricula(300);
        moto2.setVelocidadMax(300);

        moto1.mostrarMatricula();
        System.out.println(moto1.toString());
        
        moto2.mostrarMatricula();
        System.out.println(moto2.toString());

    

}
    
}


