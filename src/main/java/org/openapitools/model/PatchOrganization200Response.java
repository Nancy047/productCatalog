package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Characteristic;
import org.openapitools.model.ContactMedium;
import org.openapitools.model.ExternalIdentifier;
import org.openapitools.model.Organization;
import org.openapitools.model.OrganizationChildRelationship;
import org.openapitools.model.OrganizationIdentification;
import org.openapitools.model.OrganizationParentRelationship;
import org.openapitools.model.OrganizationStateType;
import org.openapitools.model.OtherNameOrganization;
import org.openapitools.model.PartyCreditProfile;
import org.openapitools.model.RelatedPartyOrPartyRole;
import org.openapitools.model.TaxExemptionCertificate;
import org.openapitools.model.TimePeriod;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-08T19:14:52.617209500+05:30[Asia/Calcutta]", comments = "Generator version: 7.7.0")
public interface PatchOrganization200Response {
}
