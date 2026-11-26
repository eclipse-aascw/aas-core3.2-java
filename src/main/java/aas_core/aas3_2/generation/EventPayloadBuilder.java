// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.Objects;

/** Builder for the EventPayload type. */
public class EventPayloadBuilder {
  /** Reference to the source event element. */
  private IReference source;

  /**
   * {@link aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()} of the source event element,
   * if available
   *
   * <p>It is recommended to use an external reference.
   */
  private IReference sourceSemanticId;

  /** Reference to the referable, which defines the scope of the event. */
  private IReference observableReference;

  /**
   * {@link aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()} of the referable which
   * defines the scope of the event, if available.
   *
   * <p>It is recommended to use an external reference.
   */
  private IReference observableSemanticId;

  /**
   * Information for the outer message infrastructure to schedule the event for the respective
   * communication channel.
   */
  private String topic;

  /**
   * Subject, who/which initiated the creation.
   *
   * <p>This is an external reference.
   */
  private IReference subjectId;

  /** Timestamp in UTC, when this event was triggered. */
  private String timeStamp;

  /** Event-specific payload. */
  private byte[] payload;

  public EventPayloadBuilder(IReference source, IReference observableReference, String timeStamp) {
    this.source = Objects.requireNonNull(source, "Argument \"source\" must be non-null.");
    this.observableReference =
        Objects.requireNonNull(
            observableReference, "Argument \"observableReference\" must be non-null.");
    this.timeStamp = Objects.requireNonNull(timeStamp, "Argument \"timeStamp\" must be non-null.");
  }

  public EventPayloadBuilder setSourceSemanticId(IReference sourceSemanticId) {
    this.sourceSemanticId = sourceSemanticId;
    return this;
  }

  public EventPayloadBuilder setObservableSemanticId(IReference observableSemanticId) {
    this.observableSemanticId = observableSemanticId;
    return this;
  }

  public EventPayloadBuilder setTopic(String topic) {
    this.topic = topic;
    return this;
  }

  public EventPayloadBuilder setSubjectId(IReference subjectId) {
    this.subjectId = subjectId;
    return this;
  }

  public EventPayloadBuilder setPayload(byte[] payload) {
    this.payload = payload;
    return this;
  }

  public EventPayload build() {
    return new EventPayload(
        this.source,
        this.observableReference,
        this.timeStamp,
        this.sourceSemanticId,
        this.observableSemanticId,
        this.topic,
        this.subjectId,
        this.payload);
  }
}
