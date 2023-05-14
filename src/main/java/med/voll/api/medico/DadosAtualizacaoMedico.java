package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(@NotNull Long id,
                                     String nome,
                                     String telefone,
                                     DadosEndereco endereco) {
}
