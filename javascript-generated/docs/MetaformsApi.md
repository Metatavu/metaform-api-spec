# MetaformApiClient.MetaformsApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMetaform**](MetaformsApi.md#createMetaform) | **POST** /realms/{realmId}/metaforms | create new Metaform
[**deleteMetaform**](MetaformsApi.md#deleteMetaform) | **DELETE** /realms/{realmId}/metaforms/{metaformId} | Deletes Metaform
[**findMetaform**](MetaformsApi.md#findMetaform) | **GET** /realms/{realmId}/metaforms/{metaformId} | Finds single Metaform
[**listMetaforms**](MetaformsApi.md#listMetaforms) | **GET** /realms/{realmId}/metaforms | Lists Metaforms
[**updateMetaform**](MetaformsApi.md#updateMetaform) | **PUT** /realms/{realmId}/metaforms/{metaformId} | Updates Metaform


<a name="createMetaform"></a>
# **createMetaform**
> Metaform createMetaform(realmId, payload)

create new Metaform

Creates new Metaform

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.MetaformsApi();

var realmId = "realmId_example"; // String | realm id

var payload = new MetaformApiClient.Metaform(); // Metaform | Payload

apiInstance.createMetaform(realmId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **payload** | [**Metaform**](Metaform.md)| Payload | 

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteMetaform"></a>
# **deleteMetaform**
> deleteMetaform(realmId, metaformId)

Deletes Metaform

Deletes a Metaform

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.MetaformsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

apiInstance.deleteMetaform(realmId, metaformId).then(function() {
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

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findMetaform"></a>
# **findMetaform**
> Metaform findMetaform(realmId, metaformId)

Finds single Metaform

Finds a single Metaform

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.MetaformsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

apiInstance.findMetaform(realmId, metaformId).then(function(data) {
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

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listMetaforms"></a>
# **listMetaforms**
> [Metaform] listMetaforms(realmId)

Lists Metaforms

Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.MetaformsApi();

var realmId = "realmId_example"; // String | realm id

apiInstance.listMetaforms(realmId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 

### Return type

[**[Metaform]**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateMetaform"></a>
# **updateMetaform**
> Metaform updateMetaform(realmId, metaformId, payload)

Updates Metaform

Updates a Metaform

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.MetaformsApi();

var realmId = "realmId_example"; // String | realm id

var metaformId = "metaformId_example"; // String | Metaform id

var payload = new MetaformApiClient.Metaform(); // Metaform | Payload

apiInstance.updateMetaform(realmId, metaformId, payload).then(function(data) {
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
 **payload** | [**Metaform**](Metaform.md)| Payload | 

### Return type

[**Metaform**](Metaform.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

