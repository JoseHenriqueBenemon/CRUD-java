//Pacote para organizar as classes
package model.bean;

public class FuncFlor {
    
    //Variaveis que serão usadas na cosntrução de construtores e métodos
    private int id;
    private int idFunc;
    private int idFlor;
    private String dt_compra;
    private String valor;
    private String obs;
    private Funcionario func;
    private Flor flor;

    //Construtor que guarda o id da venda da flor
    public FuncFlor(int id) {
        this.id = id;
    }

    //Construtor que guarda a data da compra da venda da flor
    public FuncFlor(String dt_compra) {
        this.dt_compra = dt_compra;
    }
    
    //Construtor que guarda o id do funcionário, o id da flor, a data da compra, o valor e a observação
    public FuncFlor(int idFunc, int idFlor, String dt_compra, String valor, String obs) {
        this.idFunc = idFunc;
        this.idFlor = idFlor;
        this.dt_compra = dt_compra;
        this.valor = valor;
        this.obs = obs;
    }

    //Construtor que guarda o id, o id do funcionário, o id da flor, a data da compra, o valor e a observação
    public FuncFlor(int id,int idFunc, int idFlor, String dt_compra, String valor, String obs) {
        this.id = id;
        this.idFunc = idFunc;
        this.idFlor = idFlor;
        this.dt_compra = dt_compra;
        this.valor = valor;
        this.obs = obs;
    }

    //Método que retorna o id da venda da flor
    public int getId() {
        return id;
    }

    //Método que guarda o id da venda da flor
    public void setId(int id) {
        this.id = id;
    }

    //Método que retorna o id do funcionário
    public int getIdFunc() {
        return idFunc;
    }

    //Método que guarda o id do funcionário
    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    //Método que retorna o id da flor
    public int getIdFlor() {
        return idFlor;
    }

    //Método que guarda o id da flor
    public void setIdFlor(int idFlor) {
        this.idFlor = idFlor;
    }

    //Método que retorna a data da compra da venda da flor
    public String getDt_compra() {
        return dt_compra;
    }

    //Método que guarda a data da compra da venda da flor
    public void setDt_compra(String dt_compra) {
        this.dt_compra = dt_compra;
    }
    
    //Método que retorna o valor da venda da flor
    public String getValor() {
        return valor;
    }

    //Método que guarda o valor da venda da flor
    public void setValor(String valor) {
        this.valor = valor;
    }

    //Método que retorna a observação da venda da flor
    public String getObs() {
        return obs;
    }

    //Método que guarda a observação da venda da flor
    public void setObs(String obs) {
        this.obs = obs;
    }

    //Método que retorna o funcionário
    public Funcionario getFunc() {
        return func;
    }

    //Método que guarda o funcionário
    public void setFunc(Funcionario func) {
        this.func = func;
    }

    //Método que retorna a flor
    public Flor getFlor() {
        return flor;
    }

    //Método que guarda a flor
    public void setFlor(Flor flor) {
        this.flor = flor;
    }

    //Método que retorna a saida os valores guardados na variaveis privadas
    @Override
    public String toString() {
        String retorno = "";
        String msgFu = "null" ;
        String msgFl = "null" ;
        if(this.func != null) {
            msgFu = func.toString() + "\n";
        }
        if(this.flor != null) {
            msgFl = flor.toString() + "\n";
        }
        
        String msgFF = "Funcionario_Flor{" + "id=" + id + ", idFunc=" + idFunc + ", idFlor=" + idFlor + ", Data da compra=" + dt_compra + ", Valor=" + valor + ", obs=" + obs + '}';
        if(this.func != null && this.flor != null){
            retorno = msgFu + " " + msgFl + " " + msgFF; 
            return retorno;
        } else{
            return msgFF;
        }
    }
}
