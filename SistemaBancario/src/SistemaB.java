import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SistemaB {
    private JPanel panelmain;
    private JTextField txtsaldo;
    private JTextField txtsaque;
    private JTextField txtdeposito;
    private JTextField txtmensagem;
    private JButton btnlimpar;
    private JButton btnsaquev;
    private JButton btndeposito;
    private Integer valorDSaldo= 500;
    private Integer saldo=500;
    private Integer valorDoDeposito = 0;
    private Integer deposito = 0;


    public SistemaB(){
        txtsaldo.setText(String.valueOf(saldo));


        txtsaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtsaldo.setText(txtsaldo.getText());
                txtsaldo.setText("500");






            }
        });

        btnsaquev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valorDSaldo = Integer.parseInt(txtsaque.getText());

                if (valorDSaldo> saldo){
                    txtmensagem.setText("Saldo Insuficiente");
                } else if (valorDSaldo<=saldo) {
                    saldo -= valorDSaldo;
                    txtsaldo.setText(String.valueOf(saldo));
                    txtmensagem.setText("Saque Realizado com sucesso");
                }


            }
        });

        btndeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              valorDoDeposito = Integer.parseInt(txtdeposito.getText());

             if (valorDoDeposito >= 1000) {
                  txtsaldo.setText(String.valueOf(saldo));
                  txtmensagem.setText("Deposito acima de 1000 esta ploqueado");
              }else {
                  saldo +=valorDoDeposito;
                  txtsaldo.setText(String.valueOf(saldo));
                  txtmensagem.setText("Deposito realizado com sucesso");
              }


            }
        });
        btnlimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtmensagem.setText("");
                txtdeposito.setText("");
                txtsaque.setText("");
            }
        });
    }



















    public static void main(String[] args) {
        JFrame jframe = new JFrame("SistemaB");
        jframe.setContentPane(new SistemaB().panelmain);
        jframe.setSize(400,400);
        jframe.setVisible(true);
    }
}
