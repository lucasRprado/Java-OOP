package uscs;

public class Teclado {
    
    private String numeroSerie;
    private String fabricante;
    private String cor;
    
    public Teclado(){
        
    }

    public Teclado(String numeroSerie, String fabricante, String cor) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.cor = cor;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void ImprimeTeclado(){
        System.out.println("\nInformacoes do teclado: ");
        System.out.println("Numero de serie: " + this.numeroSerie);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Cor: " + this.cor);
    }
    
}
