package chap16_LambdaExpressions.exercise;

@FunctionalInterface
public interface Function<T> {
 public double apply(T t);
}
