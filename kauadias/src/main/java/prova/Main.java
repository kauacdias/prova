package prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
    
        Motoboy motoboy = new Motoboy("122122A", "075.996.454-33", "23.123.745-30", "2122.44", Setor.OPERACOES, 2500, LocalDate.of(1988, Month.FEBRUARY, 10), Genero.MASCULINO, "Lucas", "71 98122-7474", "lucas@gmail.com", new Endereco("Rua Java", "78A", "Térreo", "40223-220", "Salvador", UnidadeFederativa.BAHIA));
        
        Medico medico = new Medico("5223.112.11", "074.123.323-55", "99.123.666-87", "2122.45", Setor.SAUDE, 3500, LocalDate.of(1978, Month.DECEMBER, 20), Genero.FEMININO, "Carla", "71 98888-7779", "carla@gmail.com", new Endereco("Rua HTML", "41", "Térreo", "40222-779", "Salvador", UnidadeFederativa.BAHIA));
        
        Advogado advogado = new Advogado("4541.7777", "074.136.414-46", "97.233.164-77", "2122.46", Setor.JURIDICO, 4500, LocalDate.of(1960, Month.AUGUST, 15), Genero.MASCULINO, "Jorge", "21 98852-7171", "jorge@gmail.com", new Endereco("Rua Python", "1102", "11º andar", "40444-723", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Cliente cliente = new Cliente(152200, LocalDate.of(1977, Month.MARCH, 30), Genero.FEMININO, "Marilia", "11 97877-7177", "marilia@outlook.com", new Endereco("Rua Presidente Vargas", "500", "Térreo", "40255-233", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Juridica juridica = new Juridica("55855112", "4542411", "Santoro Alimentos LTDA", "71 98829-3639", "santoroalimentos@outlook.com", new Endereco("Rua Chile", "7", "térreo", "40222-966", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("");
        System.out.println("Quadro de Funcionários: ");
        System.out.println("");
        System.out.println(motoboy);
        System.out.println("");
        System.out.println("");
        System.out.println(medico);
        System.out.println("");
        System.out.println("");
        System.out.println(advogado);
        System.out.println("");
        System.out.println("");
        System.out.println("Quadro de Clientes: ");
        System.out.println("");
        System.out.println(cliente);
        System.out.println("");
        System.out.println("");
        System.out.println("Quadro de Pessoa Jurídica: ");
        System.out.println("");
        System.out.println(juridica);
    }
}