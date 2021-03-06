package org.keycloak.models;

import java.util.List;

/**
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
public interface KeycloakSession {
    KeycloakTransaction getTransaction();

    RealmModel createRealm(String name);
    RealmModel createRealm(String id, String name);
    RealmModel getRealm(String id);
    List<RealmModel> getRealms(UserModel admin);
    boolean removeRealm(String id);

    void close();
}
