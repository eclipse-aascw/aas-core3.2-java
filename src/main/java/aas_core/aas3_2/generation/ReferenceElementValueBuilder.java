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

/** Builder for the ReferenceElementValue type. */
public class ReferenceElementValueBuilder {
  /**
   * Type of the reference.
   *
   * <p>Denotes whether the reference is an external reference or a model reference.
   */
  private ReferenceTypes type;

  /** Unique references in their name space. */
  private List<IKey> keys;

  /**
   * Expected {@link aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()} of the referenced
   * model element.
   */
  private IReference referredSemanticId;

  public ReferenceElementValueBuilder(ReferenceTypes type, List<IKey> keys) {
    this.type = Objects.requireNonNull(type, "Argument \"type\" must be non-null.");
    this.keys = Objects.requireNonNull(keys, "Argument \"keys\" must be non-null.");
  }

  public ReferenceElementValueBuilder setReferredSemanticId(IReference referredSemanticId) {
    this.referredSemanticId = referredSemanticId;
    return this;
  }

  public ReferenceElementValue build() {
    return new ReferenceElementValue(this.type, this.keys, this.referredSemanticId);
  }
}
