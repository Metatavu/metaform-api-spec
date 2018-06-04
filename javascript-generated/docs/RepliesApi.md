# MetaformApiClient.RepliesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callExport**](RepliesApi.md#callExport) | **GET** /realms/{realmId}/metaforms/{metaformId}/export | Exports metaform data
[**createReply**](RepliesApi.md#createReply) | **POST** /realms/{realmId}/metaforms/{metaformId}/replies | create new form reply
[**deleteReply**](RepliesApi.md#deleteReply) | **DELETE** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Deletes a reply
[**findReply**](RepliesApi.md#findReply) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Find a single reply
[**listReplies**](RepliesApi.md#listReplies) | **GET** /realms/{realmId}/metaforms/{metaformId}/replies | Lists form replies
[**updateReply**](RepliesApi.md#updateReply) | **PUT** /realms/{realmId}/metaforms/{metaformId}/replies/{replyId} | Updates reply


<a name="callExport"></a>
# **callExport**
> &#39;Blob&#39; callExport(realmId, metaformId, format)

Exports metaform data

Exports metaform data

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var format = "format_example"; // String | Export results in specified format (XLSX)

apiInstance.callExport(realmId, metaformId, format).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **format** | **String**| Export results in specified format (XLSX) | 

### Return type

**&#39;Blob&#39;**

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createReply"></a>
# **createReply**
> Reply createReply(realmId, metaformId, payload, opts)

create new form reply

Creates new form reply

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var payload = new MetaformApiClient.Reply(); // Reply | Payload

var opts = { 
  'updateExisting': true, // Boolean | specifies that existing reply should be updated. DEPRECATED, use replymode instead
  'replyMode': "replyMode_example" // String | specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
};
apiInstance.createReply(realmId, metaformId, payload, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **payload** | [**Reply**](Reply.md)| Payload | 
 **updateExisting** | **Boolean**| specifies that existing reply should be updated. DEPRECATED, use replymode instead | [optional] 
 **replyMode** | **String**| specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE | [optional] 

### Return type

[**Reply**](Reply.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteReply"></a>
# **deleteReply**
> deleteReply(realmId, metaformId, replyId)

Deletes a reply

Deletes a reply

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var replyId = "replyId_example"; // String | Reply id

apiInstance.deleteReply(realmId, metaformId, replyId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **replyId** | **String**| Reply id | 

### Return type

null (empty response body)

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
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var replyId = "replyId_example"; // String | Reply id

apiInstance.findReply(realmId, metaformId, replyId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **replyId** | **String**| Reply id | 

### Return type

[**Reply**](Reply.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listReplies"></a>
# **listReplies**
> [Reply] listReplies(realmId, metaformId, opts)

Lists form replies

Lists form replies

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var opts = { 
  'userId': "userId_example", // String | Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
  'createdBefore': "createdBefore_example", // String | Filter results created before specified time
  'createdAfter': "createdAfter_example", // String | Filter results created after specified time
  'modifiedBefore': "modifiedBefore_example", // String | Filter results modified before specified time
  'modifiedAfter': "modifiedAfter_example", // String | Filter results modified after specified time
  'includeRevisions': true, // Boolean | Specifies that revisions should be included into response
  'fields': ["fields_example"] // [String] | Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1=value,field2=another
};
apiInstance.listReplies(realmId, metaformId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **userId** | **String**| Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so | [optional] 
 **createdBefore** | **String**| Filter results created before specified time | [optional] 
 **createdAfter** | **String**| Filter results created after specified time | [optional] 
 **modifiedBefore** | **String**| Filter results modified before specified time | [optional] 
 **modifiedAfter** | **String**| Filter results modified after specified time | [optional] 
 **includeRevisions** | **Boolean**| Specifies that revisions should be included into response | [optional] 
 **fields** | [**[String]**](String.md)| Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another | [optional] 

### Return type

[**[Reply]**](Reply.md)

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
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.RepliesApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var replyId = "replyId_example"; // String | Reply id

var payload = new MetaformApiClient.Reply(); // Reply | Payload

apiInstance.updateReply(realmId, metaformId, replyId, payload).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **metaformId** | **String**| Metaform id | 
 **replyId** | **String**| Reply id | 
 **payload** | [**Reply**](Reply.md)| Payload | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

