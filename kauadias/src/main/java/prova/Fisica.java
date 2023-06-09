package prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @Kauã C Dias
 */
public abstract class Fisica extends Pessoa {
    protected LocalDate dataNascimento;
    protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nData de nascimento: " + dataNascimento + 
                "\nIdade: " + this.getIdade() + 
                "\nGenero: " + genero.getTexto();
    }
    
    
}
