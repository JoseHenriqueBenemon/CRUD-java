package controller.bdBean;

public class Aluno {
    private String nome;
    private String ra;
    private String genero;

    public Aluno(String ra){
        this.ra = ra;
    }   

    public Aluno(String nome, String ra, String genero){
        this.nome = nome;
        this.ra = ra;
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRa(){
        return ra;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Aluno(" + "Nome: " + nome + ", ra: " + ra + ", genero: " + genero + ")";
    }
}
