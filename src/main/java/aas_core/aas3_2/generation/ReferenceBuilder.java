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

/** Builder for the Reference type. */
public class ReferenceBuilder {
  /**
   * Type of the reference.
   *
   * <p>Denotes whether the reference is an external reference or a model reference.
   */
  private ReferenceTypes type;

  /**
   * Expected {@link aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()} of the referenced
   * model element ({@link aas_core.aas3_2.types.impl.Reference#getType()} = {@link
   * aas_core.aas3_2.types.enums.ReferenceTypes#MODEL_REFERENCE}); there typically is no semantic ID
   * for the referenced object of external references ({@link
   * aas_core.aas3_2.types.impl.Reference#getType()} = {@link
   * aas_core.aas3_2.types.enums.ReferenceTypes#EXTERNAL_REFERENCE}).
   *
   * <p>If {@link aas_core.aas3_2.types.impl.Reference#getReferredSemanticId()} is defined, the
   * {@link aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()} of the model element
   * referenced should have a matching semantic ID. If this is not the case, a validator should
   * raise a warning.
   */
  private IReference referredSemanticId;

  /** Unique references in their name space. */
  private List<IKey> keys;

  public ReferenceBuilder(ReferenceTypes type, List<IKey> keys) {
    this.type = Objects.requireNonNull(type, "Argument \"type\" must be non-null.");
    this.keys = Objects.requireNonNull(keys, "Argument \"keys\" must be non-null.");
  }

  public ReferenceBuilder setReferredSemanticId(IReference referredSemanticId) {
    this.referredSemanticId = referredSemanticId;
    return this;
  }

  public Reference build() {
    return new Reference(this.type, this.keys, this.referredSemanticId);
  }
}
