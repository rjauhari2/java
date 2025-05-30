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
 * Reads the value of a variable.
 * The tensor returned by this operation is immutable.
 * <p>The value returned by this operation is guaranteed to be influenced by all the
 * writes on which this operation depends directly or indirectly, and to not be
 * influenced by any of the writes which depend directly or indirectly on this
 * operation.
 */
@OpMetadata(
    opType = ReadVariableOp.OP_NAME,
    inputsClass = ReadVariableOp.Inputs.class
)
@Operator
public final class ReadVariableOp<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ReadVariableOp";

  private Output<T> value;

  public ReadVariableOp(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    value = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new ReadVariableOp operation.
   *
   * @param scope current scope
   * @param resource handle to the resource in which to store the variable.
   * @param dtype the dtype of the value.
   * @param <T> data type for {@code ReadVariableOp} output and operands
   * @return a new instance of ReadVariableOp
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> ReadVariableOp<T> create(Scope scope,
      Operand<? extends TType> resource, Class<T> dtype) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ReadVariableOp");
    opBuilder.addInput(resource.asOutput());
    opBuilder.setAttr("dtype", Operands.toDataType(dtype));
    return new ReadVariableOp<>(opBuilder.build());
  }

  /**
   * Gets value.
   *
   * @return value.
   */
  public Output<T> value() {
    return value;
  }

  @Override
  public Output<T> asOutput() {
    return value;
  }

  @OpInputsMetadata(
      outputsClass = ReadVariableOp.class
  )
  public static class Inputs extends RawOpInputs<ReadVariableOp<?>> {
    /**
     * handle to the resource in which to store the variable.
     */
    public final Operand<? extends TType> resource;

    /**
     * the dtype of the value.
     */
    public final DataType dtype;

    public Inputs(GraphOperation op) {
      super(new ReadVariableOp<>(op), op, Arrays.asList("dtype"));
      int inputIndex = 0;
      resource = (Operand<? extends TType>) op.input(inputIndex++);
      dtype = op.attributes().getAttrType("dtype");
    }
  }
}
