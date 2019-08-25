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
import { ReplyData } from './replyData';
export interface Reply {
    id?: string;
    userId?: string;
    revision?: Date;
    createdAt?: Date;
    modifiedAt?: Date;
    data?: ReplyData;
}
export interface ReplyOpt {
    id?: string;
    userId?: string;
    revision?: Date;
    createdAt?: Date;
    modifiedAt?: Date;
    data?: ReplyData;
}
