// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

/** Builder for the OperationRequestValueOnly type. */
public class OperationRequestValueOnlyBuilder {
  /** Input argument */
  private ObjectNode inputArguments;

  /** InOutput argument */
  private ObjectNode inoutputArguments;

  /**
   * Duration indicating when the client suggests the server to have finished execution of the
   * invoked operation. The server may take this value into account to decide on its effective
   * timeout, however, the server may or may not use by its own discretion.
   */
  private String clientTimeoutDuration;

  public OperationRequestValueOnlyBuilder setInputArguments(ObjectNode inputArguments) {
    this.inputArguments = inputArguments;
    return this;
  }

  public OperationRequestValueOnlyBuilder setInoutputArguments(ObjectNode inoutputArguments) {
    this.inoutputArguments = inoutputArguments;
    return this;
  }

  public OperationRequestValueOnlyBuilder setClientTimeoutDuration(String clientTimeoutDuration) {
    this.clientTimeoutDuration = clientTimeoutDuration;
    return this;
  }

  public OperationRequestValueOnly build() {
    return new OperationRequestValueOnly(
        this.inputArguments, this.inoutputArguments, this.clientTimeoutDuration);
  }
}
