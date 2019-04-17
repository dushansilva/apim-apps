package org.wso2.carbon.apimgt.rest.api.publisher.v1.factories;

import org.wso2.carbon.apimgt.rest.api.publisher.v1.SettingsApiService;
import org.wso2.carbon.apimgt.rest.api.publisher.v1.impl.SettingsApiServiceImpl;

public class SettingsApiServiceFactory {

   private final static SettingsApiService service = new SettingsApiServiceImpl();

   public static SettingsApiService getSettingsApi()
   {
      return service;
   }
}
