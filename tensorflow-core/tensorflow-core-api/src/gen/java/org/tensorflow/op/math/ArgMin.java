/* Copyright 2018-2023 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
=======================================================================*/

// This class has been generated, DO NOT EDIT!

package org.tensorflow.op.math;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.DataType;
import org.tensorflow.types.TInt64;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Returns the index with the smallest value across dimensions of a tensor.
 * Note that in case of ties the identity of the return value is not guaranteed.
 * <p>Usage:
 * <pre>
 * import tensorflow as tf
 * a = [1, 10, 26.9, 2.8, 166.32, 62.3]
 * b = tf.math.argmin(input = a)
 * c = tf.keras.backend.eval(b)
 * # c = 0
 * # here a[0] = 1 which is the smallest element of a across axis 0
 * </pre>
 */
@OpMetadata(
    opType = ArgMin.OP_NAME,
    inputsClass = ArgMin.Inputs.class
)
@Operator(
    group = "math"
)
public final class ArgMin<V extends TNumber> extends RawOp implements Operand<V> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ArgMin";

  private Output<V> output;

  public ArgMin(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new ArgMin operation.
   *
   * @param scope current scope
   * @param input The input value
   * @param dimension int32 or int64, must be in the range {@code [-rank(input), rank(input))}.
   * Describes which dimension of the input Tensor to reduce across. For vectors,
   * use dimension = 0.
   * @param outputType The value of the outputType attribute
   * @param <V> data type for {@code ArgMin} output and operands
   * @return a new instance of ArgMin
   */
  @Endpoint(
      describeByClass = true
  )
  public static <V extends TNumber> ArgMin<V> create(Scope scope, Operand<? extends TType> input,
      Operand<? extends TNumber> dimension, Class<V> outputType) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ArgMin");
    opBuilder.addInput(input.asOutput());
    opBuilder.addInput(dimension.asOutput());
    opBuilder.setAttr("output_type", Operands.toDataType(outputType));
    return new ArgMin<>(opBuilder.build());
  }

  /**
   * Factory method to create a class wrapping a new ArgMin operation, with the default output types.
   *
   * @param scope current scope
   * @param input The input value
   * @param dimension int32 or int64, must be in the range {@code [-rank(input), rank(input))}.
   * Describes which dimension of the input Tensor to reduce across. For vectors,
   * use dimension = 0.
   * @return a new instance of ArgMin, with default output types
   */
  @Endpoint(
      describeByClass = true
  )
  public static ArgMin<TInt64> create(Scope scope, Operand<? extends TType> input,
      Operand<? extends TNumber> dimension) {
    return create(scope, input, dimension, TInt64.class);
  }

  /**
   * Gets output.
   *
   * @return output.
   */
  public Output<V> output() {
    return output;
  }

  @Override
  public Output<V> asOutput() {
    return output;
  }

  @OpInputsMetadata(
      outputsClass = ArgMin.class
  )
  public static class Inputs extends RawOpInputs<ArgMin<?>> {
    /**
     * The input input
     */
    public final Operand<? extends TType> input;

    /**
     * int32 or int64, must be in the range {@code [-rank(input), rank(input))}.
     * Describes which dimension of the input Tensor to reduce across. For vectors,
     * use dimension = 0.
     */
    public final Operand<? extends TNumber> dimension;

    /**
     * The T attribute
     */
    public final DataType T;

    /**
     * The Tidx attribute
     */
    public final DataType Tidx;

    /**
     * The outputType attribute
     */
    public final DataType outputType;

    public Inputs(GraphOperation op) {
      super(new ArgMin<>(op), op, Arrays.asList("T", "Tidx", "output_type"));
      int inputIndex = 0;
      input = (Operand<? extends TType>) op.input(inputIndex++);
      dimension = (Operand<? extends TNumber>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
      Tidx = op.attributes().getAttrType("Tidx");
      outputType = op.attributes().getAttrType("output_type");
    }
  }
}
