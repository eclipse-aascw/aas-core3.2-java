// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import com.fasterxml.jackson.databind.node.ObjectNode;

/** Builder for the AnnotatedRelationshipElementValue type. */
public class AnnotatedRelationshipElementValueBuilder {
  /** Reference to the first element in the relationship. */
  private IReference first;

  /** Reference to the second element in the relationship. */
  private IReference second;

  /** Annotations which hold for the relationship between the two elements. */
  private ObjectNode annotations;

  public AnnotatedRelationshipElementValueBuilder setFirst(IReference first) {
    this.first = first;
    return this;
  }

  public AnnotatedRelationshipElementValueBuilder setSecond(IReference second) {
    this.second = second;
    return this;
  }

  public AnnotatedRelationshipElementValueBuilder setAnnotations(ObjectNode annotations) {
    this.annotations = annotations;
    return this;
  }

  public AnnotatedRelationshipElementValue build() {
    return new AnnotatedRelationshipElementValue(this.first, this.second, this.annotations);
  }
}
