// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.Objects;

/** Builder for the Message type. */
public class MessageBuilder {
  /** The message type */
  private MessageTypeEnum messageType;

  /** The message text */
  private String text;

  /** Technology-dependent status or error code */
  private String code;

  /** Identifier to relate several result messages throughout several systems */
  private String correlationId;

  /** Timestamp of the message */
  private String timestamp;

  public MessageBuilder(MessageTypeEnum messageType, String text) {
    this.messageType =
        Objects.requireNonNull(messageType, "Argument \"messageType\" must be non-null.");
    this.text = Objects.requireNonNull(text, "Argument \"text\" must be non-null.");
  }

  public MessageBuilder setCode(String code) {
    this.code = code;
    return this;
  }

  public MessageBuilder setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  public MessageBuilder setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Message build() {
    return new Message(this.messageType, this.text, this.code, this.correlationId, this.timestamp);
  }
}
