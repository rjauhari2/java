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
import java.util.Iterator;
import java.util.List;
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
import org.tensorflow.types.TInt32;
import org.tensorflow.types.family.TType;

/**
 * Partitions {@code data} into {@code num_partitions} tensors using indices from {@code partitions}.
 * For each index tuple {@code js} of size {@code partitions.ndim}, the slice {@code data[js, ...]}
 * becomes part of {@code outputs[partitions[js]]}.  The slices with {@code partitions[js] = i}
 * are placed in {@code outputs[i]} in lexicographic order of {@code js}, and the first
 * dimension of {@code outputs[i]} is the number of entries in {@code partitions} equal to {@code i}.
 * In detail,
 * <pre>
 *     outputs[i].shape = [sum(partitions == i)] + data.shape[partitions.ndim:]
 *
 *     outputs[i] = pack([data[js, ...] for js if partitions[js] == i])
 * </pre>
 * <p>{@code data.shape} must start with {@code partitions.shape}.
 * <p>For example:
 * <pre>
 *     # Scalar partitions.
 *     partitions = 1
 *     num_partitions = 2
 *     data = [10, 20]
 *     outputs[0] = []  # Empty with shape [0, 2]
 *     outputs[1] = [[10, 20]]
 *
 *     # Vector partitions.
 *     partitions = [0, 0, 1, 1, 0]
 *     num_partitions = 2
 *     data = [10, 20, 30, 40, 50]
 *     outputs[0] = [10, 20, 50]
 *     outputs[1] = [30, 40]
 * </pre>
 * <p>See {@code dynamic_stitch} for an example on how to merge partitions back.
 * <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 * <img style="width:100%" src="https://www.tensorflow.org/images/DynamicPartition.png" alt>
 * </div>
 * <p>Raises:
 * <ul>
 * <li>{@code InvalidArgumentError} in following cases:
 * <ul>
 * <li>If partitions is not in range {@code [0, num_partiions)}</li>
 * <li>If {@code partitions.shape} does not match prefix of {@code data.shape} argument.</li>
 * </ul>
 * </li>
 * </ul>
 */
@OpMetadata(
    opType = DynamicPartition.OP_NAME,
    inputsClass = DynamicPartition.Inputs.class
)
@Operator
public final class DynamicPartition<T extends TType> extends RawOp implements Iterable<Operand<T>> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "DynamicPartition";

  private List<Output<T>> outputs;

  @SuppressWarnings("unchecked")
  public DynamicPartition(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    int outputsLength = operation.outputListLength("outputs");
    outputs = Arrays.asList((Output<T>[]) operation.outputList(outputIdx, outputsLength));
    outputIdx += outputsLength;
  }

  /**
   * Factory method to create a class wrapping a new DynamicPartition operation.
   *
   * @param scope current scope
   * @param data The data value
   * @param partitions Any shape.  Indices in the range {@code [0, num_partitions)}.
   * @param numPartitions The number of partitions to output.
   * @param <T> data type for {@code DynamicPartition} output and operands
   * @return a new instance of DynamicPartition
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> DynamicPartition<T> create(Scope scope, Operand<T> data,
      Operand<TInt32> partitions, Long numPartitions) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "DynamicPartition");
    opBuilder.addInput(data.asOutput());
    opBuilder.addInput(partitions.asOutput());
    opBuilder.setAttr("num_partitions", numPartitions);
    return new DynamicPartition<>(opBuilder.build());
  }

  /**
   * Gets outputs.
   *
   * @return outputs.
   */
  public List<Output<T>> outputs() {
    return outputs;
  }

  @Override
  @SuppressWarnings({"rawtypes", "unchecked"})
  public Iterator<Operand<T>> iterator() {
    return (Iterator) outputs.iterator();
  }

  @OpInputsMetadata(
      outputsClass = DynamicPartition.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<DynamicPartition<T>> {
    /**
     * The data input
     */
    public final Operand<T> data;

    /**
     * Any shape.  Indices in the range {@code [0, num_partitions)}.
     */
    public final Operand<TInt32> partitions;

    /**
     * The T attribute
     */
    public final DataType T;

    public Inputs(GraphOperation op) {
      super(new DynamicPartition<>(op), op, Arrays.asList("T"));
      int inputIndex = 0;
      data = (Operand<T>) op.input(inputIndex++);
      partitions = (Operand<TInt32>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
    }
  }
}
