/*
 * API Reference - Developer tools
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@infomaniak.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.Consumptionressource;
import org.openapitools.client.model.Liveressource;
import org.openapitools.client.model.ViewersRestrictions;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ChannelWithTeamData
 */
@JsonPropertyOrder({
  ChannelWithTeamData.JSON_PROPERTY_CHANNEL_ID,
  ChannelWithTeamData.JSON_PROPERTY_NAME,
  ChannelWithTeamData.JSON_PROPERTY_CREATED_AT,
  ChannelWithTeamData.JSON_PROPERTY_UPDATED_AT,
  ChannelWithTeamData.JSON_PROPERTY_DELETED_AT,
  ChannelWithTeamData.JSON_PROPERTY_DELETED,
  ChannelWithTeamData.JSON_PROPERTY_TYPE,
  ChannelWithTeamData.JSON_PROPERTY_SOURCE_TYPE,
  ChannelWithTeamData.JSON_PROPERTY_REMEMBER_TO_CONFIG,
  ChannelWithTeamData.JSON_PROPERTY_FREE,
  ChannelWithTeamData.JSON_PROPERTY_BLOCKED,
  ChannelWithTeamData.JSON_PROPERTY_MAINTAINED,
  ChannelWithTeamData.JSON_PROPERTY_BLOCKED_AT,
  ChannelWithTeamData.JSON_PROPERTY_MAINTAINED_AT,
  ChannelWithTeamData.JSON_PROPERTY_TAGS,
  ChannelWithTeamData.JSON_PROPERTY_RIGHTS,
  ChannelWithTeamData.JSON_PROPERTY_LIVE,
  ChannelWithTeamData.JSON_PROPERTY_REAL_TYPE,
  ChannelWithTeamData.JSON_PROPERTY_STATUS,
  ChannelWithTeamData.JSON_PROPERTY_CONSUMPTION,
  ChannelWithTeamData.JSON_PROPERTY_RECORDING_STATUS,
  ChannelWithTeamData.JSON_PROPERTY_OPTIONS,
  ChannelWithTeamData.JSON_PROPERTY_DEFAULT_OPTIONS,
  ChannelWithTeamData.JSON_PROPERTY_STREAMS,
  ChannelWithTeamData.JSON_PROPERTY_RESTRICTION,
  ChannelWithTeamData.JSON_PROPERTY_MACHINES,
  ChannelWithTeamData.JSON_PROPERTY_PLAYERS,
  ChannelWithTeamData.JSON_PROPERTY_ORDER,
  ChannelWithTeamData.JSON_PROPERTY_TEAM_DISPLAY_NAME,
  ChannelWithTeamData.JSON_PROPERTY_TEAM_NAME,
  ChannelWithTeamData.JSON_PROPERTY_TEAM_UPDATE_AT,
  ChannelWithTeamData.JSON_PROPERTY_POLICY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChannelWithTeamData {
  public static final String JSON_PROPERTY_CHANNEL_ID = "channel_id";
  private Object channelId = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private Object name = null;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Object createdAt = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Object updatedAt = null;

  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private Object deletedAt = null;

  public static final String JSON_PROPERTY_DELETED = "deleted";
  private Object deleted = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ABR("abr"),
    
    MONO("mono");

    private Object value;

    TypeEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(Object value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type = null;

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    CAMIP("camip"),
    
    ENCODER("encoder"),
    
    MANIAK("maniak"),
    
    MOBILE("mobile"),
    
    WEBCAM("webcam");

    private Object value;

    SourceTypeEnum(Object value) {
      this.value = value;
    }

    @JsonValue
    public Object getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(Object value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_SOURCE_TYPE = "source_type";
  private SourceTypeEnum sourceType = null;

  public static final String JSON_PROPERTY_REMEMBER_TO_CONFIG = "remember_to_config";
  private Object rememberToConfig = null;

  public static final String JSON_PROPERTY_FREE = "free";
  private Object free = null;

  public static final String JSON_PROPERTY_BLOCKED = "blocked";
  private Object blocked = null;

  public static final String JSON_PROPERTY_MAINTAINED = "maintained";
  private Object maintained = null;

  public static final String JSON_PROPERTY_BLOCKED_AT = "blocked_at";
  private Object blockedAt = null;

  public static final String JSON_PROPERTY_MAINTAINED_AT = "maintained_at";
  private Object maintainedAt = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<Object> tags = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RIGHTS = "rights";
  private JsonNullable<Object> rights = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_LIVE = "live";
  private Liveressource live;

  public static final String JSON_PROPERTY_REAL_TYPE = "real_type";
  private Object realType = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Object> status = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_CONSUMPTION = "consumption";
  private Consumptionressource consumption;

  public static final String JSON_PROPERTY_RECORDING_STATUS = "recording_status";
  private JsonNullable<Object> recordingStatus = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private JsonNullable<Object> options = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_DEFAULT_OPTIONS = "default_options";
  private JsonNullable<Object> defaultOptions = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_STREAMS = "streams";
  private JsonNullable<Object> streams = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESTRICTION = "restriction";
  private ViewersRestrictions restriction;

  public static final String JSON_PROPERTY_MACHINES = "machines";
  private JsonNullable<Object> machines = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_PLAYERS = "players";
  private JsonNullable<Object> players = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_ORDER = "order";
  private JsonNullable<Object> order = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_TEAM_DISPLAY_NAME = "team_display_name";
  private String teamDisplayName;

  public static final String JSON_PROPERTY_TEAM_NAME = "team_name";
  private String teamName;

  public static final String JSON_PROPERTY_TEAM_UPDATE_AT = "team_update_at";
  private Integer teamUpdateAt;

  public static final String JSON_PROPERTY_POLICY_ID = "policy_id";
  private String policyId;

  public ChannelWithTeamData() {
  }

  public ChannelWithTeamData channelId(Object channelId) {
    
    this.channelId = channelId;
    return this;
  }

   /**
   * Unique identifier of the &#x60;channel&#x60; that is related to the resource &#x60;Channel&#x60;
   * @return channelId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getChannelId() {
    return channelId;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChannelId(Object channelId) {
    this.channelId = channelId;
  }


  public ChannelWithTeamData name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the resource &#x60;Channel&#x60;
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(Object name) {
    this.name = name;
  }


  public ChannelWithTeamData createdAt(Object createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Timestamp &#x60;Channel&#x60; has been created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Object createdAt) {
    this.createdAt = createdAt;
  }


  public ChannelWithTeamData updatedAt(Object updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Timestamp &#x60;Channel&#x60; has been updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedAt(Object updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ChannelWithTeamData deletedAt(Object deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Timestamp &#x60;Channel&#x60; has been deleted
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeletedAt() {
    return deletedAt;
  }


  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeletedAt(Object deletedAt) {
    this.deletedAt = deletedAt;
  }


  public ChannelWithTeamData deleted(Object deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Boolean &#x60;Channel&#x60; has been deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDeleted() {
    return deleted;
  }


  @JsonProperty(JSON_PROPERTY_DELETED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeleted(Object deleted) {
    this.deleted = deleted;
  }


  public ChannelWithTeamData type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ChannelWithTeamData sourceType(SourceTypeEnum sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SourceTypeEnum getSourceType() {
    return sourceType;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  public ChannelWithTeamData rememberToConfig(Object rememberToConfig) {
    
    this.rememberToConfig = rememberToConfig;
    return this;
  }

   /**
   * Get rememberToConfig
   * @return rememberToConfig
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMEMBER_TO_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRememberToConfig() {
    return rememberToConfig;
  }


  @JsonProperty(JSON_PROPERTY_REMEMBER_TO_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRememberToConfig(Object rememberToConfig) {
    this.rememberToConfig = rememberToConfig;
  }


  public ChannelWithTeamData free(Object free) {
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getFree() {
    return free;
  }


  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFree(Object free) {
    this.free = free;
  }


  public ChannelWithTeamData blocked(Object blocked) {
    
    this.blocked = blocked;
    return this;
  }

   /**
   * Get blocked
   * @return blocked
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBlocked() {
    return blocked;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlocked(Object blocked) {
    this.blocked = blocked;
  }


  public ChannelWithTeamData maintained(Object maintained) {
    
    this.maintained = maintained;
    return this;
  }

   /**
   * Get maintained
   * @return maintained
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTAINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMaintained() {
    return maintained;
  }


  @JsonProperty(JSON_PROPERTY_MAINTAINED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaintained(Object maintained) {
    this.maintained = maintained;
  }


  public ChannelWithTeamData blockedAt(Object blockedAt) {
    
    this.blockedAt = blockedAt;
    return this;
  }

   /**
   * Get blockedAt
   * @return blockedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getBlockedAt() {
    return blockedAt;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockedAt(Object blockedAt) {
    this.blockedAt = blockedAt;
  }


  public ChannelWithTeamData maintainedAt(Object maintainedAt) {
    
    this.maintainedAt = maintainedAt;
    return this;
  }

   /**
   * Get maintainedAt
   * @return maintainedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAINTAINED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMaintainedAt() {
    return maintainedAt;
  }


  @JsonProperty(JSON_PROPERTY_MAINTAINED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaintainedAt(Object maintainedAt) {
    this.maintainedAt = maintainedAt;
  }


  public ChannelWithTeamData tags(Object tags) {
    this.tags = JsonNullable.<Object>of(tags);
    
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getTags() {
        return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getTags_JsonNullable() {
    return tags;
  }
  
  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<Object> tags) {
    this.tags = tags;
  }

  public void setTags(Object tags) {
    this.tags = JsonNullable.<Object>of(tags);
  }


  public ChannelWithTeamData rights(Object rights) {
    this.rights = JsonNullable.<Object>of(rights);
    
    return this;
  }

   /**
   * Get rights
   * @return rights
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRights() {
        return rights.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRights_JsonNullable() {
    return rights;
  }
  
  @JsonProperty(JSON_PROPERTY_RIGHTS)
  public void setRights_JsonNullable(JsonNullable<Object> rights) {
    this.rights = rights;
  }

  public void setRights(Object rights) {
    this.rights = JsonNullable.<Object>of(rights);
  }


  public ChannelWithTeamData live(Liveressource live) {
    
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Liveressource getLive() {
    return live;
  }


  @JsonProperty(JSON_PROPERTY_LIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLive(Liveressource live) {
    this.live = live;
  }


  public ChannelWithTeamData realType(Object realType) {
    
    this.realType = realType;
    return this;
  }

   /**
   * Get realType
   * @return realType
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRealType() {
    return realType;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealType(Object realType) {
    this.realType = realType;
  }


  public ChannelWithTeamData status(Object status) {
    this.status = JsonNullable.<Object>of(status);
    
    return this;
  }

   /**
   * Status of the resource &#x60;Channel&#x60;
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStatus() {
        return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<Object> status) {
    this.status = status;
  }

  public void setStatus(Object status) {
    this.status = JsonNullable.<Object>of(status);
  }


  public ChannelWithTeamData consumption(Consumptionressource consumption) {
    
    this.consumption = consumption;
    return this;
  }

   /**
   * Get consumption
   * @return consumption
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Consumptionressource getConsumption() {
    return consumption;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumption(Consumptionressource consumption) {
    this.consumption = consumption;
  }


  public ChannelWithTeamData recordingStatus(Object recordingStatus) {
    this.recordingStatus = JsonNullable.<Object>of(recordingStatus);
    
    return this;
  }

   /**
   * Get recordingStatus
   * @return recordingStatus
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRecordingStatus() {
        return recordingStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECORDING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRecordingStatus_JsonNullable() {
    return recordingStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_RECORDING_STATUS)
  public void setRecordingStatus_JsonNullable(JsonNullable<Object> recordingStatus) {
    this.recordingStatus = recordingStatus;
  }

  public void setRecordingStatus(Object recordingStatus) {
    this.recordingStatus = JsonNullable.<Object>of(recordingStatus);
  }


  public ChannelWithTeamData options(Object options) {
    this.options = JsonNullable.<Object>of(options);
    
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOptions() {
        return options.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOptions_JsonNullable() {
    return options;
  }
  
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  public void setOptions_JsonNullable(JsonNullable<Object> options) {
    this.options = options;
  }

  public void setOptions(Object options) {
    this.options = JsonNullable.<Object>of(options);
  }


  public ChannelWithTeamData defaultOptions(Object defaultOptions) {
    this.defaultOptions = JsonNullable.<Object>of(defaultOptions);
    
    return this;
  }

   /**
   * Get defaultOptions
   * @return defaultOptions
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getDefaultOptions() {
        return defaultOptions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getDefaultOptions_JsonNullable() {
    return defaultOptions;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_OPTIONS)
  public void setDefaultOptions_JsonNullable(JsonNullable<Object> defaultOptions) {
    this.defaultOptions = defaultOptions;
  }

  public void setDefaultOptions(Object defaultOptions) {
    this.defaultOptions = JsonNullable.<Object>of(defaultOptions);
  }


  public ChannelWithTeamData streams(Object streams) {
    this.streams = JsonNullable.<Object>of(streams);
    
    return this;
  }

   /**
   * Get streams
   * @return streams
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getStreams() {
        return streams.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STREAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getStreams_JsonNullable() {
    return streams;
  }
  
  @JsonProperty(JSON_PROPERTY_STREAMS)
  public void setStreams_JsonNullable(JsonNullable<Object> streams) {
    this.streams = streams;
  }

  public void setStreams(Object streams) {
    this.streams = JsonNullable.<Object>of(streams);
  }


  public ChannelWithTeamData restriction(ViewersRestrictions restriction) {
    
    this.restriction = restriction;
    return this;
  }

   /**
   * Get restriction
   * @return restriction
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ViewersRestrictions getRestriction() {
    return restriction;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestriction(ViewersRestrictions restriction) {
    this.restriction = restriction;
  }


  public ChannelWithTeamData machines(Object machines) {
    this.machines = JsonNullable.<Object>of(machines);
    
    return this;
  }

   /**
   * Get machines
   * @return machines
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getMachines() {
        return machines.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MACHINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMachines_JsonNullable() {
    return machines;
  }
  
  @JsonProperty(JSON_PROPERTY_MACHINES)
  public void setMachines_JsonNullable(JsonNullable<Object> machines) {
    this.machines = machines;
  }

  public void setMachines(Object machines) {
    this.machines = JsonNullable.<Object>of(machines);
  }


  public ChannelWithTeamData players(Object players) {
    this.players = JsonNullable.<Object>of(players);
    
    return this;
  }

   /**
   * Get players
   * @return players
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPlayers() {
        return players.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PLAYERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPlayers_JsonNullable() {
    return players;
  }
  
  @JsonProperty(JSON_PROPERTY_PLAYERS)
  public void setPlayers_JsonNullable(JsonNullable<Object> players) {
    this.players = players;
  }

  public void setPlayers(Object players) {
    this.players = JsonNullable.<Object>of(players);
  }


  public ChannelWithTeamData order(Object order) {
    this.order = JsonNullable.<Object>of(order);
    
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getOrder() {
        return order.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getOrder_JsonNullable() {
    return order;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER)
  public void setOrder_JsonNullable(JsonNullable<Object> order) {
    this.order = order;
  }

  public void setOrder(Object order) {
    this.order = JsonNullable.<Object>of(order);
  }


  public ChannelWithTeamData teamDisplayName(String teamDisplayName) {
    
    this.teamDisplayName = teamDisplayName;
    return this;
  }

   /**
   * The display name of the team to which this channel belongs.
   * @return teamDisplayName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamDisplayName() {
    return teamDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamDisplayName(String teamDisplayName) {
    this.teamDisplayName = teamDisplayName;
  }


  public ChannelWithTeamData teamName(String teamName) {
    
    this.teamName = teamName;
    return this;
  }

   /**
   * The name of the team to which this channel belongs.
   * @return teamName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamName() {
    return teamName;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }


  public ChannelWithTeamData teamUpdateAt(Integer teamUpdateAt) {
    
    this.teamUpdateAt = teamUpdateAt;
    return this;
  }

   /**
   * The time at which the team to which this channel belongs was last updated.
   * @return teamUpdateAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTeamUpdateAt() {
    return teamUpdateAt;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_UPDATE_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamUpdateAt(Integer teamUpdateAt) {
    this.teamUpdateAt = teamUpdateAt;
  }


  public ChannelWithTeamData policyId(String policyId) {
    
    this.policyId = policyId;
    return this;
  }

   /**
   * The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the &#x60;sysconsole_read_compliance_data_retention&#x60; permission, this field will be null.
   * @return policyId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyId() {
    return policyId;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelWithTeamData channelWithTeamData = (ChannelWithTeamData) o;
    return Objects.equals(this.channelId, channelWithTeamData.channelId) &&
        Objects.equals(this.name, channelWithTeamData.name) &&
        Objects.equals(this.createdAt, channelWithTeamData.createdAt) &&
        Objects.equals(this.updatedAt, channelWithTeamData.updatedAt) &&
        Objects.equals(this.deletedAt, channelWithTeamData.deletedAt) &&
        Objects.equals(this.deleted, channelWithTeamData.deleted) &&
        Objects.equals(this.type, channelWithTeamData.type) &&
        Objects.equals(this.sourceType, channelWithTeamData.sourceType) &&
        Objects.equals(this.rememberToConfig, channelWithTeamData.rememberToConfig) &&
        Objects.equals(this.free, channelWithTeamData.free) &&
        Objects.equals(this.blocked, channelWithTeamData.blocked) &&
        Objects.equals(this.maintained, channelWithTeamData.maintained) &&
        Objects.equals(this.blockedAt, channelWithTeamData.blockedAt) &&
        Objects.equals(this.maintainedAt, channelWithTeamData.maintainedAt) &&
        equalsNullable(this.tags, channelWithTeamData.tags) &&
        equalsNullable(this.rights, channelWithTeamData.rights) &&
        Objects.equals(this.live, channelWithTeamData.live) &&
        Objects.equals(this.realType, channelWithTeamData.realType) &&
        equalsNullable(this.status, channelWithTeamData.status) &&
        Objects.equals(this.consumption, channelWithTeamData.consumption) &&
        equalsNullable(this.recordingStatus, channelWithTeamData.recordingStatus) &&
        equalsNullable(this.options, channelWithTeamData.options) &&
        equalsNullable(this.defaultOptions, channelWithTeamData.defaultOptions) &&
        equalsNullable(this.streams, channelWithTeamData.streams) &&
        Objects.equals(this.restriction, channelWithTeamData.restriction) &&
        equalsNullable(this.machines, channelWithTeamData.machines) &&
        equalsNullable(this.players, channelWithTeamData.players) &&
        equalsNullable(this.order, channelWithTeamData.order) &&
        Objects.equals(this.teamDisplayName, channelWithTeamData.teamDisplayName) &&
        Objects.equals(this.teamName, channelWithTeamData.teamName) &&
        Objects.equals(this.teamUpdateAt, channelWithTeamData.teamUpdateAt) &&
        Objects.equals(this.policyId, channelWithTeamData.policyId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, name, createdAt, updatedAt, deletedAt, deleted, type, sourceType, rememberToConfig, free, blocked, maintained, blockedAt, maintainedAt, hashCodeNullable(tags), hashCodeNullable(rights), live, realType, hashCodeNullable(status), consumption, hashCodeNullable(recordingStatus), hashCodeNullable(options), hashCodeNullable(defaultOptions), hashCodeNullable(streams), restriction, hashCodeNullable(machines), hashCodeNullable(players), hashCodeNullable(order), teamDisplayName, teamName, teamUpdateAt, policyId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelWithTeamData {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    rememberToConfig: ").append(toIndentedString(rememberToConfig)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    maintained: ").append(toIndentedString(maintained)).append("\n");
    sb.append("    blockedAt: ").append(toIndentedString(blockedAt)).append("\n");
    sb.append("    maintainedAt: ").append(toIndentedString(maintainedAt)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    realType: ").append(toIndentedString(realType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    consumption: ").append(toIndentedString(consumption)).append("\n");
    sb.append("    recordingStatus: ").append(toIndentedString(recordingStatus)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    defaultOptions: ").append(toIndentedString(defaultOptions)).append("\n");
    sb.append("    streams: ").append(toIndentedString(streams)).append("\n");
    sb.append("    restriction: ").append(toIndentedString(restriction)).append("\n");
    sb.append("    machines: ").append(toIndentedString(machines)).append("\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    teamDisplayName: ").append(toIndentedString(teamDisplayName)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    teamUpdateAt: ").append(toIndentedString(teamUpdateAt)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

