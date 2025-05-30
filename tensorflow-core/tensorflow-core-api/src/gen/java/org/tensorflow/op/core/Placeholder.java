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

package org.tensorflow.op.core;

import java.util.Arrays;
import org.tensorflow.GraphOperation;
import org.tensorflow.Operand;
import org.tensorflow.Operation;
import org.tensorflow.OperationBuilder;
import org.tensorflow.Output;
import org.tensorflow.ndarray.Shape;
import org.tensorflow.op.Operands;
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.DataType;
import org.tensorflow.types.family.TType;

/**
 * A placeholder op for a value that will be fed into the computation.
 * N.B. This operation will fail with an error if it is executed. It is
 * intended as a way to represent a value that will always be fed, and to
 * provide attrs that enable the fed value to be checked at runtime.
 */
@OpMetadata(
    opType = Placeholder.OP_NAME,
    inputsClass = Placeholder.Inputs.class
)
@Operator
public final class Placeholder<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "Placeholder";

  private Output<T> output;

  public Placeholder(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new Placeholder operation.
   *
   * @param scope current scope
   * @param dtype The type of elements in the tensor.
   * @param options carries optional attribute values
   * @param <T> data type for {@code Placeholder} output and operands
   * @return a new instance of Placeholder
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> Placeholder<T> create(Scope scope, Class<T> dtype,
      Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "Placeholder");
    opBuilder.setAttr("dtype", Operands.toDataType(dtype));
    if (options != null) {
      for (Options opts : options) {
        if (opts.shape != null) {
          opBuilder.setAttr("shape", opts.shape);
        }
      }
    }
    return new Placeholder<>(opBuilder.build());
  }

  /**
   * Sets the shape option.
   *
   * @param shape (Optional) The shape of the tensor. If the shape has 0 dimensions, the
   * shape is unconstrained.
   * @return this Options instance.
   */
  public static Options shape(Shape shape) {
    return new Options().shape(shape);
  }

  /**
   * Gets output.
   * A placeholder tensor that must be replaced using the feed mechanism.
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
   * Optional attributes for {@link org.tensorflow.op.core.Placeholder}
   */
  public static class Options {
    private Shape shape;

    private Options() {
    }

    /**
     * Sets the shape option.
     *
     * @param shape (Optional) The shape of the tensor. If the shape has 0 dimensions, the
     * shape is unconstrained.
     * @return this Options instance.
     */
    public Options shape(Shape shape) {
      this.shape = shape;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = Placeholder.class
  )
  public static class Inputs extends RawOpInputs<Placeholder<?>> {
    /**
     * The type of elements in the tensor.
     */
    public final DataType dtype;

    /**
     * (Optional) The shape of the tensor. If the shape has 0 dimensions, the
     * shape is unconstrained.
     */
    public final Shape shape;

    public Inputs(GraphOperation op) {
      super(new Placeholder<>(op), op, Arrays.asList("dtype", "shape"));
      int inputIndex = 0;
      dtype = op.attributes().getAttrType("dtype");
      shape = op.attributes().getAttrShape("shape");
    }
  }
}
