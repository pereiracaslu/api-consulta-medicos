package med.voll.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String rua,
        @NotBlank
        String bairro,
        int numero,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        String complemento,
        @NotBlank
        String cidade,
        @NotBlank
        String uf) {
}
