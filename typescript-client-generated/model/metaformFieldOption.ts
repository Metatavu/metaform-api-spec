/**
 * Metaform REST API
 * REST API for Metaform
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


/**
 * Option object for Metaform field
 */
export interface MetaformFieldOption { 
    /**
     * Option name
     */
    name: string;
    /**
     * Option text
     */
    text: string;
    /**
     * Defines whether option should be checked by default.
     */
    checked?: boolean;
    /**
     * Defines whether option should be selected by default.
     */
    selected?: boolean;
}
export interface MetaformFieldOptionOpt { 
    /**
     * Option name
     */
    name?: string;
    /**
     * Option text
     */
    text?: string;
    /**
     * Defines whether option should be checked by default.
     */
    checked?: boolean;
    /**
     * Defines whether option should be selected by default.
     */
    selected?: boolean;
}
