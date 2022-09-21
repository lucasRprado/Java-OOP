package uscs;

public class Computador {
    
    private String numeroSerie;
    private Teclado teclado;
    private Mouse mouse;
    private Monitor monitor;
    private Gabinete gabinete;
    
    public Computador(){
        
    }
    
    public Computador(String numeroSerie, Teclado teclado, Mouse mouse, Monitor monitor, Gabinete gabinete){
        this.numeroSerie = numeroSerie;
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
        this.gabinete = gabinete;
    }
    
    public String getNumeroSerie(){
        return this.numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    
    public Teclado getTeclado(){
        return teclado;
    }
    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }
    
    public Mouse getMouse(){
        return this.mouse;
    }
    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }
    
    public Monitor getMonitor(){
        return this.monitor;
    }
    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }
    
    public Gabinete getGabinete(){
        return this.gabinete;
    }
    public void setGabinete(Gabinete gabinete){
        this.gabinete = gabinete;
    }
    
    public void ImprimeComputador(){
        System.out.println("Informacoes do computador: ");
        System.out.println("Numero de serie: " + this.numeroSerie);
        teclado.ImprimeTeclado();
        mouse.ImprimeMouse();
        monitor.ImprimeMonitor();
        gabinete.ImprimeGabinete();
    }
}
