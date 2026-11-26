// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.Objects;

/** Builder for the ValueReferencePair type. */
public class ValueReferencePairBuilder {
  /**
   * The value of the referenced concept definition of the value in {@link
   * aas_core.aas3_2.types.impl.ValueReferencePair#getValueId()}.
   */
  private String value;

  /**
   * Global unique id of the value.
   *
   * <p>It is recommended to use a global reference.
   */
  private IReference valueId;

  public ValueReferencePairBuilder(String value) {
    this.value = Objects.requireNonNull(value, "Argument \"value\" must be non-null.");
  }

  public ValueReferencePairBuilder setValueId(IReference valueId) {
    this.valueId = valueId;
    return this;
  }

  public ValueReferencePair build() {
    return new ValueReferencePair(this.value, this.valueId);
  }
}
