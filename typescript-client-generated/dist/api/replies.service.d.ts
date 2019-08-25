import { Reply } from '../model/reply';
export declare class RepliesService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Exports metaform data
     * @summary Exports metaform data
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param format Export results in specified format (XLSX)
    */
    _export(realmId: string, metaformId: string, format: string): Promise<string>;
    /**
     * Creates new form reply
     * @summary create new form reply
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param updateExisting specifies that existing reply should be updated. DEPRECATED, use replymode instead
     * @param replyMode specifies reply mode that will be used. possible values UPDATE, REVISION, CUMULATIVE
    */
    createReply(body: Reply, realmId: string, metaformId: string, updateExisting?: boolean, replyMode?: string): Promise<Reply>;
    /**
     * Deletes a reply
     * @summary Deletes a reply
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    deleteReply(realmId: string, metaformId: string, replyId: string): Promise<any>;
    /**
     * Finds single reply by id
     * @summary Find a single reply
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    findReply(realmId: string, metaformId: string, replyId: string): Promise<Reply>;
    /**
     * Lists form replies
     * @summary Lists form replies
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param userId Filter results by user id. If this parameter is not specified all replies are returned, this requires logged user to have proper permission to do so
     * @param createdBefore Filter results created before specified time
     * @param createdAfter Filter results created after specified time
     * @param modifiedBefore Filter results modified before specified time
     * @param modifiedAfter Filter results modified after specified time
     * @param includeRevisions Specifies that revisions should be included into response
     * @param fields Filter results by field values. Format is field:value, multiple values can be added by using comma separator. E.g. field1&#x3D;value,field2&#x3D;another
     * @param firstResult First index of results to be returned
     * @param maxResults How many items to return at one time
    */
    listReplies(realmId: string, metaformId: string, userId?: string, createdBefore?: string, createdAfter?: string, modifiedBefore?: string, modifiedAfter?: string, includeRevisions?: boolean, fields?: Array<string>, firstResult?: number, maxResults?: number): Promise<Array<Reply>>;
    /**
     * Exports reply data
     * @summary Exports reply data
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
     * @param format Export results in specified format (PDF)
    */
    replyExport(realmId: string, metaformId: string, replyId: string, format: string): Promise<string>;
    /**
     * Updates reply
     * @summary Updates reply
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param replyId Reply id
    */
    updateReply(body: Reply, realmId: string, metaformId: string, replyId: string): Promise<any>;
}
