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

/** Builder for the OperationRequestAsync type. */
public class OperationRequestAsyncBuilder {
  /** Input argument */
  private List<IOperationVariable> inputArguments;

  /** InOutput argument */
  private List<IOperationVariable> inoutputArguments;

  /**
   * Duration indicating when the client suggests the server to have finished execution of the
   * invoked operation. The server may take this value into account to decide on its effective
   * timeout, however, the server may or may not use by its own discretion.
   */
  private String clientTimeoutDuration;

  public OperationRequestAsyncBuilder(String clientTimeoutDuration) {
    this.clientTimeoutDuration =
        Objects.requireNonNull(
            clientTimeoutDuration, "Argument \"clientTimeoutDuration\" must be non-null.");
  }

  public OperationRequestAsyncBuilder setInputArguments(List<IOperationVariable> inputArguments) {
    this.inputArguments = inputArguments;
    return this;
  }

  public OperationRequestAsyncBuilder setInoutputArguments(
      List<IOperationVariable> inoutputArguments) {
    this.inoutputArguments = inoutputArguments;
    return this;
  }

  public OperationRequestAsync build() {
    return new OperationRequestAsync(
        this.clientTimeoutDuration, this.inputArguments, this.inoutputArguments);
  }
}
