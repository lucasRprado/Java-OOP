package uscs;

public class Monitor {
    
    private String numeroSerie;
    private String fabricante;
    private String cor;
    
    public Monitor(){
        
    }
    
    public Monitor(String numeroSerie, String fabricante, String cor){
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }
    
    public String getNumeroSerie(){
        return this.numeroSerie;
    }
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public void ImprimeMonitor(){
        System.out.println("\nInformacoes do Monitor: ");
        System.out.println("Numero de serie: " + this.numeroSerie);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cor: " + this.cor);
    }
    
}
