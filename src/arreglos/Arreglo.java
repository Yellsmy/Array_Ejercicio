
package arreglos;

public class Arreglo {
    private int arregloEnt[];
    
    
    public Arreglo(){
        this.arregloEnt = new int[10];
    }
    
    public int[] getArregloEnt(){
        return arregloEnt;
    }
    
    public void setArregloEnt(){
        this.arregloEnt = arregloEnt;
    }
    
    public void Random(){
        for(int i=0; i<10; i ++){
        this.arregloEnt[i]= (int)(Math.random()*100);
        System.out.println("Arreglo"+i+"------"+this.arregloEnt[i]);
        }
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo Correr = new Arreglo();
        Correr.Random();
        
    }
}
