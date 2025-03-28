public class ClienteService {
    public static boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
    }
}