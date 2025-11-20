package com.grupo13.lavarapido.model.repository;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.grupo13.lavarapido.model.entities.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

    List<Procedimento> findByNomeContainingIgnoreCase(String nome);
    List<Procedimento> findByValor(BigDecimal valor);
    List<Procedimento> findByTipoVeiculoIgnoreCase(String tipoVeiculo);
}