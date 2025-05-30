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
 * Gather slices from {@code params} into a Tensor with shape specified by {@code indices}.
 * {@code indices} is a K-dimensional integer tensor, best thought of as a
 * (K-1)-dimensional tensor of indices into {@code params}, where each element defines a
 * slice of {@code params}:
 * <pre>
 * output[\\(i_0, ..., i_{K-2}\\)] = params[indices[\\(i_0, ..., i_{K-2}\\)]]
 * </pre>
 * <p>Whereas in {@code tf.gather} {@code indices} defines slices into the {@code axis}
 * dimension of {@code params}, in {@code tf.gather_nd}, {@code indices} defines slices into the
 * first {@code N} dimensions of {@code params}, where {@code N = indices.shape[-1]}.
 * <p>The last dimension of {@code indices} can be at most the rank of
 * {@code params}:
 * <pre>
 * indices.shape[-1] &lt;= params.rank
 * </pre>
 * <p>The last dimension of {@code indices} corresponds to elements
 * (if {@code indices.shape[-1] == params.rank}) or slices
 * (if {@code indices.shape[-1] < params.rank}) along dimension {@code indices.shape[-1]}
 * of {@code params}.  The output tensor has shape
 * <pre>
 * indices.shape[:-1] + params.shape[indices.shape[-1]:]
 * </pre>
 * <p>If {@code indices} contains any out-of-bound indices, depending on
 * {@code bad_indices_policy}, the op will either return an error or ignore the
 * out-of-bound indices. {@code bad_indices_policy} can be one of the following values:
 * <ol>
 * <li>&quot;&quot; or &quot;DEFAULT&quot;: raises on CPU and ignore on GPU. This is because
 * historically on CPU and GPU we handle errors in different ways, and for
 * backward compatibility we keep the default behavior.</li>
 * <li>&quot;ERROR&quot;: raises error; GPU does not support this value.</li>
 * <li>&quot;IGNORE&quot;: ignore error and set the corresponding output to 0;
 * supported on both CPU and GPU.</li>
 * </ol>
 * <p>Some examples below.
 * <p>Simple indexing into a matrix:
 * <pre>
 *     indices = [[0, 0], [1, 1]]
 *     params = [['a', 'b'], ['c', 'd']]
 *     output = ['a', 'd']
 * </pre>
 * <p>Slice indexing into a matrix:
 * <pre>
 *     indices = [[1], [0]]
 *     params = [['a', 'b'], ['c', 'd']]
 *     output = [['c', 'd'], ['a', 'b']]
 * </pre>
 * <p>Indexing into a 3-tensor:
 * <pre>
 *     indices = [[1]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = [[['a1', 'b1'], ['c1', 'd1']]]
 *
 *
 *     indices = [[0, 1], [1, 0]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = [['c0', 'd0'], ['a1', 'b1']]
 *
 *
 *     indices = [[0, 0, 1], [1, 0, 1]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = ['b0', 'b1']
 * </pre>
 * <p>Batched indexing into a matrix:
 * <pre>
 *     indices = [[[0, 0]], [[0, 1]]]
 *     params = [['a', 'b'], ['c', 'd']]
 *     output = [['a'], ['b']]
 * </pre>
 * <p>Batched slice indexing into a matrix:
 * <pre>
 *     indices = [[[1]], [[0]]]
 *     params = [['a', 'b'], ['c', 'd']]
 *     output = [[['c', 'd']], [['a', 'b']]]
 * </pre>
 * <p>Batched indexing into a 3-tensor:
 * <pre>
 *     indices = [[[1]], [[0]]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = [[[['a1', 'b1'], ['c1', 'd1']]],
 *               [[['a0', 'b0'], ['c0', 'd0']]]]
 *
 *     indices = [[[0, 1], [1, 0]], [[0, 0], [1, 1]]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = [[['c0', 'd0'], ['a1', 'b1']],
 *               [['a0', 'b0'], ['c1', 'd1']]]
 *
 *
 *     indices = [[[0, 0, 1], [1, 0, 1]], [[0, 1, 1], [1, 1, 0]]]
 *     params = [[['a0', 'b0'], ['c0', 'd0']],
 *               [['a1', 'b1'], ['c1', 'd1']]]
 *     output = [['b0', 'b1'], ['d0', 'c1']]
 * </pre>
 * <p>See also {@code tf.gather} and {@code tf.batch_gather}.
 */
@OpMetadata(
    opType = GatherNd.OP_NAME,
    inputsClass = GatherNd.Inputs.class
)
@Operator
public final class GatherNd<T extends TType> extends RawOp implements Operand<T> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "GatherNd";

  private Output<T> output;

  public GatherNd(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    output = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new GatherNd operation.
   *
   * @param scope current scope
   * @param params The tensor from which to gather values.
   * @param indices Index tensor.
   * @param options carries optional attribute values
   * @param <T> data type for {@code GatherNd} output and operands
   * @return a new instance of GatherNd
   */
  @Endpoint(
      describeByClass = true
  )
  public static <T extends TType> GatherNd<T> create(Scope scope, Operand<T> params,
      Operand<? extends TNumber> indices, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "GatherNd");
    opBuilder.addInput(params.asOutput());
    opBuilder.addInput(indices.asOutput());
    if (options != null) {
      for (Options opts : options) {
        if (opts.badIndicesPolicy != null) {
          opBuilder.setAttr("bad_indices_policy", opts.badIndicesPolicy);
        }
      }
    }
    return new GatherNd<>(opBuilder.build());
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
   * Values from {@code params} gathered from indices given by {@code indices}, with
   * shape {@code indices.shape[:-1] + params.shape[indices.shape[-1]:]}.
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
   * Optional attributes for {@link org.tensorflow.op.core.GatherNd}
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
      outputsClass = GatherNd.class
  )
  public static class Inputs<T extends TType> extends RawOpInputs<GatherNd<T>> {
    /**
     * The tensor from which to gather values.
     */
    public final Operand<T> params;

    /**
     * Index tensor.
     */
    public final Operand<? extends TNumber> indices;

    /**
     * The Tparams attribute
     */
    public final DataType Tparams;

    /**
     * The Tindices attribute
     */
    public final DataType Tindices;

    /**
     * The badIndicesPolicy attribute
     */
    public final String badIndicesPolicy;

    public Inputs(GraphOperation op) {
      super(new GatherNd<>(op), op, Arrays.asList("Tparams", "Tindices", "bad_indices_policy"));
      int inputIndex = 0;
      params = (Operand<T>) op.input(inputIndex++);
      indices = (Operand<? extends TNumber>) op.input(inputIndex++);
      Tparams = op.attributes().getAttrType("Tparams");
      Tindices = op.attributes().getAttrType("Tindices");
      badIndicesPolicy = op.attributes().getAttrString("bad_indices_policy");
    }
  }
}
