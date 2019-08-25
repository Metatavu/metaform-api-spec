import { Attachment } from '../model/attachment';
export declare class AttachmentsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Returns single attachment
     * @summary Find a attachment by id
     * @param realmId realm id
     * @param attachmentId Attachment id
    */
    findAttachment(realmId: string, attachmentId: string): Promise<Attachment>;
    /**
     * Returns attachment data
     * @summary Find a attachment data by id
     * @param realmId realm id
     * @param attachmentId Attachment id
    */
    findAttachmentData(realmId: string, attachmentId: string): Promise<string>;
}
