
package contabanca;

public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("****************************");
        System.out.println("conta: "+ this.getNumConta());
        System.out.println("tipo: "+ this.getTipo());
        System.out.println("dono: "+ this.getDono());
        System.out.println("saldo: "+ this.getSaldo());  
        System.out.println("status: "+ this.getStatus());
    }
    
    //metodos especiais
    public void ContaBanco(){
        this.saldo=0;
        this.status = false;
    }
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //metodos
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="cc") {
            this.setSaldo(50);
        } else if (t=="cp") {
            this.setSaldo(150);
        }
        System.out.println("conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo()>0) {
            System.out.println("conta nao pode ser fechada pois ainda existe saldo");
        } else if(this.getSaldo()<0) {
            System.out.println("conta nao pode ser fechada pois existe debito");
        }else{
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() +v);
            System.out.println("deposito realizado com sucesso na conta de"+this.getDono());
        } else {
            System.out.println("impossivel depositar em conta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if(this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println(" saque realizado na conta de "+this.getDono());
            }else{
                System.out.println(" saldo insulficiente para saque");
            }
          }else {
            System.out.println("impossivel sacar de uma conta fechada   ");
        }
    }
    public void pagarMensal(){
        int v=0;
        if (this.getTipo()=="cc") {
            v=12;
        } else if (this.getTipo() =="cp"){
            v=20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("mensalidade paga por "+this.getDono());
        } else {
            System.out.println("impossivel pagar uma conta fechada");
        }
    }
}
