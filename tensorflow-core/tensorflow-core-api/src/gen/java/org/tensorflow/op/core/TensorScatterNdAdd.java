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
 * Adds sparse {@code updates} to an existing tensor according to {@code indices}.
 * This operation creates a new tensor by adding sparse {@code updates} to the passed
 * in {@code tensor}.
 * This operation is very similar to {@code tf.compat.v1.scatter_nd_add}, except that the
 * updates are added onto an existing tensor (as opposed to a variable). If the
 * memory for the existing tensor cannot be re-used, a copy is made and updated.
 * <p>{@code indices} is an integer tensor containing indices into a new tensor of shape
 * {@code tensor.shape}.  The last dimension of {@code indices} can be at most the rank of
 * {@code tensor.shape}:
 * <pre>
 * indices.shape[-1] &lt;= tensor.shape.rank
 * </pre>
 * <p>The last dimension of {@code indices} corresponds to indices into elements
 * (if {@code indices.shape[-1] = tensor.shape.rank}) or slices
 * (if {@code indices.shape[-1] < tensor.shape.rank}) along dimension
 * {@code indices.shape[-1]} of {@code tensor.shape}.  {@code updates} is a tensor with shape
 * <pre>
 * indices.shape[:-1] + tensor.shape[indices.shape[-1]:]
 * </pre>
 * <p>The simplest form of {@code tensor_scatter_nd_add} is to add individual elements to a
 * tensor by index. For example, say we want to add 4 elements in a rank-1
 * tensor with 8 elements.
 * <p>In Python, this scatter add operation would look like this:
 * <blockquote>
 * <blockquote>
 * <blockquote>
 * <p>indices = tf.constant([[4], [3], [1], [7]])
 * updates = tf.constant([9, 10, 11, 12])
 * tensor = tf.ones([8], dtype=tf.int32)
 * updated = tf.tensor_scatter_nd_add(tensor, indices, updates)
 * updated
 * &lt;tf.Tensor: shape=(8,), dtype=int32,
 * numpy=array([ 1, 12,  1, 11, 10,  1,  1, 13], dtype=int32)&gt;
 * </blockquote>
 * </blockquote>
 * </blockquote>
 * <p>We can also, insert entire slices of a higher rank tensor all at once. For
 * example, if we wanted to insert two slices in the first dimension of a
 * rank-3 tensor with two matrices of new values.
 * <p>In Python, this scatter add operation would look like this:
 * <blockquote>
 * <blockquote>
 * <blockquote>
 * <p>indices = tf.constant([[0], [2]])
 * updates = tf.constant([[[5, 5, 5, 5], [6, 6, 6, 6],
 * ...                         [7, 7, 7, 7], [8, 8, 8, 8]],
 * ...                        [[5, 5, 5, 5], [6, 6, 6, 6],
 * ...                         [7, 7, 7, 7], [8, 8, 8, 8]]])
 * tensor = tf.ones([4, 4, 4],dtype=tf.int32)
 * updated = tf.tensor_scatter_nd_add(tensor, indices, updates)
 * updated
 * &lt;tf.Tensor: shape=(4, 4, 4), dtype=int32,
 * numpy=array([[[6, 6, 6, 6], [7, 7, 7, 7], [8, 8, 8, 8], [9, 9, 9, 9]],
 * [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]],
 * [[6, 6, 6, 6], [7, 7, 7, 7], [8, 8, 8, 8], [9, 9, 9, 9]],
 * [[1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1], [1, 1, 1, 1]]], dtype=int32)&gt;
 * </blockquote>
 * </blockquote>
 * </blockquote>
 * <p>If {@code indices} contains any out-of-bound indices, depending on
 * {@code bad_indices_policy}, the op will either return an error or ignore the
 * out-of-bound indices. {@code bad_indices_policy} can be one of the following values:
 * <ol>
 * <li>&quot;&quot; or &quot;DEFAULT&quot;: raises on CPU and ignore on GPU. This is because
 * historically on CPU and GPU we handle errors in different ways, and for
 * backward compatibility we keep the default behavior.</li>
 * <li>&quot;ERROR&quot;: raises error; GPU does not support this value.</li>
 * <li>&quot;IGNORE&quot;: ignore the bad indices; supported on both CPU and GPU.</li>
 * </ol>
 */
@OpMetadata(
    opType = TensorScatterNdAdd.OP_NAME,
    inputsClass = TensorScatterNdAdd.Inputs.class
)
@Operator
public final class TensorScatterNdAdd<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "TensorScatterAdd";

  private Output<T> output;

  public TensorScatterNdAdd(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new TensorScatterAdd operation.
   *
   * @param scope current scope
   * @param tensor Tensor to copy/update.
   * @param indices Index tensor.
   * @param updates Updates to scatter into output.
   * @param options carries optional attribute values
   * @param <T> data type for {@code TensorScatterAdd} output and operands
   * @return a new instance of TensorScatterNdAdd
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> TensorScatterNdAdd<T> create(Scope scope, Operand<T> tensor,
      Operand<? extends TNumber> indices, Operand<T> updates, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "TensorScatterNdAdd");
    opBuilder.addInput(tensor.asOutput());
    opBuilder.addInput(indices.asOutput());
    opBuilder.addInput(updates.asOutput());
    if (options != null) {
      for (Options opts : options) {
        if (opts.badIndicesPolicy != null) {
          opBuilder.setAttr("bad_indices_policy", opts.badIndicesPolicy);
        }
      }
    }
    return new TensorScatterNdAdd<>(opBuilder.build());
  }

  /**
   * Sets the badIndicesPolicy option.
   *
   * @param badIndicesPolicy the badIndicesPolicy option
   * @return this Options instance.
   */
  public static Options badIndicesPolicy(String badIndicesPolicy) {
    return new Options().badIndicesPolicy(badIndicesPolicy);
  }

  /**
   * Gets output.
   * A new tensor copied from tensor and updates added according to the indices.
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
   * Optional attributes for {@link org.tensorflow.op.core.TensorScatterNdAdd}
   */
  public static class Options {
    private String badIndicesPolicy;

    private Options() {
    }

    /**
     * Sets the badIndicesPolicy option.
     *
     * @param badIndicesPolicy the badIndicesPolicy option
     * @return this Options instance.
     */
    public Options badIndicesPolicy(String badIndicesPolicy) {
      this.badIndicesPolicy = badIndicesPolicy;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = TensorScatterNdAdd.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<TensorScatterNdAdd<T>> {
    /**
     * Tensor to copy/update.
     */
    public final Operand<T> tensor;

    /**
     * Index tensor.
     */
    public final Operand<? extends TNumber> indices;

    /**
     * Updates to scatter into output.
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
     * The badIndicesPolicy attribute
     */
    public final String badIndicesPolicy;

    public Inputs(GraphOperation op) {
      super(new TensorScatterNdAdd<>(op), op, Arrays.asList("T", "Tindices", "bad_indices_policy"));
      int inputIndex = 0;
      tensor = (Operand<T>) op.input(inputIndex++);
      indices = (Operand<? extends TNumber>) op.input(inputIndex++);
      updates = (Operand<T>) op.input(inputIndex++);
      T = op.attributes().getAttrType("T");
      Tindices = op.attributes().getAttrType("Tindices");
      badIndicesPolicy = op.attributes().getAttrString("bad_indices_policy");
    }
  }
}
