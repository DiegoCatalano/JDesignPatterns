
package dp.creational.FactoryMethod;

public abstract class Sanduiche {
    String nome;
    String pao;
    String carne;
    
    void prepare(){
        System.out.println("Preparando " + nome + "™");
        System.out.println("Adicionando ingredientes");
    }
    
    void assar(){
        System.out.println("Assando o pão por 25 minutos em 350ºC");
        System.out.println("Abrindo o pão " + pao);
    }
    
    void fritar(){
        System.out.println("Fritando a carne");
        System.out.println("Inserindo carne " + carne + " dentro do pão " + pao);
    }

    void embalar(){
        System.out.println("Embalando " + nome +"™");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDough() {
        return pao;
    }

    public void setDough(String pao) {
        this.pao = pao;
    }

    public String getSauce() {
        return carne;
    }

    public void setSauce(String carne) {
        this.carne = carne;
    }
    
}
