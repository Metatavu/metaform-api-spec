import { Metaform } from '../model/metaform';
export declare class MetaformsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Creates new Metaform
     * @summary create new Metaform
     * @param body Payload
     * @param realmId realm id
    */
    createMetaform(body: Metaform, realmId: string): Promise<Metaform>;
    /**
     * Deletes a Metaform
     * @summary Deletes Metaform
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    deleteMetaform(realmId: string, metaformId: string): Promise<any>;
    /**
     * Finds a single Metaform
     * @summary Finds single Metaform
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    findMetaform(realmId: string, metaformId: string): Promise<Metaform>;
    /**
     * Lists Metaforms from the realm. User receives only metaforms where he/she has permission to.
     * @summary Lists Metaforms
     * @param realmId realm id
    */
    listMetaforms(realmId: string): Promise<Array<Metaform>>;
    /**
     * Updates a Metaform
     * @summary Updates Metaform
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    updateMetaform(body: Metaform, realmId: string, metaformId: string): Promise<Metaform>;
}
