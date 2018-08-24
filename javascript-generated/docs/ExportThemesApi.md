# MetaformApiClient.ExportThemesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExportTheme**](ExportThemesApi.md#createExportTheme) | **POST** /realms/{realmId}/exportThemes | create new form export theme
[**createExportThemeFile**](ExportThemesApi.md#createExportThemeFile) | **POST** /realms/{realmId}/exportThemes/{exportThemeId}/files | create new export theme file
[**deleteExportTheme**](ExportThemesApi.md#deleteExportTheme) | **DELETE** /realms/{realmId}/exportThemes/{exportThemeId} | Deletes an export theme
[**deleteExportThemeFile**](ExportThemesApi.md#deleteExportThemeFile) | **DELETE** /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId} | Deletes an export theme file
[**findExportTheme**](ExportThemesApi.md#findExportTheme) | **GET** /realms/{realmId}/exportThemes/{exportThemeId} | Finds single export theme
[**findExportThemeFile**](ExportThemesApi.md#findExportThemeFile) | **GET** /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId} | Finds single export theme file
[**listExportThemeFiles**](ExportThemesApi.md#listExportThemeFiles) | **GET** /realms/{realmId}/exportThemes/{exportThemeId}/files | Lists files of export theme
[**listExportThemes**](ExportThemesApi.md#listExportThemes) | **GET** /realms/{realmId}/exportThemes | Lists form export themes
[**updateExportTheme**](ExportThemesApi.md#updateExportTheme) | **PUT** /realms/{realmId}/exportThemes/{exportThemeId} | Updates export theme
[**updateExportThemeFile**](ExportThemesApi.md#updateExportThemeFile) | **PUT** /realms/{realmId}/exportThemes/{exportThemeId}/files/{exportThemeFileId} | Updates export theme file


<a name="createExportTheme"></a>
# **createExportTheme**
> ExportTheme createExportTheme(realmId, payload)

create new form export theme

Creates new form export theme

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var payload = new MetaformApiClient.ExportTheme(); // ExportTheme | Payload

apiInstance.createExportTheme(realmId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **payload** | [**ExportTheme**](ExportTheme.md)| Payload | 

### Return type

[**ExportTheme**](ExportTheme.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="createExportThemeFile"></a>
# **createExportThemeFile**
> ExportThemeFile createExportThemeFile(realmId, exportThemeId, payload)

create new export theme file

Creates new export theme file

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

var payload = new MetaformApiClient.ExportThemeFile(); // ExportThemeFile | Payload

apiInstance.createExportThemeFile(realmId, exportThemeId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 
 **payload** | [**ExportThemeFile**](ExportThemeFile.md)| Payload | 

### Return type

[**ExportThemeFile**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteExportTheme"></a>
# **deleteExportTheme**
> deleteExportTheme(realmId, exportThemeId)

Deletes an export theme

Deletes an export theme

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

apiInstance.deleteExportTheme(realmId, exportThemeId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteExportThemeFile"></a>
# **deleteExportThemeFile**
> deleteExportThemeFile(realmId, exportThemeId, exportThemeFileId)

Deletes an export theme file

Deletes an export theme file

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

var exportThemeFileId = "exportThemeFileId_example"; // String | export theme file id

apiInstance.deleteExportThemeFile(realmId, exportThemeId, exportThemeFileId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 
 **exportThemeFileId** | **String**| export theme file id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findExportTheme"></a>
# **findExportTheme**
> ExportTheme findExportTheme(realmId, exportThemeId)

Finds single export theme

Finds single export theme

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

apiInstance.findExportTheme(realmId, exportThemeId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 

### Return type

[**ExportTheme**](ExportTheme.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findExportThemeFile"></a>
# **findExportThemeFile**
> ExportThemeFile findExportThemeFile(realmId, exportThemeId, exportThemeFileId)

Finds single export theme file

Finds single export theme file

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

var exportThemeFileId = "exportThemeFileId_example"; // String | export theme file id

apiInstance.findExportThemeFile(realmId, exportThemeId, exportThemeFileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 
 **exportThemeFileId** | **String**| export theme file id | 

### Return type

[**ExportThemeFile**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listExportThemeFiles"></a>
# **listExportThemeFiles**
> [ExportThemeFile] listExportThemeFiles(realmId, exportThemeId)

Lists files of export theme

Lists files of export theme

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | export theme id

apiInstance.listExportThemeFiles(realmId, exportThemeId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| export theme id | 

### Return type

[**[ExportThemeFile]**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listExportThemes"></a>
# **listExportThemes**
> [ExportTheme] listExportThemes(realmId)

Lists form export themes

Lists export themes

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

apiInstance.listExportThemes(realmId).then(function(data) {
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

[**[ExportTheme]**](ExportTheme.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateExportTheme"></a>
# **updateExportTheme**
> ExportTheme updateExportTheme(realmId, exportThemeId, payload)

Updates export theme

Updates export theme

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | ExportTheme id

var payload = new MetaformApiClient.ExportTheme(); // ExportTheme | Payload

apiInstance.updateExportTheme(realmId, exportThemeId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| ExportTheme id | 
 **payload** | [**ExportTheme**](ExportTheme.md)| Payload | 

### Return type

[**ExportTheme**](ExportTheme.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateExportThemeFile"></a>
# **updateExportThemeFile**
> ExportThemeFile updateExportThemeFile(realmId, exportThemeId, exportThemeFileId, payload)

Updates export theme file

Updates export theme file

### Example
```javascript
var MetaformApiClient = require('metaform-api-client');
var defaultClient = MetaformApiClient.ApiClient.instance;

// Configure API key authorization: bearer
var bearer = defaultClient.authentications['bearer'];
bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//bearer.apiKeyPrefix = 'Token';

var apiInstance = new MetaformApiClient.ExportThemesApi();

var realmId = "realmId_example"; // String | realm id

var exportThemeId = "exportThemeId_example"; // String | ExportTheme id

var exportThemeFileId = "exportThemeFileId_example"; // String | ExportThemeFile file id

var payload = new MetaformApiClient.ExportThemeFile(); // ExportThemeFile | Payload

apiInstance.updateExportThemeFile(realmId, exportThemeId, exportThemeFileId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **realmId** | **String**| realm id | 
 **exportThemeId** | **String**| ExportTheme id | 
 **exportThemeFileId** | **String**| ExportThemeFile file id | 
 **payload** | [**ExportThemeFile**](ExportThemeFile.md)| Payload | 

### Return type

[**ExportThemeFile**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

