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

package org.tensorflow.op.signal;

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
 * 3D fast Fourier transform.
 * Computes the 3-dimensional discrete Fourier transform over the inner-most 3
 * dimensions of {@code input}.
 */
@OpMetadata(
    opType = Fft3d.OP_NAME,
    inputsClass = Fft3d.Inputs.class
)
@Operator(
    group = "signal"
)
public final class Fft3d<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "FFT3D";

  private Output<T> output;

  public Fft3d(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new FFT3D operation.
   *
   * @param scope current scope
   * @param input A complex tensor.
   * @param <T> data type for {@code FFT3D} output and operands
   * @return a new instance of Fft3d
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> Fft3d<T> create(Scope scope, Operand<T> input) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "Fft3d");
    opBuilder.addInput(input.asOutput());
    return new Fft3d<>(opBuilder.build());
  }

  /**
   * Gets output.
   * A complex tensor of the same shape as {@code input}. The inner-most 3
   * dimensions of {@code input} are replaced with their 3D Fourier transform.
   * <p>{@literal @}compatibility(numpy)<br>
   * Equivalent to np.fft.fftn with 3 dimensions.
   * <br>{@literal @}end_compatibility
   * @return output.
   */
  public Output<T> output() {
    return output;
  }

  @Override
  public Output<T> asOutput() {
    return output;
  }

  @OpInputsMetadata(
      outputsClass = Fft3d.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<Fft3d<T>> {
    /**
     * A complex tensor.
     */
    public final Operand<T> input;

    /**
     * The Tcomplex attribute
     */
    public final DataType Tcomplex;

    public Inputs(GraphOperation op) {
      super(new Fft3d<>(op), op, Arrays.asList("Tcomplex"));
      int inputIndex = 0;
      input = (Operand<T>) op.input(inputIndex++);
      Tcomplex = op.attributes().getAttrType("Tcomplex");
    }
  }
}
