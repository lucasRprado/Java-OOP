package uscs;

public class Gabinete {
    
    private String numeroSerie;
    private String fabricante;
    private String cor;
    
    public Gabinete(){
        
    }
    
    public Gabinete(String numeroSerie, String fabricante, String cor){
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
    
    public void ImprimeGabinete(){
        System.out.println("\nInformacoes do gabinete: ");
        System.out.println("Numero de serie: " + this.numeroSerie);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cor: " + this.cor);
    }
}
