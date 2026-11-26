// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.List;

/** Builder for the Result type. */
public class ResultBuilder {
  /** Additional messages containing information for the requester */
  private List<IMessage> messages;

  public ResultBuilder setMessages(List<IMessage> messages) {
    this.messages = messages;
    return this;
  }

  public Result build() {
    return new Result(this.messages);
  }
}
