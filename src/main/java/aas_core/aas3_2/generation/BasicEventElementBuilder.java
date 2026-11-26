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

/** Builder for the BasicEventElement type. */
public class BasicEventElementBuilder {
  /** An extension of the element. */
  private List<IExtension> extensions;

  /**
   * The category is a value that gives further meta information w.r.t. the class of the element. It
   * affects the expected existence of attributes and the applicability of constraints.
   *
   * <p>The category is not identical to the semantic definition ({@link
   * aas_core.aas3_2.types.model.IHasSemantics}) of an element. The category could e.g. denote that
   * the element is a measurement value, whereas the semantic definition of the element would denote
   * that it is the measured temperature.
   *
   * <p>Deprecated.
   */
  private String category;

  /**
   * In case of identifiables, this attribute is a short name of the element. In case of a
   * referable, this ID is an identifying string of the element within its name space.
   *
   * <p>In case the element is a property and the property has a semantic definition ({@link
   * aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()}) conformant to IEC61360 the {@link
   * aas_core.aas3_2.types.model.IReferable#getIdShort()} is typically identical to the short name
   * in English, if available.
   */
  private String idShort;

  /** Display name. Can be provided in several languages. */
  private List<ILangStringNameType> displayName;

  /**
   * Description or comments on the element.
   *
   * <p>The description can be provided in several languages.
   *
   * <p>If no description is defined, the definition of the concept description that defines the
   * semantics of the element is used.
   *
   * <p>Additional information can be provided, e.g., if the element is qualified and which
   * qualifier types can be expected in which context or which additional data specification
   * templates.
   */
  private List<ILangStringTextType> description;

  /**
   * Identifier of the semantic definition of the element. It is called semantic ID of the element
   * or also main semantic ID of the element.
   */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element. It is called supplemental
   * semantic ID of the element.
   */
  private List<IReference> supplementalSemanticIds;

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>Constraints:
   *
   * <ul>
   *   <li>Constraint AASd-021: Every qualifiable shall only have one qualifier with the same {@link
   *       aas_core.aas3_2.types.impl.Qualifier#getType()}.
   * </ul>
   */
  private List<IQualifier> qualifiers;

  /** Embedded data specification. */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  /** Reference to a referable, e.g., a data element or a submodel, that is being observed. */
  private IReference observed;

  /**
   * Direction of event.
   *
   * <p>Can be {@code { Input, Output }}.
   */
  private Direction direction;

  /**
   * State of event.
   *
   * <p>Can be {@code { On, Off }}.
   */
  private StateOfEvent state;

  /**
   * Information for the outer message infrastructure to schedule the event for the respective
   * communication channel.
   */
  private String messageTopic;

  /**
   * Information about which outer message infrastructure shall handle messages for the {@link
   * aas_core.aas3_2.types.model.IEventElement}. Refers to a {@link
   * aas_core.aas3_2.types.impl.Submodel}, {@link aas_core.aas3_2.types.impl.SubmodelElementList},
   * {@link aas_core.aas3_2.types.impl.SubmodelElementCollection} or {@link
   * aas_core.aas3_2.types.impl.Entity}, which contains {@link
   * aas_core.aas3_2.types.model.IDataElement}'s describing the proprietary specification for the
   * message broker.
   *
   * <p>This proprietary specification could be standardized by using respective {@link
   * aas_core.aas3_2.types.impl.Submodel}'s for different message infrastructure, e.g., OPC UA, MQTT
   * or AMQP.
   */
  private IReference messageBroker;

  /**
   * Timestamp in UTC, when the last event was received (input direction) or sent (output
   * direction).
   */
  private String lastUpdate;

  /**
   * For input direction reports on the maximum frequency, the software entity behind the respective
   * {@link aas_core.aas3_2.types.model.IReferable} can handle input events.
   *
   * <p>For output events, the maximum frequency of outputting this event to an outer infrastructure
   * is specified.
   *
   * <p>Might be not specified, i.e. if there is no minimum interval.
   */
  private String minInterval;

  /**
   * Not applicable for input direction.
   *
   * <p>For output direction: maximum interval in time, the respective {@link
   * aas_core.aas3_2.types.model.IReferable} shall send an update of the status of the event, even
   * if no other trigger condition for the event was not met.
   *
   * <p>Might not be specified, i.e. if there is no maximum interval.
   */
  private String maxInterval;

  public BasicEventElementBuilder(IReference observed, Direction direction, StateOfEvent state) {
    this.observed = Objects.requireNonNull(observed, "Argument \"observed\" must be non-null.");
    this.direction = Objects.requireNonNull(direction, "Argument \"direction\" must be non-null.");
    this.state = Objects.requireNonNull(state, "Argument \"state\" must be non-null.");
  }

  public BasicEventElementBuilder setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public BasicEventElementBuilder setCategory(String category) {
    this.category = category;
    return this;
  }

  public BasicEventElementBuilder setIdShort(String idShort) {
    this.idShort = idShort;
    return this;
  }

  public BasicEventElementBuilder setDisplayName(List<ILangStringNameType> displayName) {
    this.displayName = displayName;
    return this;
  }

  public BasicEventElementBuilder setDescription(List<ILangStringTextType> description) {
    this.description = description;
    return this;
  }

  public BasicEventElementBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public BasicEventElementBuilder setSupplementalSemanticIds(
      List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public BasicEventElementBuilder setQualifiers(List<IQualifier> qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

  public BasicEventElementBuilder setEmbeddedDataSpecifications(
      List<IEmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    return this;
  }

  public BasicEventElementBuilder setMessageTopic(String messageTopic) {
    this.messageTopic = messageTopic;
    return this;
  }

  public BasicEventElementBuilder setMessageBroker(IReference messageBroker) {
    this.messageBroker = messageBroker;
    return this;
  }

  public BasicEventElementBuilder setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  public BasicEventElementBuilder setMinInterval(String minInterval) {
    this.minInterval = minInterval;
    return this;
  }

  public BasicEventElementBuilder setMaxInterval(String maxInterval) {
    this.maxInterval = maxInterval;
    return this;
  }

  public BasicEventElement build() {
    return new BasicEventElement(
        this.observed,
        this.direction,
        this.state,
        this.extensions,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
        this.semanticId,
        this.supplementalSemanticIds,
        this.qualifiers,
        this.embeddedDataSpecifications,
        this.messageTopic,
        this.messageBroker,
        this.lastUpdate,
        this.minInterval,
        this.maxInterval);
  }
}
