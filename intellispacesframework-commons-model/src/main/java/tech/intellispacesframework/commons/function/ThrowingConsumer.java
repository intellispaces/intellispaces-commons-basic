package tech.intellispacesframework.commons.function;

@FunctionalInterface
public interface ThrowingConsumer<T, E extends Throwable> {

  void accept(T t) throws E;
}
