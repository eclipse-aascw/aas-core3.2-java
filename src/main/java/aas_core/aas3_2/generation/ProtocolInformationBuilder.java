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

/** Builder for the ProtocolInformation type. */
public class ProtocolInformationBuilder {
  /** The endpoint address as a URL. */
  private String href;

  /**
   * Either scheme of {@link aas_core.aas3_2.types.impl.ProtocolInformation#getHref()} or scheme
   * plus further information.
   *
   * <p>The scheme denotes the highest level of doubtless transmission.
   */
  private String endpointProtocol;

  /**
   * Each entry represents one supported version at this very endpoint, the entry shall be formatted
   * according to the regulations of the protocol specified in the {@link
   * aas_core.aas3_2.types.impl.ProtocolInformation#getHref()}
   */
  private List<String> endpointProtocolVersion;

  /**
   * Allows for referencing sub-protocols that may be used in the context of that endpoint e.g. "OPC
   * Basic SOAP" or UA Binary
   */
  private String subprotocol;

  /**
   * If the sub-protocol field is present, a subprotocol body might be given to hold extra
   * information, e.g. node and namespace in an OPC UA server
   */
  private String subprotocolBody;

  /**
   * If {@link aas_core.aas3_2.types.impl.ProtocolInformation#getSubprotocolBody()} is present, the
   * encoding might be explicitly defined, otherwise it shall default to subprotocols encoding
   * scheme
   */
  private String subprotocolBodyEncoding;

  /**
   * Array of {@link aas_core.aas3_2.types.impl.SecurityAttributeObject}'s. Each attribute has three
   * properties:
   *
   * <p>{@link aas_core.aas3_2.types.impl.SecurityAttributeObject#getType()}: enum security type or
   * standard:
   *
   * <ul>
   *   <li>
   *       <p>{@code NONE};
   *   <li>
   *       <p>{@code RFC_TLSA}, TLSA according to RFC 6698; or
   *   <li>
   *       <p>{@code W3C_DID}, W3C DID document.
   * </ul>
   *
   * <p>{@link aas_core.aas3_2.types.impl.SecurityAttributeObject#getKey()}: security attribute key
   * according to standard definitions of the security type.
   *
   * <p>{@link aas_core.aas3_2.types.impl.SecurityAttributeObject#getValue()}: security attribute
   * value, <em>e.g.</em>, DANE TLSA Resource Record.
   *
   * <p>The {@link aas_core.aas3_2.types.impl.SecurityAttributeObject}'s are treated as possible
   * alternatives (logical "or").
   */
  private List<ISecurityAttributeObject> securityAttributes;

  public ProtocolInformationBuilder(String href) {
    this.href = Objects.requireNonNull(href, "Argument \"href\" must be non-null.");
  }

  public ProtocolInformationBuilder setEndpointProtocol(String endpointProtocol) {
    this.endpointProtocol = endpointProtocol;
    return this;
  }

  public ProtocolInformationBuilder setEndpointProtocolVersion(
      List<String> endpointProtocolVersion) {
    this.endpointProtocolVersion = endpointProtocolVersion;
    return this;
  }

  public ProtocolInformationBuilder setSubprotocol(String subprotocol) {
    this.subprotocol = subprotocol;
    return this;
  }

  public ProtocolInformationBuilder setSubprotocolBody(String subprotocolBody) {
    this.subprotocolBody = subprotocolBody;
    return this;
  }

  public ProtocolInformationBuilder setSubprotocolBodyEncoding(String subprotocolBodyEncoding) {
    this.subprotocolBodyEncoding = subprotocolBodyEncoding;
    return this;
  }

  public ProtocolInformationBuilder setSecurityAttributes(
      List<ISecurityAttributeObject> securityAttributes) {
    this.securityAttributes = securityAttributes;
    return this;
  }

  public ProtocolInformation build() {
    return new ProtocolInformation(
        this.href,
        this.endpointProtocol,
        this.endpointProtocolVersion,
        this.subprotocol,
        this.subprotocolBody,
        this.subprotocolBodyEncoding,
        this.securityAttributes);
  }
}
