package com.cineworld.cw.shared.mapper;

import java.util.List;

/**
 * @param <E>
 * @param <O>
 */

public interface EntityToDto <O,E>{

  E toEntity(O o);
  List<E> toEntity(List<O> o);
  O toDto(E e);
  List<O> toDto(List<E> e);

}
