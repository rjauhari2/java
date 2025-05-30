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

package org.tensorflow.op.bitwise;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.DataType;
import org.tensorflow.types.family.TNumber;

/**
 * Elementwise computes the bitwise left-shift of {@code x} and {@code y}.
 * If {@code y} is negative, or greater than or equal to the width of {@code x} in bits the
 * result is implementation defined.
 * <p>Example:
 * <pre>
 * import tensorflow as tf
 * from tensorflow.python.ops import bitwise_ops
 * import numpy as np
 * dtype_list = [tf.int8, tf.int16, tf.int32, tf.int64]
 *
 * for dtype in dtype_list:
 *   lhs = tf.constant([-1, -5, -3, -14], dtype=dtype)
 *   rhs = tf.constant([5, 0, 7, 11], dtype=dtype)
 *
 *   left_shift_result = bitwise_ops.left_shift(lhs, rhs)
 *
 *   print(left_shift_result)
 *
 * # This will print:
 * # tf.Tensor([ -32   -5 -128    0], shape=(4,), dtype=int8)
 * # tf.Tensor([   -32     -5   -384 -28672], shape=(4,), dtype=int16)
 * # tf.Tensor([   -32     -5   -384 -28672], shape=(4,), dtype=int32)
 * # tf.Tensor([   -32     -5   -384 -28672], shape=(4,), dtype=int64)
 *
 * lhs = np.array([-2, 64, 101, 32], dtype=np.int8)
 * rhs = np.array([-1, -5, -3, -14], dtype=np.int8)
 * bitwise_ops.left_shift(lhs, rhs)
 * # &lt;tf.Tensor: shape=(4,), dtype=int8, numpy=array([ -2,  64, 101,  32], dtype=int8)&gt;
 * </pre>
 */
@OpMetadata(
    opType = LeftShift.OP_NAME,
    inputsClass = LeftShift.Inputs.class
)
@Operator(
    group = "bitwise"
)
public final class LeftShift<T extends TNumber> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "LeftShift";

  private Output<T> z;

  public LeftShift(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    z = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new LeftShift operation.
   *
   * @param scope current scope
   * @param x The x value
   * @param y The y value
   * @param <T> data type for {@code LeftShift} output and operands
   * @return a new instance of LeftShift
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TNumber> LeftShift<T> create(Scope scope, Operand<T> x, Operand<T> y) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "LeftShift");
    opBuilder.addInput(x.asOutput());
    opBuilder.addInput(y.asOutput());
    return new LeftShift<>(opBuilder.build());
  }

  /**
   * Gets z.
   *
   * @return z.
   */
  public Output<T> z() {
    return z;
  }

  @Override
  public Output<T> asOutput() {
    return z;
  }

  @OpInputsMetadata(
      outputsClass = LeftShift.class
  )
  public static class Inputs<T extends TNumber> extends RawOpInputs<LeftShift<T>> {
    /**
     * The x input
     */
    public final Operand<T> x;

    /**
     * The y input
     */
    public final Operand<T> y;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new LeftShift<>(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      x = (Operand<T>) op.input(inputIndex++);
      y = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
    }
  }
}
