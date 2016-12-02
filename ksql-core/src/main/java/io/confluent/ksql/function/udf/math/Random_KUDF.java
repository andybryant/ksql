package io.confluent.ksql.function.udf.math;

import io.confluent.ksql.function.KSQLFunctionException;
import io.confluent.ksql.function.udf.KUDF;

public class Random_KUDF implements KUDF {
  @Override
  public void init() {

  }

  @Override
  public Object evaluate(Object... args) {
    if (args.length != 0) {
      throw new KSQLFunctionException("Random udf should have no input argument.");
    }
    return Math.random();
  }
}
