package tech.intellispaces.common.entities.function;

/**
 * Consumer that accepts six arguments.
 *
 * @param <T1> the first argument type.
 * @param <T2> the second argument type.
 * @param <T3> the third argument type.
 * @param <T4> the fourth argument type.
 * @param <T5> the fifth argument type.
 * @param <T6> the sixth argument type.
 */
@FunctionalInterface
public interface SexiConsumer<T1, T2, T3, T4, T5, T6> {

  /**
   * Applies function.
   *
   * @param arg1 the first argument.
   * @param arg2 the second argument.
   * @param arg3 the third argument.
   * @param arg4 the fourth argument.
   * @param arg5 the fifth argument.
   * @param arg6 the sixth argument.
   */
  void accept(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6);
}
