import { EmailNotification } from '../model/emailNotification';
export declare class EmailNotificationsService {
    private token;
    private basePath;
    constructor(basePath: string, token: string);
    /**
     * Creates new form email notification
     * @summary create new form email notification
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    createEmailNotification(body: EmailNotification, realmId: string, metaformId: string): Promise<EmailNotification>;
    /**
     * Deletes an email notification
     * @summary Deletes an email notification
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId Email notification id
    */
    deleteEmailNotification(realmId: string, metaformId: string, emailNotificationId: string): Promise<any>;
    /**
     * Finds single email notification by id
     * @summary Find a single emai notification
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId EmailNotification id
    */
    findEmailNotification(realmId: string, metaformId: string, emailNotificationId: string): Promise<EmailNotification>;
    /**
     * Lists email notifications
     * @summary Lists form email notifications
     * @param realmId realm id
     * @param metaformId Metaform id
    */
    listEmailNotifications(realmId: string, metaformId: string): Promise<Array<EmailNotification>>;
    /**
     * Updates email notification
     * @summary Updates email notification
     * @param body Payload
     * @param realmId realm id
     * @param metaformId Metaform id
     * @param emailNotificationId EmailNotification id
    */
    updateEmailNotification(body: EmailNotification, realmId: string, metaformId: string, emailNotificationId: string): Promise<EmailNotification>;
}
