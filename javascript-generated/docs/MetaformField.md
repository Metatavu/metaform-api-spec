# MetaformApiClient.MetaformField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**visibleIf** | [**MetaformVisibleIf**](MetaformVisibleIf.md) |  | [optional] 
**name** | **String** | Field name | [optional] 
**type** | [**MetaformFieldType**](MetaformFieldType.md) |  | 
**title** | **String** |  | [optional] 
**required** | **Boolean** |  | [optional] 
**contexts** | **[String]** |  | [optional] 
**flags** | [**MetaformFieldFlags**](MetaformFieldFlags.md) |  | [optional] 
**placeholder** | **String** |  | [optional] 
**_class** | **String** |  | [optional] 
**readonly** | **Boolean** |  | [optional] 
**help** | **String** |  | [optional] 
**_default** | **String** | a default value for a field | [optional] 
**min** | **Number** | Minimum value for a field. Only for number fields | [optional] 
**max** | **Number** | Maximum value for a field. Only for number fields | [optional] 
**step** | **Number** | Value step for a field. Only for number fields | [optional] 
**checked** | **Boolean** | Whether checkbox should be checked by default. Only for checkbox fields | [optional] 
**printable** | **Boolean** | Defines whether field is printable or not. Only for table fields | [optional] 
**options** | [**[MetaformFieldOption]**](MetaformFieldOption.md) | Options for radio, checklist, select fields | [optional] 
**sourceUrl** | **String** | Source url for autocomplete and autocomplete-multiple fields | [optional] 
**uploadUrl** | **String** | Upload url for files field. | [optional] 
**singleFile** | **Boolean** | Defines whether file fields allow multiple files or just one | [optional] 
**onlyImages** | **Boolean** | Defines whether file fields allow only images | [optional] 
**maxFileSize** | **Number** | Maximum upload size for image filds | [optional] 
**draggable** | **Boolean** | Defines whether table rows should be draggable. | [optional] 
**columns** | [**[MetaformTableColumn]**](MetaformTableColumn.md) | Columns for table fields | [optional] 
**src** | **String** | Url for logo field. | [optional] 
**text** | **String** | Text for small field. | [optional] 
**html** | **String** | Html code for html field. | [optional] 


