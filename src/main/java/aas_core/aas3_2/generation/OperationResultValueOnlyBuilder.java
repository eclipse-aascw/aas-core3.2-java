// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;
import java.util.Objects;

/** Builder for the OperationResultValueOnly type. */
public class OperationResultValueOnlyBuilder {
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
  private ObjectNode outputArguments;

  /** InOutput argument */
  private ObjectNode inoutputArguments;

  public OperationResultValueOnlyBuilder(ExecutionState executionState) {
    this.executionState =
        Objects.requireNonNull(executionState, "Argument \"executionState\" must be non-null.");
  }

  public OperationResultValueOnlyBuilder setMessages(List<IMessage> messages) {
    this.messages = messages;
    return this;
  }

  public OperationResultValueOnlyBuilder setSuccess(Boolean success) {
    this.success = success;
    return this;
  }

  public OperationResultValueOnlyBuilder setOutputArguments(ObjectNode outputArguments) {
    this.outputArguments = outputArguments;
    return this;
  }

  public OperationResultValueOnlyBuilder setInoutputArguments(ObjectNode inoutputArguments) {
    this.inoutputArguments = inoutputArguments;
    return this;
  }

  public OperationResultValueOnly build() {
    return new OperationResultValueOnly(
        this.executionState,
        this.messages,
        this.success,
        this.outputArguments,
        this.inoutputArguments);
  }
}
