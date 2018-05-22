# RepliesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReply**](RepliesApi.md#createReply) | **POST** /realms/{realmId}/metaforms/{metaformId}/replies | create new form reply
[**export**](RepliesApi.md#export) | **GET** /realms/{realmId}/metaforms/{metaformId}/export | Exports metaform data
[**findReply**](RepliesApi.md#findReply) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Find a single reply
[**findReplyMeta**](RepliesApi.md#findReplyMeta) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId}/meta | Returns reply meta
[**listReplies**](RepliesApi.md#listReplies) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies | Lists form replies
[**updateReply**](RepliesApi.md#updateReply) | **PUT** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Updates reply


<a name="createReply"></a>
# **createReply**
> createReply(realmId, metaformId, payload, updateExisting)

create new form reply

Creates new form reply

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
Reply payload = new Reply(); // Reply | Payload
Boolean updateExisting = true; // Boolean | specifies that existing reply should be updated
try {
    apiInstance.createReply(realmId, metaformId, payload, updateExisting);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#createReply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **payload** | [**Reply**](Reply.md)| Payload |
 **updateExisting** | **Boolean**| specifies that existing reply should be updated | [optional]

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="export"></a>
# **export**
> byte[] export(realmId, metaformId, format)

Exports metaform data

Exports metaform data

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
String format = "format_example"; // String | Export results in specified format (XLSX)
try {
    byte[] result = apiInstance.export(realmId, metaformId, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#export");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **format** | **String**| Export results in specified format (XLSX) |

### Return type

**byte[]**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findReply"></a>
# **findReply**
> Reply findReply(realmId, metaformId, replyId)

Find a single reply

Finds single reply by id

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
UUID replyId = new UUID(); // UUID | Reply id
try {
    Reply result = apiInstance.findReply(realmId, metaformId, replyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#findReply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **replyId** | **UUID**| Reply id |

### Return type

[**Reply**](Reply.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findReplyMeta"></a>
# **findReplyMeta**
> ReplyMeta findReplyMeta(realmId, metaformId, replyId)

Returns reply meta

Returns meta data from the reply

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
UUID replyId = new UUID(); // UUID | Reply id
try {
    ReplyMeta result = apiInstance.findReplyMeta(realmId, metaformId, replyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#findReplyMeta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **replyId** | **UUID**| Reply id |

### Return type

[**ReplyMeta**](ReplyMeta.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listReplies"></a>
# **listReplies**
> List&lt;Reply&gt; listReplies(realmId, metaformId, userId, createdBefore, createdAfter, modifiedBefore, modifiedAfter)

Lists form replies

Lists form replies

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
UUID userId = new UUID(); // UUID | Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
String createdBefore = "createdBefore_example"; // String | Filter results created before specified time
String createdAfter = "createdAfter_example"; // String | Filter results created after specified time
String modifiedBefore = "modifiedBefore_example"; // String | Filter results modified before specified time
String modifiedAfter = "modifiedAfter_example"; // String | Filter results modified after specified time
try {
    List<Reply> result = apiInstance.listReplies(realmId, metaformId, userId, createdBefore, createdAfter, modifiedBefore, modifiedAfter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#listReplies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **userId** | **UUID**| Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so | [optional]
 **createdBefore** | **String**| Filter results created before specified time | [optional]
 **createdAfter** | **String**| Filter results created after specified time | [optional]
 **modifiedBefore** | **String**| Filter results modified before specified time | [optional]
 **modifiedAfter** | **String**| Filter results modified after specified time | [optional]

### Return type

[**List&lt;Reply&gt;**](Reply.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateReply"></a>
# **updateReply**
> updateReply(realmId, metaformId, replyId, payload)

Updates reply

Updates reply

### Example
```java
// Import classes:
//import fi.metatavu.metaform.ApiClient;
//import fi.metatavu.metaform.ApiException;
//import fi.metatavu.metaform.Configuration;
//import fi.metatavu.metaform.auth.*;
//import fi.metatavu.metaform.client.RepliesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: bearer
ApiKeyAuth bearer = (ApiKeyAuth) defaultClient.getAuthentication("bearer");
bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.setApiKeyPrefix("Token");

RepliesApi apiInstance = new RepliesApi();
String realmId = "realmId_example"; // String | realm id
UUID metaformId = new UUID(); // UUID | Metaform id
UUID replyId = new UUID(); // UUID | Reply id
Reply payload = new Reply(); // Reply | Payload
try {
    apiInstance.updateReply(realmId, metaformId, replyId, payload);
} catch (ApiException e) {
    System.err.println("Exception when calling RepliesApi#updateReply");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id |
 **metaformId** | **UUID**| Metaform id |
 **replyId** | **UUID**| Reply id |
 **payload** | [**Reply**](Reply.md)| Payload |

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

