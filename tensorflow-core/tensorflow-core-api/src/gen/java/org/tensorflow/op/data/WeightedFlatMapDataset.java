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

package org.tensorflow.op.data;

import java.util.Arrays;
import java.util.List;
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
import org.tensorflow.proto.DataType;
import org.tensorflow.types.TFloat64;
import org.tensorflow.types.family.TType;

/**
 * The WeightedFlatMapDataset operation
 */
@OpMetadata(
    opType = WeightedFlatMapDataset.OP_NAME,
    inputsClass = WeightedFlatMapDataset.Inputs.class
)
public final class WeightedFlatMapDataset extends RawOp implements Operand<TType> {
  /**
   * The name of this op, as known by TensorFlow core engine
   */
  public static final String OP_NAME = "WeightedFlatMapDataset";

  private Output<? extends TType> handle;

  @SuppressWarnings("unchecked")
  public WeightedFlatMapDataset(Operation operation) {
    super(operation, OP_NAME);
    int outputIdx = 0;
    handle = operation.output(outputIdx++);
  }

  /**
   * Factory method to create a class wrapping a new WeightedFlatMapDataset operation.
   *
   * @param scope current scope
   * @param inputDatasets The inputDatasets value
   * @param weights The weights value
   * @param outputTypes The value of the outputTypes attribute
   * @param outputShapes The value of the outputShapes attribute
   * @param options carries optional attribute values
   * @return a new instance of WeightedFlatMapDataset
   */
  @Endpoint(
      describeByClass = true
  )
  public static WeightedFlatMapDataset create(Scope scope,
      Iterable<Operand<? extends TType>> inputDatasets, Iterable<Operand<TFloat64>> weights,
      List<Class<? extends TType>> outputTypes, List<Shape> outputShapes, Options... options) {
    OperationBuilder opBuilder = scope.opBuilder(OP_NAME, "WeightedFlatMapDataset");
    opBuilder.addInputList(Operands.asOutputs(inputDatasets));
    opBuilder.addInputList(Operands.asOutputs(weights));
    opBuilder.setAttr("output_types", Operands.toDataTypes(outputTypes));
    Shape[] outputShapesArray = new Shape[outputShapes.size()];
    for (int i = 0 ; i < outputShapesArray.length ; i++) {
      outputShapesArray[i] = outputShapes.get(i);
    }
    opBuilder.setAttr("output_shapes", outputShapesArray);
    if (options != null) {
      for (Options opts : options) {
        if (opts.metadata != null) {
          opBuilder.setAttr("metadata", opts.metadata);
        }
      }
    }
    return new WeightedFlatMapDataset(opBuilder.build());
  }

  /**
   * Sets the metadata option.
   *
   * @param metadata the metadata option
   * @return this Options instance.
   */
  public static Options metadata(String metadata) {
    return new Options().metadata(metadata);
  }

  /**
   * Gets handle.
   *
   * @return handle.
   */
  public Output<? extends TType> handle() {
    return handle;
  }

  @Override
  @SuppressWarnings("unchecked")
  public Output<TType> asOutput() {
    return (Output<TType>) handle;
  }

  /**
   * Optional attributes for {@link org.tensorflow.op.data.WeightedFlatMapDataset}
   */
  public static class Options {
    private String metadata;

    private Options() {
    }

    /**
     * Sets the metadata option.
     *
     * @param metadata the metadata option
     * @return this Options instance.
     */
    public Options metadata(String metadata) {
      this.metadata = metadata;
      return this;
    }
  }

  @OpInputsMetadata(
      outputsClass = WeightedFlatMapDataset.class
  )
  public static class Inputs extends RawOpInputs<WeightedFlatMapDataset> {
    /**
     * The inputDatasets input
     */
    public final Iterable<Operand<? extends TType>> inputDatasets;

    /**
     * The weights input
     */
    public final Iterable<Operand<TFloat64>> weights;

    /**
     * The outputTypes attribute
     */
    public final DataType[] outputTypes;

    /**
     * The outputShapes attribute
     */
    public final Shape[] outputShapes;

    /**
     * The metadata attribute
     */
    public final String metadata;

    public Inputs(GraphOperation op) {
      super(new WeightedFlatMapDataset(op), op, Arrays.asList("output_types", "output_shapes", "metadata"));
      int inputIndex = 0;
      int inputDatasetsLength = op.inputListLength("input_datasets");
      inputDatasets = Arrays.asList((Operand<? extends TType>[]) op.inputList(inputIndex, inputDatasetsLength));
      inputIndex += inputDatasetsLength;
      int weightsLength = op.inputListLength("weights");
      weights = Arrays.asList((Operand<TFloat64>[]) op.inputList(inputIndex, weightsLength));
      inputIndex += weightsLength;
      outputTypes = op.attributes().getAttrTypeList("output_types");
      outputShapes = op.attributes().getAttrShapeList("output_shapes");
      metadata = op.attributes().getAttrString("metadata");
    }
  }
}
