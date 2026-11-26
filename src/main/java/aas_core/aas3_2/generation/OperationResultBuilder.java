// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.List;
import java.util.Objects;

/** Builder for the OperationResult type. */
public class OperationResultBuilder {
  /** Execution state */
  private ExecutionState executionState;

  /** Additional messages containing information for the requester */
  private List<IMessage> messages;

  /**
   * Flag indicating whether the business operation behind the operation was successful (true) or
   * not (false)
   */
  private Boolean success;

  /** Output argument */
  private List<IOperationVariable> outputArguments;

  /** InOutput argument */
  private List<IOperationVariable> inoutputArguments;

  public OperationResultBuilder(ExecutionState executionState) {
    this.executionState =
        Objects.requireNonNull(executionState, "Argument \"executionState\" must be non-null.");
  }

  public OperationResultBuilder setMessages(List<IMessage> messages) {
    this.messages = messages;
    return this;
  }

  public OperationResultBuilder setSuccess(Boolean success) {
    this.success = success;
    return this;
  }

  public OperationResultBuilder setOutputArguments(List<IOperationVariable> outputArguments) {
    this.outputArguments = outputArguments;
    return this;
  }

  public OperationResultBuilder setInoutputArguments(List<IOperationVariable> inoutputArguments) {
    this.inoutputArguments = inoutputArguments;
    return this;
  }

  public OperationResult build() {
    return new OperationResult(
        this.executionState,
        this.messages,
        this.success,
        this.outputArguments,
        this.inoutputArguments);
  }
}
