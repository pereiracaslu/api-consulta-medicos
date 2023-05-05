package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String telefone,
        @NotBlank //É usado apenas nos campos que são string nos demais são not null
        @Pattern(regexp = "\\d{4,6}") String crm,
        // regexp limita a quantidade do campo a ser preenchida - \\d significa a quantidade de digitos sendo assim entre 4 e 6
        @NotNull
        Especialidade especialidade,
        @NotNull @Valid
        //Valid ele está validando junto a outra dto que é endereço
        DadosEndereco endereco) {
}
