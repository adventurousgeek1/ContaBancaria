
package contabanca;

public class ContaBanca {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("marcos");
        p1.abrirConta("cc");
        
        ContaBanco p2 =new ContaBanco();
        p2.setNumConta(1236);
        p2.setDono("marilia");
        
        p1.estadoAtual();
        p2.estadoAtual();
        
       
    }
    
}
