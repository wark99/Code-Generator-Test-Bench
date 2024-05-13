/*
 * AIRBIT IoT Workspace REST API
 * This API is intended to work with the application **AIRBIT IoT Workspace** .
 *
 * The version of the OpenAPI document: 2.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.client.model.AppApiv2ConstansActionPrio1;
import org.openapitools.client.model.ClientId;
import org.openapitools.client.model.CreateSendToAMQPBrokerScheme;
import org.openapitools.client.model.CreateSendToApiLNSScheme;
import org.openapitools.client.model.CreateSendToEmailScheme;
import org.openapitools.client.model.CreateSendToHTTPScheme;
import org.openapitools.client.model.CreateSendToMQTTScheme;
import org.openapitools.client.model.CreateSendToSMSScheme;
import org.openapitools.client.model.CreateSendToTelegramScheme;
import org.openapitools.client.model.DataHex;
import org.openapitools.client.model.Fport;
import org.openapitools.client.model.FromEmail;
import org.openapitools.client.model.Mac;
import org.openapitools.client.model.Qos;
import org.openapitools.client.model.Title1;
import org.openapitools.client.model.Topic;
import org.openapitools.client.model.UpId;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * action parameters
 */
@JsonPropertyOrder({
  ActionParams.JSON_PROPERTY_ACCOUNT,
  ActionParams.JSON_PROPERTY_ACTION_CLASS,
  ActionParams.JSON_PROPERTY_VIRTUAL_HOST,
  ActionParams.JSON_PROPERTY_EXCHANGE,
  ActionParams.JSON_PROPERTY_QUEUE,
  ActionParams.JSON_PROPERTY_DEV_EUI,
  ActionParams.JSON_PROPERTY_UP_ID,
  ActionParams.JSON_PROPERTY_DATA_HEX,
  ActionParams.JSON_PROPERTY_MAC,
  ActionParams.JSON_PROPERTY_FPORT,
  ActionParams.JSON_PROPERTY_CONF,
  ActionParams.JSON_PROPERTY_IMME,
  ActionParams.JSON_PROPERTY_NODEL,
  ActionParams.JSON_PROPERTY_FPEND,
  ActionParams.JSON_PROPERTY_PRIO,
  ActionParams.JSON_PROPERTY_FROM_EMAIL,
  ActionParams.JSON_PROPERTY_RECIPIENT,
  ActionParams.JSON_PROPERTY_SUBJECT,
  ActionParams.JSON_PROPERTY_MESSAGE,
  ActionParams.JSON_PROPERTY_PATH,
  ActionParams.JSON_PROPERTY_AS_JSON,
  ActionParams.JSON_PROPERTY_CLIENT_ID,
  ActionParams.JSON_PROPERTY_TOPIC,
  ActionParams.JSON_PROPERTY_QOS,
  ActionParams.JSON_PROPERTY_RETAIN,
  ActionParams.JSON_PROPERTY_SOURCE,
  ActionParams.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@JsonIgnoreProperties(
  value = "action_class", // ignore manually set action_class, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the action_class to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "action_class", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CreateSendToApiLNSScheme.class, name = "1"),
  @JsonSubTypes.Type(value = CreateSendToAMQPBrokerScheme.class, name = "2"),
  @JsonSubTypes.Type(value = CreateSendToEmailScheme.class, name = "3"),
  @JsonSubTypes.Type(value = CreateSendToHTTPScheme.class, name = "4"),
  @JsonSubTypes.Type(value = CreateSendToMQTTScheme.class, name = "5"),
  @JsonSubTypes.Type(value = CreateSendToSMSScheme.class, name = "6"),
  @JsonSubTypes.Type(value = CreateSendToTelegramScheme.class, name = "7"),
  @JsonSubTypes.Type(value = CreateSendToAMQPBrokerScheme.class, name = "CreateSendToAMQPBrokerScheme"),
  @JsonSubTypes.Type(value = CreateSendToApiLNSScheme.class, name = "CreateSendToApiLNSScheme"),
  @JsonSubTypes.Type(value = CreateSendToEmailScheme.class, name = "CreateSendToEmailScheme"),
  @JsonSubTypes.Type(value = CreateSendToHTTPScheme.class, name = "CreateSendToHTTPScheme"),
  @JsonSubTypes.Type(value = CreateSendToMQTTScheme.class, name = "CreateSendToMQTTScheme"),
  @JsonSubTypes.Type(value = CreateSendToSMSScheme.class, name = "CreateSendToSMSScheme"),
  @JsonSubTypes.Type(value = CreateSendToTelegramScheme.class, name = "CreateSendToTelegramScheme"),
})

public class ActionParams {
  public static final String JSON_PROPERTY_ACCOUNT = "account";
  private Object account = null;

  public static final String JSON_PROPERTY_ACTION_CLASS = "action_class";
  protected Object actionClass = null;

  public static final String JSON_PROPERTY_VIRTUAL_HOST = "virtual_host";
  private Object virtualHost = null;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  private Object exchange = null;

  public static final String JSON_PROPERTY_QUEUE = "queue";
  private Object queue = null;

  public static final String JSON_PROPERTY_DEV_EUI = "dev_eui";
  private Object devEui = null;

  public static final String JSON_PROPERTY_UP_ID = "up_id";
  private UpId upId;

  public static final String JSON_PROPERTY_DATA_HEX = "data_hex";
  private DataHex dataHex;

  public static final String JSON_PROPERTY_MAC = "mac";
  private Mac mac;

  public static final String JSON_PROPERTY_FPORT = "fport";
  private Fport fport;

  public static final String JSON_PROPERTY_CONF = "conf";
  private JsonNullable<Object> conf = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_IMME = "imme";
  private JsonNullable<Object> imme = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_NODEL = "nodel";
  private JsonNullable<Object> nodel = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_FPEND = "fpend";
  private JsonNullable<Object> fpend = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_PRIO = "prio";
  private AppApiv2ConstansActionPrio1 prio = AppApiv2ConstansActionPrio1.NUMBER_0;

  public static final String JSON_PROPERTY_FROM_EMAIL = "from_email";
  private FromEmail fromEmail;

  public static final String JSON_PROPERTY_RECIPIENT = "recipient";
  private Object recipient = null;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private Object subject = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private Object message = null;

  public static final String JSON_PROPERTY_PATH = "path";
  private JsonNullable<Object> path = JsonNullable.<Object>of(/);

  public static final String JSON_PROPERTY_AS_JSON = "as_json";
  private JsonNullable<Object> asJson = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private ClientId clientId;

  public static final String JSON_PROPERTY_TOPIC = "topic";
  private Topic topic;

  public static final String JSON_PROPERTY_QOS = "qos";
  private Qos qos;

  public static final String JSON_PROPERTY_RETAIN = "retain";
  private JsonNullable<Object> retain = JsonNullable.<Object>of(false);

  public static final String JSON_PROPERTY_SOURCE = "source";
  private Object source = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private Title1 title;

  public ActionParams() {
  }

  public ActionParams account(Object account) {
    
    this.account = account;
    return this;
  }

   /**
   * external account id
   * @return account
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getAccount() {
    return account;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccount(Object account) {
    this.account = account;
  }


  public ActionParams actionClass(Object actionClass) {
    
    this.actionClass = actionClass;
    return this;
  }

   /**
   * Get actionClass
   * @return actionClass
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getActionClass() {
    return actionClass;
  }


  @JsonProperty(JSON_PROPERTY_ACTION_CLASS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setActionClass(Object actionClass) {
    this.actionClass = actionClass;
  }


  public ActionParams virtualHost(Object virtualHost) {
    
    this.virtualHost = virtualHost;
    return this;
  }

   /**
   * Virtual host
   * @return virtualHost
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getVirtualHost() {
    return virtualHost;
  }


  @JsonProperty(JSON_PROPERTY_VIRTUAL_HOST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVirtualHost(Object virtualHost) {
    this.virtualHost = virtualHost;
  }


  public ActionParams exchange(Object exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * Exchange
   * @return exchange
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getExchange() {
    return exchange;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchange(Object exchange) {
    this.exchange = exchange;
  }


  public ActionParams queue(Object queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getQueue() {
    return queue;
  }


  @JsonProperty(JSON_PROPERTY_QUEUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQueue(Object queue) {
    this.queue = queue;
  }


  public ActionParams devEui(Object devEui) {
    
    this.devEui = devEui;
    return this;
  }

   /**
   * device id
   * @return devEui
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEV_EUI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getDevEui() {
    return devEui;
  }


  @JsonProperty(JSON_PROPERTY_DEV_EUI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDevEui(Object devEui) {
    this.devEui = devEui;
  }


  public ActionParams upId(UpId upId) {
    
    this.upId = upId;
    return this;
  }

   /**
   * Get upId
   * @return upId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpId getUpId() {
    return upId;
  }


  @JsonProperty(JSON_PROPERTY_UP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpId(UpId upId) {
    this.upId = upId;
  }


  public ActionParams dataHex(DataHex dataHex) {
    
    this.dataHex = dataHex;
    return this;
  }

   /**
   * Get dataHex
   * @return dataHex
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DataHex getDataHex() {
    return dataHex;
  }


  @JsonProperty(JSON_PROPERTY_DATA_HEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataHex(DataHex dataHex) {
    this.dataHex = dataHex;
  }


  public ActionParams mac(Mac mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * Get mac
   * @return mac
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Mac getMac() {
    return mac;
  }


  @JsonProperty(JSON_PROPERTY_MAC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMac(Mac mac) {
    this.mac = mac;
  }


  public ActionParams fport(Fport fport) {
    
    this.fport = fport;
    return this;
  }

   /**
   * Get fport
   * @return fport
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Fport getFport() {
    return fport;
  }


  @JsonProperty(JSON_PROPERTY_FPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFport(Fport fport) {
    this.fport = fport;
  }


  public ActionParams conf(Object conf) {
    this.conf = JsonNullable.<Object>of(conf);
    
    return this;
  }

   /**
   * Send data as confirmed message
   * @return conf
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getConf() {
        return conf.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CONF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getConf_JsonNullable() {
    return conf;
  }
  
  @JsonProperty(JSON_PROPERTY_CONF)
  public void setConf_JsonNullable(JsonNullable<Object> conf) {
    this.conf = conf;
  }

  public void setConf(Object conf) {
    this.conf = JsonNullable.<Object>of(conf);
  }


  public ActionParams imme(Object imme) {
    this.imme = JsonNullable.<Object>of(imme);
    
    return this;
  }

   /**
   * Send data immediate (for Class C or for Class A if up_id specified)
   * @return imme
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getImme() {
        return imme.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getImme_JsonNullable() {
    return imme;
  }
  
  @JsonProperty(JSON_PROPERTY_IMME)
  public void setImme_JsonNullable(JsonNullable<Object> imme) {
    this.imme = imme;
  }

  public void setImme(Object imme) {
    this.imme = JsonNullable.<Object>of(imme);
  }


  public ActionParams nodel(Object nodel) {
    this.nodel = JsonNullable.<Object>of(nodel);
    
    return this;
  }

   /**
   * do not delete from queue after join/rejoin
   * @return nodel
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getNodel() {
        return nodel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NODEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getNodel_JsonNullable() {
    return nodel;
  }
  
  @JsonProperty(JSON_PROPERTY_NODEL)
  public void setNodel_JsonNullable(JsonNullable<Object> nodel) {
    this.nodel = nodel;
  }

  public void setNodel(Object nodel) {
    this.nodel = JsonNullable.<Object>of(nodel);
  }


  public ActionParams fpend(Object fpend) {
    this.fpend = JsonNullable.<Object>of(fpend);
    
    return this;
  }

   /**
   * Set FPending bit for immediate downlink
   * @return fpend
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getFpend() {
        return fpend.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FPEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getFpend_JsonNullable() {
    return fpend;
  }
  
  @JsonProperty(JSON_PROPERTY_FPEND)
  public void setFpend_JsonNullable(JsonNullable<Object> fpend) {
    this.fpend = fpend;
  }

  public void setFpend(Object fpend) {
    this.fpend = JsonNullable.<Object>of(fpend);
  }


  public ActionParams prio(AppApiv2ConstansActionPrio1 prio) {
    
    this.prio = prio;
    return this;
  }

   /**
   * Set priority for send via queue (0-low, 1-middle, 2-hight)
   * @return prio
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppApiv2ConstansActionPrio1 getPrio() {
    return prio;
  }


  @JsonProperty(JSON_PROPERTY_PRIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrio(AppApiv2ConstansActionPrio1 prio) {
    this.prio = prio;
  }


  public ActionParams fromEmail(FromEmail fromEmail) {
    
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Get fromEmail
   * @return fromEmail
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FromEmail getFromEmail() {
    return fromEmail;
  }


  @JsonProperty(JSON_PROPERTY_FROM_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromEmail(FromEmail fromEmail) {
    this.fromEmail = fromEmail;
  }


  public ActionParams recipient(Object recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Message recipient ID (Telegram chat ID)
   * @return recipient
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getRecipient() {
    return recipient;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipient(Object recipient) {
    this.recipient = recipient;
  }


  public ActionParams subject(Object subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Email subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubject(Object subject) {
    this.subject = subject;
  }


  public ActionParams message(Object message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message
   * @return message
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(Object message) {
    this.message = message;
  }


  public ActionParams path(Object path) {
    this.path = JsonNullable.<Object>of(path);
    
    return this;
  }

   /**
   * Path
   * @return path
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getPath() {
        return path.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getPath_JsonNullable() {
    return path;
  }
  
  @JsonProperty(JSON_PROPERTY_PATH)
  public void setPath_JsonNullable(JsonNullable<Object> path) {
    this.path = path;
  }

  public void setPath(Object path) {
    this.path = JsonNullable.<Object>of(path);
  }


  public ActionParams asJson(Object asJson) {
    this.asJson = JsonNullable.<Object>of(asJson);
    
    return this;
  }

   /**
   * If true, then the data is sent as application/json otherwise application/x-www-form-urlencoded
   * @return asJson
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getAsJson() {
        return asJson.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AS_JSON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getAsJson_JsonNullable() {
    return asJson;
  }
  
  @JsonProperty(JSON_PROPERTY_AS_JSON)
  public void setAsJson_JsonNullable(JsonNullable<Object> asJson) {
    this.asJson = asJson;
  }

  public void setAsJson(Object asJson) {
    this.asJson = JsonNullable.<Object>of(asJson);
  }


  public ActionParams clientId(ClientId clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClientId getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(ClientId clientId) {
    this.clientId = clientId;
  }


  public ActionParams topic(Topic topic) {
    
    this.topic = topic;
    return this;
  }

   /**
   * Get topic
   * @return topic
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Topic getTopic() {
    return topic;
  }


  @JsonProperty(JSON_PROPERTY_TOPIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopic(Topic topic) {
    this.topic = topic;
  }


  public ActionParams qos(Qos qos) {
    
    this.qos = qos;
    return this;
  }

   /**
   * Get qos
   * @return qos
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Qos getQos() {
    return qos;
  }


  @JsonProperty(JSON_PROPERTY_QOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQos(Qos qos) {
    this.qos = qos;
  }


  public ActionParams retain(Object retain) {
    this.retain = JsonNullable.<Object>of(retain);
    
    return this;
  }

   /**
   * Retain
   * @return retain
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Object getRetain() {
        return retain.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getRetain_JsonNullable() {
    return retain;
  }
  
  @JsonProperty(JSON_PROPERTY_RETAIN)
  public void setRetain_JsonNullable(JsonNullable<Object> retain) {
    this.retain = retain;
  }

  public void setRetain(Object retain) {
    this.retain = JsonNullable.<Object>of(retain);
  }


  public ActionParams source(Object source) {
    
    this.source = source;
    return this;
  }

   /**
   * Sender phone or string ID
   * @return source
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSource(Object source) {
    this.source = source;
  }


  public ActionParams title(Title1 title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Title1 getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(Title1 title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionParams actionParams = (ActionParams) o;
    return Objects.equals(this.account, actionParams.account) &&
        Objects.equals(this.actionClass, actionParams.actionClass) &&
        Objects.equals(this.virtualHost, actionParams.virtualHost) &&
        Objects.equals(this.exchange, actionParams.exchange) &&
        Objects.equals(this.queue, actionParams.queue) &&
        Objects.equals(this.devEui, actionParams.devEui) &&
        Objects.equals(this.upId, actionParams.upId) &&
        Objects.equals(this.dataHex, actionParams.dataHex) &&
        Objects.equals(this.mac, actionParams.mac) &&
        Objects.equals(this.fport, actionParams.fport) &&
        equalsNullable(this.conf, actionParams.conf) &&
        equalsNullable(this.imme, actionParams.imme) &&
        equalsNullable(this.nodel, actionParams.nodel) &&
        equalsNullable(this.fpend, actionParams.fpend) &&
        Objects.equals(this.prio, actionParams.prio) &&
        Objects.equals(this.fromEmail, actionParams.fromEmail) &&
        Objects.equals(this.recipient, actionParams.recipient) &&
        Objects.equals(this.subject, actionParams.subject) &&
        Objects.equals(this.message, actionParams.message) &&
        equalsNullable(this.path, actionParams.path) &&
        equalsNullable(this.asJson, actionParams.asJson) &&
        Objects.equals(this.clientId, actionParams.clientId) &&
        Objects.equals(this.topic, actionParams.topic) &&
        Objects.equals(this.qos, actionParams.qos) &&
        equalsNullable(this.retain, actionParams.retain) &&
        Objects.equals(this.source, actionParams.source) &&
        Objects.equals(this.title, actionParams.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, actionClass, virtualHost, exchange, queue, devEui, upId, dataHex, mac, fport, hashCodeNullable(conf), hashCodeNullable(imme), hashCodeNullable(nodel), hashCodeNullable(fpend), prio, fromEmail, recipient, subject, message, hashCodeNullable(path), hashCodeNullable(asJson), clientId, topic, qos, hashCodeNullable(retain), source, title);
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
    sb.append("class ActionParams {\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    actionClass: ").append(toIndentedString(actionClass)).append("\n");
    sb.append("    virtualHost: ").append(toIndentedString(virtualHost)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    devEui: ").append(toIndentedString(devEui)).append("\n");
    sb.append("    upId: ").append(toIndentedString(upId)).append("\n");
    sb.append("    dataHex: ").append(toIndentedString(dataHex)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    fport: ").append(toIndentedString(fport)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
    sb.append("    imme: ").append(toIndentedString(imme)).append("\n");
    sb.append("    nodel: ").append(toIndentedString(nodel)).append("\n");
    sb.append("    fpend: ").append(toIndentedString(fpend)).append("\n");
    sb.append("    prio: ").append(toIndentedString(prio)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    asJson: ").append(toIndentedString(asJson)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
    sb.append("    retain: ").append(toIndentedString(retain)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

