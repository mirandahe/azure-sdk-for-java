// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for Delete operation.
 */
@JacksonXmlRootElement(localName = "Directory-Delete-Headers")
@Fluent
public final class DirectoryDeleteHeaders {
    /*
     * When renaming a directory, the number of paths that are renamed with
     * each invocation is limited. If the number of paths to be renamed exceeds
     * this limit, a continuation token is returned in this response header.
     * When a continuation token is returned in the response, it must be
     * specified in a subsequent invocation of the rename operation to continue
     * renaming the directory.
     */
    @JsonProperty(value = "x-ms-continuation")
    private String marker;

    /*
     * If a client request id header is sent in the request, this header will
     * be present in the response with the same value.
     */
    @JsonProperty(value = "x-ms-client-request-id")
    private String clientRequestId;

    /*
     * A server-generated UUID recorded in the analytics logs for
     * troubleshooting and correlation.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /*
     * The version of the REST protocol used to process the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /*
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * Get the marker property: When renaming a directory, the number of paths
     * that are renamed with each invocation is limited. If the number of paths
     * to be renamed exceeds this limit, a continuation token is returned in
     * this response header. When a continuation token is returned in the
     * response, it must be specified in a subsequent invocation of the rename
     * operation to continue renaming the directory.
     *
     * @return the marker value.
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * Set the marker property: When renaming a directory, the number of paths
     * that are renamed with each invocation is limited. If the number of paths
     * to be renamed exceeds this limit, a continuation token is returned in
     * this response header. When a continuation token is returned in the
     * response, it must be specified in a subsequent invocation of the rename
     * operation to continue renaming the directory.
     *
     * @param marker the marker value to set.
     * @return the DirectoryDeleteHeaders object itself.
     */
    public DirectoryDeleteHeaders setMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the DirectoryDeleteHeaders object itself.
     */
    public DirectoryDeleteHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: A server-generated UUID recorded in the
     * analytics logs for troubleshooting and correlation.
     *
     * @param requestId the requestId value to set.
     * @return the DirectoryDeleteHeaders object itself.
     */
    public DirectoryDeleteHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: The version of the REST protocol used to
     * process the request.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the REST protocol used to
     * process the request.
     *
     * @param version the version value to set.
     * @return the DirectoryDeleteHeaders object itself.
     */
    public DirectoryDeleteHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the DirectoryDeleteHeaders object itself.
     */
    public DirectoryDeleteHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}