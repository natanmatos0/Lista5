public class ContaBancaria {
    private double saldo;


    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        if (this.saldo > 0){
            System.out.println("Saldo positivo:" + saldo);
        }

        else{
            System.out.println("Saldo negativo:" + saldo);
        }
    }

    public void depositar(int valor) {
        this.saldo = this.saldo + valor;
        if (this.saldo > 0){
            System.out.println("Saldo positivo:" + saldo);
        }

        else{
            System.out.println("Saldo negativo:" + saldo);
        }
    }
}
