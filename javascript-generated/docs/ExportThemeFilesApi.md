# MetaformApiClient.ExportThemeFilesApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createExportThemeFile**](ExportThemeFilesApi.md#createExportThemeFile) | **POST** /exportThemes/{exportThemeId}/files | create new export theme file
[**deleteExportThemeFile**](ExportThemeFilesApi.md#deleteExportThemeFile) | **DELETE** /exportThemes/{exportThemeId}/files/{exportThemeFileId} | Deletes an export theme file
[**findExportThemeFile**](ExportThemeFilesApi.md#findExportThemeFile) | **GET** /exportThemes/{exportThemeId}/files/{exportThemeFileId} | Finds single export theme file
[**listExportThemeFiles**](ExportThemeFilesApi.md#listExportThemeFiles) | **GET** /exportThemes/{exportThemeId}/files | Lists files of export theme
[**updateExportThemeFile**](ExportThemeFilesApi.md#updateExportThemeFile) | **PUT** /exportThemes/{exportThemeId}/files/{exportThemeFileId} | Updates export theme file


<a name="createExportThemeFile"></a>
# **createExportThemeFile**
> ExportThemeFile createExportThemeFile(exportThemeId, payload)

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

var apiInstance = new MetaformApiClient.ExportThemeFilesApi();

var exportThemeId = "exportThemeId_example"; // String | export theme id

var payload = new MetaformApiClient.ExportThemeFile(); // ExportThemeFile | Payload

apiInstance.createExportThemeFile(exportThemeId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportThemeId** | **String**| export theme id | 
 **payload** | [**ExportThemeFile**](ExportThemeFile.md)| Payload | 

### Return type

[**ExportThemeFile**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="deleteExportThemeFile"></a>
# **deleteExportThemeFile**
> deleteExportThemeFile(exportThemeId, exportThemeFileId)

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

var apiInstance = new MetaformApiClient.ExportThemeFilesApi();

var exportThemeId = "exportThemeId_example"; // String | export theme id

var exportThemeFileId = "exportThemeFileId_example"; // String | export theme file id

apiInstance.deleteExportThemeFile(exportThemeId, exportThemeFileId).then(function() {
  console.log('API called successfully.');
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportThemeId** | **String**| export theme id | 
 **exportThemeFileId** | **String**| export theme file id | 

### Return type

null (empty response body)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findExportThemeFile"></a>
# **findExportThemeFile**
> ExportThemeFile findExportThemeFile(exportThemeId, exportThemeFileId)

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

var apiInstance = new MetaformApiClient.ExportThemeFilesApi();

var exportThemeId = "exportThemeId_example"; // String | export theme id

var exportThemeFileId = "exportThemeFileId_example"; // String | export theme file id

apiInstance.findExportThemeFile(exportThemeId, exportThemeFileId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
> [ExportThemeFile] listExportThemeFiles(exportThemeId)

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

var apiInstance = new MetaformApiClient.ExportThemeFilesApi();

var exportThemeId = "exportThemeId_example"; // String | export theme id

apiInstance.listExportThemeFiles(exportThemeId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **exportThemeId** | **String**| export theme id | 

### Return type

[**[ExportThemeFile]**](ExportThemeFile.md)

### Authorization

[bearer](../README.md#bearer)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="updateExportThemeFile"></a>
# **updateExportThemeFile**
> ExportThemeFile updateExportThemeFile(exportThemeId, exportThemeFileId, payload)

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

var apiInstance = new MetaformApiClient.ExportThemeFilesApi();

var exportThemeId = "exportThemeId_example"; // String | ExportTheme id

var exportThemeFileId = "exportThemeFileId_example"; // String | ExportThemeFile file id

var payload = new MetaformApiClient.ExportThemeFile(); // ExportThemeFile | Payload

apiInstance.updateExportThemeFile(exportThemeId, exportThemeFileId, payload).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

