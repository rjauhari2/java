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
import org.tensorflow.op.RawOp;
import org.tensorflow.op.RawOpInputs;
import org.tensorflow.op.Scope;
import org.tensorflow.op.annotation.Endpoint;
import org.tensorflow.op.annotation.OpInputsMetadata;
import org.tensorflow.op.annotation.OpMetadata;
import org.tensorflow.op.annotation.Operator;
import org.tensorflow.proto.DataType;
import org.tensorflow.types.family.TNumber;
import org.tensorflow.types.family.TType;

/**
 * Applies sparse updates to a variable reference.
 * This operation computes
 * <pre>
 *     # Scalar indices
 *     ref[indices, ...] = updates[...]
 *
 *     # Vector indices (for each i)
 *     ref[indices[i], ...] = updates[i, ...]
 *
 *     # High rank indices (for each i, ..., j)
 *     ref[indices[i, ..., j], ...] = updates[i, ..., j, ...]
 * </pre>
 * <p>This operation outputs {@code ref} after the update is done.
 * This makes it easier to chain operations that need to use the reset value.
 * <p>If values in {@code ref} is to be updated more than once, because there are
 * duplicate entries in {@code indices}, the order at which the updates happen
 * for each value is undefined.
 * <p>Requires {@code updates.shape = indices.shape + ref.shape[1:]} or {@code updates.shape = []}.
 * <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 * <img style="width:100%" src="https://www.tensorflow.org/images/ScatterUpdate.png" alt>
 * </div>
 * <p>See also {@code tf.batch_scatter_update} and {@code tf.scatter_nd_update}.
 */
@OpMetadata(
    opType = ScatterUpdate.OP_NAME,
    inputsClass = ScatterUpdate.Inputs.class
)
@Operator
public final class ScatterUpdate<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "ScatterUpdate";

  private Output<T> outputRef;

  public ScatterUpdate(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    outputRef = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new ScatterUpdate operation.
   *
   * @param scope current scope
   * @param ref Should be from a {@code Variable} node.
   * @param indices A tensor of indices into the first dimension of {@code ref}.
   * @param updates A tensor of updated values to store in {@code ref}.
   * @param options carries optional attribute values
   * @param <T> data type for {@code ScatterUpdate} output and operands
   * @return a new instance of ScatterUpdate
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> ScatterUpdate<T> create(Scope scope, Operand<T> ref,
      Operand<? extends TNumber> indices, Operand<T> updates, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "ScatterUpdate");
    opBuilder.addInput(ref.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(updates.asOutput());
    if (options != null) {
      for (Options opts : options) {
        if (opts.useLocking != null) {
          opBuilder.setAttr("use_locking", opts.useLocking);
        }
      }
    }
    return new ScatterUpdate<>(opBuilder.build());
  }

  /**
   * Sets the useLocking option.
   *
   * @param useLocking If True, the assignment will be protected by a lock;
   * otherwise the behavior is undefined, but may exhibit less contention.
   * @return this Options instance.
   */
  public static Options useLocking(Boolean useLocking) {
    return new Options().useLocking(useLocking);
  }

  /**
   * Gets outputRef.
   * = Same as {@code ref}.  Returned as a convenience for operations that want
   * to use the updated values after the update is done.
   * @return outputRef.
   */
  public Output<T> outputRef() {
    return outputRef;
  }

  @Override
  public Output<T> asOutput() {
    return outputRef;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.core.ScatterUpdate}
   */
  public static class Options {
    private Boolean useLocking;

    private Options() {
    }

    /**
     * Sets the useLocking option.
     *
     * @param useLocking If True, the assignment will be protected by a lock;
     * otherwise the behavior is undefined, but may exhibit less contention.
     * @return this Options instance.
     */
    public Options useLocking(Boolean useLocking) {
      this.useLocking = useLocking;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = ScatterUpdate.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<ScatterUpdate<T>> {
    /**
     * Should be from a {@code Variable} node.
     */
    public final Operand<T> ref;

    /**
     * A tensor of indices into the first dimension of {@code ref}.
     */
    public final Operand<? extends TNumber> indices;

    /**
     * A tensor of updated values to store in {@code ref}.
     */
    public final Operand<T> updates;

    /**
     * The T attribute
     */
    public final DataType T;

    /**
     * The Tindices attribute
     */
    public final DataType Tindices;

    /**
     * If True, the assignment will be protected by a lock;
     * otherwise the behavior is undefined, but may exhibit less contention.
     */
    public final boolean useLocking;

    public Inputs(GraphOperation op) {
      super(new ScatterUpdate<>(op), op, Arrays.asList("T", "Tindices", "use_locking"));
      int inputIndex = 0;
      ref = (Operand<T>) op.input(inputIndex++);
      indices = (Operand<? extends TNumber>) op.input(inputIndex++);
      updates = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
      Tindices = op.attributes().getAttrType("Tindices");
      useLocking = op.attributes().getAttrBool("use_locking");
    }
  }
}
