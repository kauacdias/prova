package prova;

import java.time.LocalDate;

/**
 *
 * @Kauã C Dias
 */
public class Cliente extends Fisica {
    private int protocoloAtendimento;

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\n\nCliente: " + 
                "\nProtocolo de atendimento: " + protocoloAtendimento;
    }
    
    
}
