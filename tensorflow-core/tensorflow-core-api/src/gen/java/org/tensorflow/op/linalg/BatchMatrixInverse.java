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

package org.tensorflow.op.linalg;

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
 * The BatchMatrixInverse operation
 * DEPRECATED: This operation is deprecated and will be removed in a future version.
 * Use tf.linalg.inv instead.
 * <p>Computes the inverse of one or more square invertible matrices or their
 * adjoints (conjugate transposes).
 */
@OpMetadata(
    opType = BatchMatrixInverse.OP_NAME,
    inputsClass = BatchMatrixInverse.Inputs.class
)
@Operator(
    group = "linalg"
)
public final class BatchMatrixInverse<T extends TNumber> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "BatchMatrixInverse";

  private Output<T> output;

  public BatchMatrixInverse(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new BatchMatrixInverse operation.
   *
   * @param scope current scope
   * @param input The input value
   * @param options carries optional attribute values
   * @param <T> data type for {@code BatchMatrixInverse} output and operands
   * @return a new instance of BatchMatrixInverse
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TNumber> BatchMatrixInverse<T> create(Scope scope, Operand<T> input,
      Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "BatchMatrixInverse");
    opBuilder.addInput(input.asOutput());
    if (options != null) {
      for (Options opts : options) {
        if (opts.adjoint != null) {
          opBuilder.setAttr("adjoint", opts.adjoint);
        }
      }
    }
    return new BatchMatrixInverse<>(opBuilder.build());
  }

  /**
   * Sets the adjoint option.
   *
   * @param adjoint the adjoint option
   * @return this Options instance.
   */
  public static Options adjoint(Boolean adjoint) {
    return new Options().adjoint(adjoint);
  }

  /**
   * Gets output.
   *
   * @return output.
   */
  public Output<T> output() {
    return output;
  }

  @Override
  public Output<T> asOutput() {
    return output;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.linalg.BatchMatrixInverse}
   */
  public static class Options {
    private Boolean adjoint;

    private Options() {
    }

    /**
     * Sets the adjoint option.
     *
     * @param adjoint the adjoint option
     * @return this Options instance.
     */
    public Options adjoint(Boolean adjoint) {
      this.adjoint = adjoint;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = BatchMatrixInverse.class
  )
  public static class Inputs<T extends TNumber> extends RawOpInputs<BatchMatrixInverse<T>> {
    /**
     * The input input
     */
    public final Operand<T> input;

    /**
     * The adjoint attribute
     */
    public final boolean adjoint;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new BatchMatrixInverse<>(op), op, Arrays.asList("adjoint", "T"));
      int inputIndex = 0;
      input = (Operand<T>) op.input(inputIndex++);
      adjoint = op.attributes().getAttrBool("adjoint");
      T = op.attributes().getAttrType("T");
    }
  }
}
