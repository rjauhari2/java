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
 * Computes hyperbolic sine of x element-wise.
 * Given an input tensor, this function computes hyperbolic sine of every
 * element in the tensor. Input range is {@code [-inf,inf]} and output range
 * is {@code [-inf,inf]}.
 * <pre>
 * x = tf.constant([-float(&quot;inf&quot;), -9, -0.5, 1, 1.2, 2, 10, float(&quot;inf&quot;)])
 * tf.math.sinh(x) ==&gt; [-inf -4.0515420e+03 -5.2109528e-01 1.1752012e+00 1.5094614e+00 3.6268604e+00 1.1013232e+04 inf]
 * </pre>
 */
@OpMetadata(
    opType = Sinh.OP_NAME,
    inputsClass = Sinh.Inputs.class
)
@Operator(
    group = "math"
)
public final class Sinh<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "Sinh";

  private Output<T> y;

  public Sinh(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    y = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new Sinh operation.
   *
   * @param scope current scope
   * @param x The x value
   * @param <T> data type for {@code Sinh} output and operands
   * @return a new instance of Sinh
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> Sinh<T> create(Scope scope, Operand<T> x) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "Sinh");
    opBuilder.addInput(x.asOutput());
    return new Sinh<>(opBuilder.build());
  }

  /**
   * Gets y.
   *
   * @return y.
   */
  public Output<T> y() {
    return y;
  }

  @Override
  public Output<T> asOutput() {
    return y;
  }

  @OpInputsMetadata(
      outputsClass = Sinh.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<Sinh<T>> {
    /**
     * The x input
     */
    public final Operand<T> x;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new Sinh<>(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      x = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
    }
  }
}
