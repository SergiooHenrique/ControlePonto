import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.lang.Thread;

public class GerenciarControlePonto {
    public static void main(String[] args) {

        GerenciarControlePonto gcPonto = new GerenciarControlePonto();

        Gerente gerente = new Gerente();
        gerente.setIdFunc(1);
        gerente.setNome("Gerente teste");
        gerente.setDocumento("789-47");
        gerente.setEmail("testegerente@email.com");
        gerente.setLogin("GerenteTeste");
        gerente.setSenha("SenhaTeste147");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Secretária Teste");
        secretaria.setDocumento("963-87");
        secretaria.setEmail("testesecretaria@email.com");
        secretaria.setTelefone("(19) 3745-8698");
        secretaria.setRamal("Teste");

        Operador operador = new Operador();
        operador.setIdFunc(3);
        operador.setNome("Operador Teste");
        operador.setDocumento("456-78");
        operador.setEmail("testeoperador@email.com");
        operador.setValorHora(27.0);

        RegistroPonto regPonto1 = new RegistroPonto();
        regPonto1.setIdRegPonto(1);
        regPonto1.setDataRegistro(LocalDate.now());
        regPonto1.setHoraEntrada(LocalDateTime.now());
        regPonto1.setFunc(gerente);
        regPonto1.apresentarRegistroPonto();

        gcPonto.sleep(2000);

        RegistroPonto regPonto2 = new RegistroPonto();
        regPonto2.setIdRegPonto(2);
        regPonto2.setDataRegistro(LocalDate.now());
        regPonto2.setHoraEntrada(LocalDateTime.now());
        regPonto2.setFunc(operador);
        regPonto2.apresentarRegistroPonto();

        gcPonto.sleep(2000);

        RegistroPonto regPonto3 = new RegistroPonto();
        regPonto3.setIdRegPonto(3);
        regPonto3.setDataRegistro(LocalDate.now());
        regPonto3.setHoraEntrada(LocalDateTime.now());
        regPonto3.setFunc(secretaria);
        regPonto3.apresentarRegistroPonto();

        gcPonto.sleep(2000);

        regPonto1.setHoraSaida(LocalDateTime.now());
        regPonto1.apresentarRegistroPonto();

        gcPonto.sleep(2000);

        regPonto2.setHoraSaida(LocalDateTime.now());
        regPonto2.apresentarRegistroPonto();

        gcPonto.sleep(2000);

        regPonto3.setHoraSaida(LocalDateTime.now());
        regPonto3.apresentarRegistroPonto();
    }

    public void sleep(Integer time){
        try{
            Thread.sleep(time);
        } catch (Exception ex){
            System.out.println(ex);
        }
    }
}