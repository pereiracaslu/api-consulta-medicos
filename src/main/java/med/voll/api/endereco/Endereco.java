package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Utilizado para o jpa saber que é pertencete a mesma tabela
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cep;
    private String cidade;
    private String complemento;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.rua = dados.rua();
        this.bairro = dados.bairro();
        this.numero = dados.numero();;
        this.cep = dados.cep();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.uf = dados.uf();
    }
}
