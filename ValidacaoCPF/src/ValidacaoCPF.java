public class ValidacaoCPF {
    public static boolean validandoCPF(String cpf){
        int soma = 0, peso = 10, d1, d2, peso2 = 11, soma2 = 0;

        cpf = cpf.replaceAll("[^0-9]", "");
        for (int i = 0; i <= 8; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * peso;
            peso--;
        }
        if (soma % 11 == 0 || soma % 11 == 1) {
            d1 = 0;
        } else {
            d1 = 11 - (soma % 11);
        }
        for (int i = 0; i <= 9; i++) {
            soma2 += Character.getNumericValue(cpf.charAt(i)) * peso2;
            peso2--;
        }
        if (soma2 % 11 == 0 || soma2 % 11 == 1) {
            d2 = 0;
        } else {
            d2 = 11 - (soma2 % 11);
        }

        if (d1 == Character.getNumericValue(cpf.charAt(9)) && d2 == Character.getNumericValue(cpf.charAt(10))) {
            return true;
        } else {
            return false;
        }
    }
}
