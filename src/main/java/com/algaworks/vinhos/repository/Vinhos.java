package com.algaworks.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.vinhos.model.Vinho;

/**
 * @author Karen 20 de abr de 2018
 */
public interface Vinhos extends JpaRepository<Vinho, Long> {

}
